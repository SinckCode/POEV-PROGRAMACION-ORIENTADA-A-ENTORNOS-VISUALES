namespace TipodeTriangulo
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.txtLadoA = new System.Windows.Forms.TextBox();
            this.PicEquilatero = new System.Windows.Forms.PictureBox();
            this.label2 = new System.Windows.Forms.Label();
            this.txtLadoB = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.txtLadoC = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.btoClacular = new System.Windows.Forms.Button();
            this.btoNuevo = new System.Windows.Forms.Button();
            this.PicEscaleno = new System.Windows.Forms.PictureBox();
            this.PicIsosceles = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.PicEquilatero)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.PicEscaleno)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.PicIsosceles)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(48, 144);
            this.label1.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(92, 25);
            this.label1.TabIndex = 0;
            this.label1.Text = "LADO A";
            // 
            // txtLadoA
            // 
            this.txtLadoA.Location = new System.Drawing.Point(52, 180);
            this.txtLadoA.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtLadoA.Name = "txtLadoA";
            this.txtLadoA.Size = new System.Drawing.Size(132, 22);
            this.txtLadoA.TabIndex = 1;
            // 
            // PicEquilatero
            // 
            this.PicEquilatero.Image = global::TipodeTriangulo.Properties.Resources._2020_10_22_13h10_21;
            this.PicEquilatero.Location = new System.Drawing.Point(281, 82);
            this.PicEquilatero.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.PicEquilatero.Name = "PicEquilatero";
            this.PicEquilatero.Size = new System.Drawing.Size(337, 457);
            this.PicEquilatero.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.PicEquilatero.TabIndex = 2;
            this.PicEquilatero.TabStop = false;
            this.PicEquilatero.Visible = false;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(35, 41);
            this.label2.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(293, 25);
            this.label2.TabIndex = 3;
            this.label2.Text = "Determina el tipo de triangulo";
            // 
            // txtLadoB
            // 
            this.txtLadoB.Location = new System.Drawing.Point(53, 268);
            this.txtLadoB.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtLadoB.Name = "txtLadoB";
            this.txtLadoB.Size = new System.Drawing.Size(132, 22);
            this.txtLadoB.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(49, 233);
            this.label3.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(91, 25);
            this.label3.TabIndex = 4;
            this.label3.Text = "LADO B";
            // 
            // txtLadoC
            // 
            this.txtLadoC.Location = new System.Drawing.Point(55, 357);
            this.txtLadoC.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.txtLadoC.Name = "txtLadoC";
            this.txtLadoC.Size = new System.Drawing.Size(132, 22);
            this.txtLadoC.TabIndex = 7;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(51, 321);
            this.label4.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(93, 25);
            this.label4.TabIndex = 6;
            this.label4.Text = "LADO C";
            // 
            // btoClacular
            // 
            this.btoClacular.Location = new System.Drawing.Point(56, 420);
            this.btoClacular.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.btoClacular.Name = "btoClacular";
            this.btoClacular.Size = new System.Drawing.Size(115, 49);
            this.btoClacular.TabIndex = 8;
            this.btoClacular.Text = "CALCULAR";
            this.btoClacular.UseVisualStyleBackColor = true;
            this.btoClacular.Click += new System.EventHandler(this.btoClacular_Click);
            // 
            // btoNuevo
            // 
            this.btoNuevo.Location = new System.Drawing.Point(56, 476);
            this.btoNuevo.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.btoNuevo.Name = "btoNuevo";
            this.btoNuevo.Size = new System.Drawing.Size(115, 49);
            this.btoNuevo.TabIndex = 9;
            this.btoNuevo.Text = "NUEVO";
            this.btoNuevo.UseVisualStyleBackColor = true;
            this.btoNuevo.Click += new System.EventHandler(this.button2_Click);
            // 
            // PicEscaleno
            // 
            this.PicEscaleno.Image = global::TipodeTriangulo.Properties.Resources._2020_10_22_13h10_57;
            this.PicEscaleno.Location = new System.Drawing.Point(281, 82);
            this.PicEscaleno.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.PicEscaleno.Name = "PicEscaleno";
            this.PicEscaleno.Size = new System.Drawing.Size(337, 457);
            this.PicEscaleno.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.PicEscaleno.TabIndex = 10;
            this.PicEscaleno.TabStop = false;
            this.PicEscaleno.Visible = false;
            // 
            // PicIsosceles
            // 
            this.PicIsosceles.Image = global::TipodeTriangulo.Properties.Resources._2020_10_22_13h09_42;
            this.PicIsosceles.Location = new System.Drawing.Point(281, 82);
            this.PicIsosceles.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.PicIsosceles.Name = "PicIsosceles";
            this.PicIsosceles.Size = new System.Drawing.Size(337, 457);
            this.PicIsosceles.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.PicIsosceles.TabIndex = 11;
            this.PicIsosceles.TabStop = false;
            this.PicIsosceles.Visible = false;
            this.PicIsosceles.Click += new System.EventHandler(this.PicIsosceles_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(656, 554);
            this.Controls.Add(this.PicIsosceles);
            this.Controls.Add(this.PicEscaleno);
            this.Controls.Add(this.btoNuevo);
            this.Controls.Add(this.btoClacular);
            this.Controls.Add(this.txtLadoC);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txtLadoB);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.PicEquilatero);
            this.Controls.Add(this.txtLadoA);
            this.Controls.Add(this.label1);
            this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.PicEquilatero)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.PicEscaleno)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.PicIsosceles)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtLadoA;
        private System.Windows.Forms.PictureBox PicEquilatero;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtLadoB;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtLadoC;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Button btoClacular;
        private System.Windows.Forms.Button btoNuevo;
        private System.Windows.Forms.PictureBox PicEscaleno;
        private System.Windows.Forms.PictureBox PicIsosceles;
    }
}

