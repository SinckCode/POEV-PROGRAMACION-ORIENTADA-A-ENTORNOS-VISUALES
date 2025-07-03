namespace ProyectoMemoramaaa
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
            components = new System.ComponentModel.Container();
            PanelJuego = new Panel();
            btnReiniciar = new Button();
            label1 = new Label();
            lblRecord = new Label();
            timer1 = new System.Windows.Forms.Timer(components);
            SuspendLayout();
            // 
            // PanelJuego
            // 
            PanelJuego.Location = new Point(12, 12);
            PanelJuego.Name = "PanelJuego";
            PanelJuego.Size = new Size(815, 892);
            PanelJuego.TabIndex = 12;
            PanelJuego.Paint += PanelJuego_Paint;
            // 
            // btnReiniciar
            // 
            btnReiniciar.Location = new Point(861, 498);
            btnReiniciar.Name = "btnReiniciar";
            btnReiniciar.Size = new Size(161, 25);
            btnReiniciar.TabIndex = 13;
            btnReiniciar.Text = "Reiniciar Juego";
            btnReiniciar.UseVisualStyleBackColor = true;
            btnReiniciar.Click += btnReiniciar_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(887, 444);
            label1.Name = "label1";
            label1.Size = new Size(47, 15);
            label1.TabIndex = 14;
            label1.Text = "Record:";
            // 
            // lblRecord
            // 
            lblRecord.AutoSize = true;
            lblRecord.Location = new Point(951, 444);
            lblRecord.Name = "lblRecord";
            lblRecord.Size = new Size(13, 15);
            lblRecord.TabIndex = 15;
            lblRecord.Text = "0";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1194, 916);
            Controls.Add(lblRecord);
            Controls.Add(label1);
            Controls.Add(btnReiniciar);
            Controls.Add(PanelJuego);
            Margin = new Padding(3, 2, 3, 2);
            Name = "Form1";
            Text = "Form1";
            Load += Form1_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private PictureBox pictureBox1;
        private PictureBox pictureBox2;
        private PictureBox pictureBox3;
        private PictureBox pictureBox4;
        private PictureBox pictureBox5;
        private PictureBox pictureBox6;
        private PictureBox pictureBox7;
        private PictureBox pictureBox8;
        private PictureBox pictureBox9;
        private PictureBox pictureBox10;
        private PictureBox pictureBox11;
        private PictureBox pictureBox12;
        private Panel PanelJuego;
        private Button btnReiniciar;
        private Label label1;
        private Label lblRecord;
        private System.Windows.Forms.Timer timer1;
    }
}
