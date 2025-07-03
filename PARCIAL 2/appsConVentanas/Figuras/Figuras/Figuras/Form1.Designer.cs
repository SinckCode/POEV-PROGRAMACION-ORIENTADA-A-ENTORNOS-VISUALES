namespace Figuras
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            label1 = new Label();
            radioCubo = new RadioButton();
            radioPrisma = new RadioButton();
            checkArea = new CheckBox();
            checkVolumen = new CheckBox();
            anchura = new TextBox();
            altura = new TextBox();
            label2 = new Label();
            basePrisma = new TextBox();
            label3 = new Label();
            button1 = new Button();
            label4 = new Label();
            labelRArea = new Label();
            labelRVolumen = new Label();
            label7 = new Label();
            button2 = new Button();
            pictureBox1 = new PictureBox();
            ((System.ComponentModel.ISupportInitialize)pictureBox1).BeginInit();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(23, 96);
            label1.Name = "label1";
            label1.Size = new Size(63, 20);
            label1.TabIndex = 5;
            label1.Text = "Anchura";
            // 
            // radioCubo
            // 
            radioCubo.AutoSize = true;
            radioCubo.Location = new Point(23, 27);
            radioCubo.Name = "radioCubo";
            radioCubo.Size = new Size(65, 24);
            radioCubo.TabIndex = 6;
            radioCubo.TabStop = true;
            radioCubo.Text = "Cubo";
            radioCubo.UseVisualStyleBackColor = true;
            radioCubo.CheckedChanged += radioButton1_CheckedChanged_1;
            // 
            // radioPrisma
            // 
            radioPrisma.AutoSize = true;
            radioPrisma.Location = new Point(167, 27);
            radioPrisma.Name = "radioPrisma";
            radioPrisma.Size = new Size(74, 24);
            radioPrisma.TabIndex = 7;
            radioPrisma.TabStop = true;
            radioPrisma.Text = "Prisma";
            radioPrisma.UseVisualStyleBackColor = true;
            radioPrisma.CheckedChanged += radioButton2_CheckedChanged;
            // 
            // checkArea
            // 
            checkArea.AutoSize = true;
            checkArea.Location = new Point(21, 280);
            checkArea.Name = "checkArea";
            checkArea.Size = new Size(62, 24);
            checkArea.TabIndex = 8;
            checkArea.Text = "Area";
            checkArea.UseVisualStyleBackColor = true;
            checkArea.CheckedChanged += checkBox1_CheckedChanged;
            // 
            // checkVolumen
            // 
            checkVolumen.AutoSize = true;
            checkVolumen.Location = new Point(167, 280);
            checkVolumen.Name = "checkVolumen";
            checkVolumen.Size = new Size(89, 24);
            checkVolumen.TabIndex = 9;
            checkVolumen.Text = "Volumen";
            checkVolumen.UseVisualStyleBackColor = true;
            checkVolumen.CheckedChanged += checkBox2_CheckedChanged;
            // 
            // anchura
            // 
            anchura.Location = new Point(110, 87);
            anchura.Name = "anchura";
            anchura.Size = new Size(82, 27);
            anchura.TabIndex = 10;
            anchura.TextChanged += textBox1_TextChanged;
            // 
            // altura
            // 
            altura.Location = new Point(109, 123);
            altura.Name = "altura";
            altura.Size = new Size(82, 27);
            altura.TabIndex = 12;
            altura.TextChanged += textBox2_TextChanged;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(23, 129);
            label2.Name = "label2";
            label2.Size = new Size(49, 20);
            label2.TabIndex = 11;
            label2.Text = "Altura";
            // 
            // basePrisma
            // 
            basePrisma.Location = new Point(109, 159);
            basePrisma.Name = "basePrisma";
            basePrisma.Size = new Size(82, 27);
            basePrisma.TabIndex = 14;
            basePrisma.TextChanged += textBox3_TextChanged;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(23, 163);
            label3.Name = "label3";
            label3.Size = new Size(88, 20);
            label3.TabIndex = 13;
            label3.Text = "Base Prisma";
            // 
            // button1
            // 
            button1.Location = new Point(50, 231);
            button1.Name = "button1";
            button1.Size = new Size(94, 29);
            button1.TabIndex = 15;
            button1.Text = "CALCULAR";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // label4
            // 
            label4.AutoSize = true;
            label4.Location = new Point(23, 329);
            label4.Name = "label4";
            label4.Size = new Size(77, 20);
            label4.TabIndex = 16;
            label4.Text = "El Area es:";
            label4.Click += label4_Click;
            // 
            // labelRArea
            // 
            labelRArea.AutoSize = true;
            labelRArea.Location = new Point(110, 329);
            labelRArea.Name = "labelRArea";
            labelRArea.Size = new Size(0, 20);
            labelRArea.TabIndex = 17;
            // 
            // labelRVolumen
            // 
            labelRVolumen.AutoSize = true;
            labelRVolumen.Location = new Point(133, 365);
            labelRVolumen.Name = "labelRVolumen";
            labelRVolumen.Size = new Size(0, 20);
            labelRVolumen.TabIndex = 19;
            // 
            // label7
            // 
            label7.AutoSize = true;
            label7.Location = new Point(23, 365);
            label7.Name = "label7";
            label7.Size = new Size(104, 20);
            label7.TabIndex = 18;
            label7.Text = "El Volumen es:";
            label7.Click += label7_Click;
            // 
            // button2
            // 
            button2.Location = new Point(151, 231);
            button2.Margin = new Padding(3, 4, 3, 4);
            button2.Name = "button2";
            button2.Size = new Size(86, 31);
            button2.TabIndex = 20;
            button2.Text = "LIMPIAR";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // pictureBox1
            // 
            pictureBox1.Image = (Image)resources.GetObject("pictureBox1.Image");
            pictureBox1.Location = new Point(307, 12);
            pictureBox1.Name = "pictureBox1";
            pictureBox1.Size = new Size(203, 414);
            pictureBox1.SizeMode = PictureBoxSizeMode.StretchImage;
            pictureBox1.TabIndex = 21;
            pictureBox1.TabStop = false;
            pictureBox1.Click += pictureBox1_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(535, 453);
            Controls.Add(pictureBox1);
            Controls.Add(button2);
            Controls.Add(labelRVolumen);
            Controls.Add(label7);
            Controls.Add(labelRArea);
            Controls.Add(label4);
            Controls.Add(button1);
            Controls.Add(basePrisma);
            Controls.Add(label3);
            Controls.Add(altura);
            Controls.Add(label2);
            Controls.Add(anchura);
            Controls.Add(checkVolumen);
            Controls.Add(checkArea);
            Controls.Add(radioPrisma);
            Controls.Add(radioCubo);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            ((System.ComponentModel.ISupportInitialize)pictureBox1).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion
        private Label label1;
        private RadioButton radioCubo;
        private RadioButton radioPrisma;
        private CheckBox checkArea;
        private CheckBox checkVolumen;
        private TextBox anchura;
        private TextBox altura;
        private Label label2;
        private TextBox basePrisma;
        private Label label3;
        private Button button1;
        private Label label4;
        private Label labelRArea;
        private Label labelRVolumen;
        private Label label7;
        private Button button2;
        private PictureBox pictureBox1;
    }
}
