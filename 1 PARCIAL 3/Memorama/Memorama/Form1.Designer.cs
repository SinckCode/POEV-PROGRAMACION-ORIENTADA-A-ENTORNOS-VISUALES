namespace Memorama
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            PanelJuego = new Panel();
            label1 = new Label();
            lblRecord = new Label();
            btnReiniciar = new Button();
            timer1 = new System.Windows.Forms.Timer(components);
            SuspendLayout();
            // 
            // PanelJuego
            // 
            PanelJuego.BackgroundImage = (Image)resources.GetObject("PanelJuego.BackgroundImage");
            PanelJuego.Location = new Point(14, 16);
            PanelJuego.Margin = new Padding(3, 4, 3, 4);
            PanelJuego.Name = "PanelJuego";
            PanelJuego.Size = new Size(1016, 765);
            PanelJuego.TabIndex = 0;
            PanelJuego.Paint += PanelJuego_Paint;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(1147, 500);
            label1.Name = "label1";
            label1.Size = new Size(59, 20);
            label1.TabIndex = 1;
            label1.Text = "Record:";
            // 
            // lblRecord
            // 
            lblRecord.AutoSize = true;
            lblRecord.Location = new Point(1198, 500);
            lblRecord.Name = "lblRecord";
            lblRecord.Size = new Size(17, 20);
            lblRecord.TabIndex = 2;
            lblRecord.Text = "0";
            // 
            // btnReiniciar
            // 
            btnReiniciar.Location = new Point(1054, 573);
            btnReiniciar.Margin = new Padding(3, 4, 3, 4);
            btnReiniciar.Name = "btnReiniciar";
            btnReiniciar.Size = new Size(238, 44);
            btnReiniciar.TabIndex = 3;
            btnReiniciar.Text = "Reiniciar de Juego";
            btnReiniciar.UseVisualStyleBackColor = true;
            btnReiniciar.Click += btnReiniciar_Click;
            // 
            // timer1
            // 
            timer1.Interval = 500;
            timer1.Tick += timer1_Tick;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1320, 797);
            Controls.Add(btnReiniciar);
            Controls.Add(lblRecord);
            Controls.Add(label1);
            Controls.Add(PanelJuego);
            Margin = new Padding(3, 4, 3, 4);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Panel PanelJuego;
        private Label label1;
        private Label lblRecord;
        private Button btnReiniciar;
        private System.Windows.Forms.Timer timer1;
    }
}
