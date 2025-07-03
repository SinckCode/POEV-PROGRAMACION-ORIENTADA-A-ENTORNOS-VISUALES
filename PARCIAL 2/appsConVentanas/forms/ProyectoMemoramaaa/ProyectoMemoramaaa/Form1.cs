using System.Collections;
using System.Collections.Generic;
using System.Windows.Forms;
using System;

namespace ProyectoMemoramaaa
{
    public partial class Form1 : Form
    {
        int TamanioColumnasFilas = 4;
        int Movimientos = 0;
        int CantidadCartasVolteadas = 0;
        List<string> CartasEnumeradas;
        List<string> CartasRevueltas;
        ArrayList CartasSeleccionadas;
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
            timer1.Stop();
            lblRecord.Text = "0";
            CantidadCartasVolteadas = 0;
            Movimientos = 0;
            PanelJuego.Controls.Clear();
            CartasEnumeradas = new List<string>();
            CartasRevueltas = new List<string>();
            CartasSeleccionadas = new ArrayList();
            for (int i = 0; i < 6; i++)
            {
                CartasEnumeradas.Add(i.ToString());
                CartasEnumeradas.Add(i.ToString());
            }

            var NumeroAletorio = new Random();
            var Resultado = CartasEnumeradas.OrderBy(item => NumeroAletorio.Next());
            foreach (string ValorCarta in Resultado)
            {
                CartasRevueltas.Add(ValorCarta);
            }

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

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void btnReiniciar_Click(object sender, EventArgs e)
        {

        }

        private void btnCarta_Click(object sender, EventArgs e)
        {
            Movimientos++;
            lblRecord.Text = Convert.ToString(Movimientos);
            var CartasSeleccionadasUsuario = (PictureBox)sender;

            CartaActual = Convert.ToInt32(CartasRevueltas[Convert.ToInt32(CartasSeleccionadasUsuario.Name)-1]);
            CartasSeleccionadasUsuario.Image= RecuperarImagen(CartaActual);
            CartasSeleccionadas.Add(CartasSeleccionadasUsuario);
        }

        private void PanelJuego_Paint(object sender, PaintEventArgs e)
        {

        }

        public Bitmap RecuperarImagen(int NumeroImagen)
        {
            Bitmap TmpImg = new Bitmap(200, 100);
            switch (NumeroImagen)
            {
                case 0: TmpImg = Properties.Resources.imagen11;
                    break;
                default: TmpImg = (Bitmap)Properties.Resources.ResourceManager.GetObject("imagen" + NumeroImagen);
                    break;
            }
            return TmpImg;
        }
    }
}
