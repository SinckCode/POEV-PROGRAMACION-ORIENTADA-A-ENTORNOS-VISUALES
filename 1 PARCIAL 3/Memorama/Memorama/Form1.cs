using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Windows.Forms;

namespace Memorama
{
    public partial class Form1 : Form
    {
        int TamanioColumnasFilas = 4;
        int Movimientos = 0;
        int CantidadCartasVolteadas = 0;
        List<string> CartasEnumeradas;
        List<string> CartasRevueltas;
        List<PictureBox> CartasSeleccionadas;
        PictureBox CartaTemporal1;
        PictureBox CartaTemporal2;
        int CartaActual = 0;


        public Form1()
        {
            InitializeComponent();
            iniciarJuego();
        }

        public void iniciarJuego()
        {
            timer1.Enabled = false;
            lblRecord.Text = "0";
            CantidadCartasVolteadas = 0;
            Movimientos = 0;
            PanelJuego.Controls.Clear();
            CartasEnumeradas = new List<string>();
            CartasRevueltas = new List<string>();
            CartasSeleccionadas = new List<PictureBox>();

            for (int i = 0; i < 8; i++)
            {
                CartasEnumeradas.Add(i.ToString());
                CartasEnumeradas.Add(i.ToString());
            }

            var NumeroAletorio = new Random();
            CartasRevueltas = CartasEnumeradas.OrderBy(item => NumeroAletorio.Next()).ToList();

            var tablaPanel = new TableLayoutPanel();
            tablaPanel.RowCount = TamanioColumnasFilas;
            tablaPanel.ColumnCount = TamanioColumnasFilas;

            for (int i = 0; i < TamanioColumnasFilas; i++)
            {
                var Porcentaje = 150f / (float)TamanioColumnasFilas - 10;
                tablaPanel.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, Porcentaje));
                tablaPanel.RowStyles.Add(new RowStyle(SizeType.Percent, Porcentaje));
            }

            int contadorFichas = 1;

            for (var i = 0; i < TamanioColumnasFilas; i++)
            {
                for (var j = 0; j < TamanioColumnasFilas; j++)
                {
                    var CartasJuego = new PictureBox();
                    CartasJuego.Name = string.Format("{0}", contadorFichas);
                    CartasJuego.Dock = DockStyle.Fill;
                    CartasJuego.SizeMode = PictureBoxSizeMode.StretchImage;
                    CartasJuego.Image = Properties.Resources.back;
                    CartasJuego.Cursor = Cursors.Hand;
                    CartasJuego.Click += btnCarta_Click;
                    tablaPanel.Controls.Add(CartasJuego, j, i);
                    contadorFichas++;
                }
            }

            tablaPanel.Dock = DockStyle.Fill;
            PanelJuego.Controls.Add(tablaPanel);
        }

        private void btnReiniciar_Click(object sender, EventArgs e)
        {
            iniciarJuego();
        }

        private void btnCarta_Click(object sender, EventArgs e)
        {
            if (CartasSeleccionadas.Count < 2)
            {
                Movimientos++;
                lblRecord.Text = Convert.ToString(Movimientos);
                var CartasSeleccionadasUsuario = (PictureBox)sender;

                CartaActual = Convert.ToInt32(CartasRevueltas[Convert.ToInt32(CartasSeleccionadasUsuario.Name) - 1]);
                CartasSeleccionadasUsuario.Image = RecuperarImagen(CartaActual);
                CartasSeleccionadas.Add(CartasSeleccionadasUsuario);

                if (CartasSeleccionadas.Count == 2)
                {
                    CartaTemporal1 = CartasSeleccionadas[0];
                    CartaTemporal2 = CartasSeleccionadas[1];
                    int Carta1 = Convert.ToInt32(CartasRevueltas[Convert.ToInt32(CartaTemporal1.Name) - 1]);
                    int Carta2 = Convert.ToInt32(CartasRevueltas[Convert.ToInt32(CartaTemporal2.Name) - 1]);

                    if (Carta1 != Carta2)
                    {
                        timer1.Interval = 1000; // Set interval to 1 second
                        timer1.Start();
                    }
                    else
                    {
                        CantidadCartasVolteadas++;
                        if (CantidadCartasVolteadas >= 8)
                        {
                            MessageBox.Show("El juego termino");
                        }
                        CartaTemporal1.Enabled = false;
                        CartaTemporal2.Enabled = false;
                        CartasSeleccionadas.Clear();
                    }
                }
            }
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            foreach (var carta in CartasSeleccionadas)
            {
                carta.Image = Properties.Resources.back;
            }
            CartasSeleccionadas.Clear();
            timer1.Stop();
        }

        public Bitmap RecuperarImagen(int NumeroImagen)
        {
            Bitmap TmpImg = new Bitmap(200, 100);
            switch (NumeroImagen)
            {
                case 0:
                    TmpImg = Properties.Resources.imagen11;
                    break;
                default:
                    TmpImg = (Bitmap)Properties.Resources.ResourceManager.GetObject("imagen" + NumeroImagen);
                    break;
            }
            return TmpImg;
        }

        private void PanelJuego_Paint(object sender, PaintEventArgs e)
        {

        }
    }
}
