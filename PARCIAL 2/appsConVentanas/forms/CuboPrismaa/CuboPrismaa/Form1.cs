using System;
using System.Windows.Forms;

namespace CuboPrismaa
{
    public partial class Form1 : Form
    {
        private Cubo cubo;
        private Prisma prisma;

        private Label lblLado;
        private TextBox txtLado;
        private Label lblAltura;
        private TextBox txtAltura;
        private Label lblBasePrisma;
        private TextBox txtBasePrisma;
        private Label lblAncho;
        private TextBox txtAncho;
        private RadioButton rbCubo;
        private RadioButton rbPrisma;
        private Button btnCalcular;
        private Label lblResultado;

        public Form1()
        {
            InitializeComponent();
            InicializarComponentes();
            cubo = new Cubo();
            prisma = new Prisma();
        }

        private void InicializarComponentes()
        {
            // Label y TextBox para el lado del cubo
            lblLado = new Label();
            lblLado.Text = "Lado:";
            lblLado.Location = new System.Drawing.Point(20, 20);
            this.Controls.Add(lblLado);

            txtLado = new TextBox();
            txtLado.Location = new System.Drawing.Point(100, 20);
            this.Controls.Add(txtLado);

            // Label y TextBox para la altura del prisma
            lblAltura = new Label();
            lblAltura.Text = "Altura:";
            lblAltura.Location = new System.Drawing.Point(20, 50);
            this.Controls.Add(lblAltura);

            txtAltura = new TextBox();
            txtAltura.Location = new System.Drawing.Point(100, 50);
            this.Controls.Add(txtAltura);

            // Label y TextBox para la base del prisma
            lblBasePrisma = new Label();
            lblBasePrisma.Text = "Base del prisma:";
            lblBasePrisma.Location = new System.Drawing.Point(20, 80);
            this.Controls.Add(lblBasePrisma);

            txtBasePrisma = new TextBox();
            txtBasePrisma.Location = new System.Drawing.Point(150, 80);
            this.Controls.Add(txtBasePrisma);

            // Label y TextBox para el ancho del prisma
            lblAncho = new Label();
            lblAncho.Text = "Ancho del prisma:";
            lblAncho.Location = new System.Drawing.Point(20, 110);
            this.Controls.Add(lblAncho);

            txtAncho = new TextBox();
            txtAncho.Location = new System.Drawing.Point(150, 110);
            this.Controls.Add(txtAncho);

            // RadioButton para seleccionar entre cubo y prisma
            rbCubo = new RadioButton();
            rbCubo.Text = "Cubo";
            rbCubo.Location = new System.Drawing.Point(20, 150);
            rbCubo.Checked = true; // Por defecto selecciona cubo
            this.Controls.Add(rbCubo);

            rbPrisma = new RadioButton();
            rbPrisma.Text = "Prisma";
            rbPrisma.Location = new System.Drawing.Point(100, 150);
            this.Controls.Add(rbPrisma);

            // Button para calcular
            btnCalcular = new Button();
            btnCalcular.Text = "Calcular";
            btnCalcular.Location = new System.Drawing.Point(20, 180);
            btnCalcular.Click += new EventHandler(btnCalcular_Click);
            this.Controls.Add(btnCalcular);

            // Label para mostrar el resultado
            lblResultado = new Label();
            lblResultado.Text = "";
            lblResultado.Location = new System.Drawing.Point(20, 220);
            this.Controls.Add(lblResultado);
        }

        private void btnCalcular_Click(object sender, EventArgs e)
        {
            if (rbCubo.Checked)
            {
                CalcularCubo();
            }
            else if (rbPrisma.Checked)
            {
                CalcularPrisma();
            }
        }

        private void CalcularCubo()
        {
            double lado = Convert.ToDouble(txtLado.Text);
            cubo.SetLado(lado);
            cubo.CalcularArea();
            cubo.CalcularVolumen();

            lblResultado.Text = $"Área del cubo: {cubo.GetArea()} \nVolumen del cubo: {cubo.GetVolumen()}";
        }

        private void CalcularPrisma()
        {
            double altura = Convert.ToDouble(txtAltura.Text);
            double basePrisma = Convert.ToDouble(txtBasePrisma.Text);
            double ancho = Convert.ToDouble(txtAncho.Text);
            prisma.SetAltura(altura);
            prisma.SetBase(basePrisma);
            prisma.SetAncho(ancho);
            prisma.CalcularArea();

            lblResultado.Text = $"Área del prisma: {prisma.GetArea()}";
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }

    public class Cubo
    {
        private double lado;
        private double volumen;
        private double area;

        public Cubo()
        {
            lado = 0;
            volumen = 0;
            area = 0;
        }

        public void SetLado(double lado)
        {
            this.lado = lado;
        }

        public double GetArea()
        {
            return area;
        }

        public double GetVolumen()
        {
            return volumen;
        }

        public void CalcularArea()
        {
            area = 6 * lado * lado;
        }

        public void CalcularVolumen()
        {
            volumen = lado * lado * lado;
        }
    }

    public class Prisma
    {
        private double basePrisma;
        private double altura;
        private double ancho;
        private double area;

        public Prisma()
        {
            basePrisma = 0;
            altura = 0;
            ancho = 0;
            area = 0;
        }

        public void SetBase(double basePrisma)
        {
            this.basePrisma = basePrisma;
        }

        public void SetAltura(double altura)
        {
            this.altura = altura;
        }

        public void SetAncho(double ancho)
        {
            this.ancho = ancho;
        }

        public double GetArea()
        {
            return area;
        }

        public void CalcularArea()
        {
            area = 2 * (basePrisma * altura) + 2 * (basePrisma * ancho);
        }
    }
}
