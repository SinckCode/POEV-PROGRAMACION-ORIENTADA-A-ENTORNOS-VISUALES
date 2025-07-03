using System;
using System.Collections.Generic;
using System.Windows.Forms;

namespace JuegoMemorama
{
    public partial class Form1 : Form
    {
        private const int NUMERO_PARES = 8;
        private List<int> indicesCartas;
        private List<int> indicesParejasEncontradas;
        private Button cartaSeleccionada;
        private bool permitirSeleccion = true;

        public Form1()
        {
            InitializeComponent();
            InicializarJuego();
        }

        private void InicializarJuego()
        {
            indicesCartas = new List<int>();
            indicesParejasEncontradas = new List<int>();
            permitirSeleccion = true;

            // Llenar lista con índices de cartas
            for (int i = 0; i < NUMERO_PARES * 2; i++)
            {
                indicesCartas.Add(i % NUMERO_PARES);
            }

            // Barajar las cartas
            Random rnd = new Random();
            for (int i = 0; i < indicesCartas.Count; i++)
            {
                int temp = indicesCartas[i];
                int randomIndex = rnd.Next(i, indicesCartas.Count);
                indicesCartas[i] = indicesCartas[randomIndex];
                indicesCartas[randomIndex] = temp;
            }

            // Crear botones para las cartas
            tableLayoutPanel1.Controls.Clear();
            for (int i = 0; i < NUMERO_PARES * 2; i++)
            {
                Button button = new Button();
                button.Tag = indicesCartas[i]; // Asignar tag para identificar la carta
                button.Text = "Carta";
                button.Dock = DockStyle.Fill;
                button.Margin = new Padding(5);
                button.Click += Carta_Click;
                tableLayoutPanel1.Controls.Add(button);
            }
        }

        private void Carta_Click(object sender, EventArgs e)
        {
            if (!permitirSeleccion)
                return;

            Button button = sender as Button;
            if (button != null)
            {
                button.Text = ObtenerTextoCarta((int)button.Tag);

                if (cartaSeleccionada == null)
                {
                    cartaSeleccionada = button;
                }
                else
                {
                    permitirSeleccion = false;
                    if ((int)cartaSeleccionada.Tag == (int)button.Tag)
                    {
                        // Pareja encontrada
                        indicesParejasEncontradas.Add((int)cartaSeleccionada.Tag);
                        indicesParejasEncontradas.Add((int)button.Tag);

                        cartaSeleccionada.Enabled = false;
                        button.Enabled = false;

                        cartaSeleccionada = null;

                        // Verificar si se encontraron todas las parejas
                        if (indicesParejasEncontradas.Count == NUMERO_PARES * 2)
                        {
                            MessageBox.Show("¡Felicidades, has encontrado todas las parejas!", "Victoria");
                            InicializarJuego();
                        }
                        else
                        {
                            permitirSeleccion = true;
                        }
                    }
                    else
                    {
                        // Esperar un momento y voltear las cartas
                        Timer timer = new Timer();
                        timer.Interval = 1000;
                        timer.Tick += (s, ev) =>
                        {
                            cartaSeleccionada.Text = "Carta";
                            button.Text = "Carta";
                            cartaSeleccionada = null;
                            permitirSeleccion = true;
                            timer.Stop();
                            timer.Dispose();
                        };
                        timer.Start();
                    }
                }
            }
        }

        private string ObtenerTextoCarta(int indice)
        {
            // Aquí puedes implementar la lógica para mostrar el contenido de la carta según su índice
            // Por ejemplo, puedes tener una lista de imágenes y asignar la imagen correspondiente al índice
            return "Carta " + (indice + 1);
        }
    }
}
