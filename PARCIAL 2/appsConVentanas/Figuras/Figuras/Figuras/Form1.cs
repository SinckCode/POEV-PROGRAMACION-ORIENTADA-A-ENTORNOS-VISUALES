namespace Figuras
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void pictureBox2_Click(object sender, EventArgs e)
        {

        }

        private void radioButton1_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            // Obtener los valores de las cajas de texto
            double anchuraa = Convert.ToDouble(anchura.Text);
            double alturaa = Convert.ToDouble(altura.Text);
            double basePrismaa = Convert.ToDouble(basePrisma.Text);



            // Verificar qué radio button está seleccionado
            if (radioCubo.Checked) // Si el cubo está seleccionado
            {
                Cubo cubo = new Cubo(anchuraa, 0, 0); // Crear instancia de Cubo con solo la anchura
                double area = cubo.GetArea();
                double volumen = cubo.GetVolumen();
                if (checkArea.Checked) // Si se desea calcular el área
                {
                    // Calcular el área del cubo
                    area = 6 * Math.Pow(anchuraa, 2);
                    labelRArea.Text = area.ToString();
                }
                if (checkVolumen.Checked) // Si se desea calcular el volumen
                {
                    // Calcular el volumen del cubo
                    volumen = Math.Pow(anchuraa, 3);
                    labelRVolumen.Text = volumen.ToString();
                }
            }
            else if (radioPrisma.Checked) // Si el prisma está seleccionado
            {
                Prisma prisma = new Prisma(basePrismaa, alturaa, 0, 0, 0, 0); // Crear instancia de Prisma
                double area = prisma.GetArea();
                double volumen = prisma.GetVolumen();
                if (checkArea.Checked) // Si se desea calcular el área
                {
                    // Calcular el área del prisma triangular
                    double areaBaseTriangular = (basePrismaa * alturaa) / 2;
                    double areaLateralTriangular = (basePrismaa * alturaa) / 2;
                    area = areaBaseTriangular + areaLateralTriangular;
                    labelRArea.Text = area.ToString();
                }
                if (checkVolumen.Checked) // Si se desea calcular el volumen
                {
                    // Calcular el volumen del prisma
                    volumen = basePrismaa * alturaa;
                    labelRVolumen.Text = volumen.ToString();
                }
            }
        }


        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void radioButton1_CheckedChanged_1(object sender, EventArgs e)
        {
            if (radioCubo.Checked) // Si el cubo está seleccionado
            {
                string rutaPrisma = @"C:\Universidad\(POEV) PROGRAMACIÓN ORIENTADA A ENTORNOS VISUALES\PARCIAL 2\appsConVentanas\Figuras\Figuras\img\img2.jpg";

                pictureBox1.Image = Image.FromFile(rutaPrisma);
            }
            else if (radioPrisma.Checked)
            {
                string rutaCubo = @"C:\Universidad\(POEV) PROGRAMACIÓN ORIENTADA A ENTORNOS VISUALES\PARCIAL 2\appsConVentanas\Figuras\Figuras\img\img1.png";

                pictureBox1.Image = Image.FromFile(rutaCubo);
            }
        }

        private void radioButton2_CheckedChanged(object sender, EventArgs e)
        {

        }


        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }



        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            anchura.Clear();
            altura.Clear();
            basePrisma.Clear();
            labelRArea.Text = "";
            labelRArea.Text = "";
            anchura.Focus();
            checkArea.Checked = false;
            checkVolumen.Checked = false;
            radioCubo.Checked = true;
            radioPrisma.Checked = false;
        }

        

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }
    }

    public partial class Cubo
    {
        private double lado;
        private double volumen;
        private double area;

        public Cubo(double lado, double volumen, double area)
        {
            this.lado = lado;
            this.volumen = volumen;
            this.area = area;
        }

        public double GetArea()
        {
            return area;
        }

        public void SetArea(double area)
        {
            this.area = area;
        }

        public double GetLado()
        {
            return lado;
        }

        public void SetLado(double lado)
        {
            this.lado = lado;
        }

        public double GetVolumen()
        {
            return volumen;
        }

        public void SetVolumen(double volumen)
        {
            this.volumen = volumen;
        }

        public override string ToString()
        {
            return $"Cubo{{lado={lado}, volumen={volumen}, area={area}}}";
        }
    }

    public class Prisma : Cubo
    {
        protected double basePrisma;
        protected double altura;
        protected double ancho;

        public Prisma(double basePrisma, double altura, double ancho, double lado, double volumen, double area) : base(lado, volumen, area)
        {
            this.basePrisma = basePrisma;
            this.altura = altura;
            this.ancho = ancho;
        }

        public double GetBase()
        {
            return basePrisma;
        }

        public void SetBase(double basePrisma)
        {
            this.basePrisma = basePrisma;
        }

        public double GetAltura()
        {
            return altura;
        }

        public void SetAltura(double altura)
        {
            this.altura = altura;
        }

        public double GetAncho()
        {
            return ancho;
        }

        public void SetAncho(double ancho)
        {
            this.ancho = ancho;
        }

        public override string ToString()
        {
            return $"Prisma{{base={basePrisma}, altura={altura}, ancho={ancho}}}";
        }
    }
}
