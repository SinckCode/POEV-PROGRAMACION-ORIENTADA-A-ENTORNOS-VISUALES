using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TipodeTriangulo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            txtLadoA.Clear();
            txtLadoB.Clear();
            txtLadoC.Clear();
            txtLadoA.Focus();
            PicEquilatero.Visible = false;
            PicEscaleno.Visible = false;
            PicIsosceles.Visible = false;
        }

        private void btoClacular_Click(object sender, EventArgs e)
        {
            int la, lb, lc;

            la = int.Parse(txtLadoA.Text);
            lb = int.Parse(txtLadoB.Text);
            lc = int.Parse(txtLadoC.Text);

            if ( la == lb && la == lc && lc == la || lb == la && lb == lc && lc == la || lc == lb && lc == lb && lb == la)
            {

                PicEquilatero.Visible = true;

            }else{

                if (la == lb &&  lc != la || la == lc && la != lc)
                {

                    PicIsosceles.Visible = true;

                }
                else
                {

                    PicEscaleno.Visible = true;

                }

            }
        }

        private void PicIsosceles_Click(object sender, EventArgs e)
        {

        }
    }
}
