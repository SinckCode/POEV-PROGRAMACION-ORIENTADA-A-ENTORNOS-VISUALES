namespace Forms
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
            this.button1 = new Button();
            this.button2 = new Button();
            this.label1 = new Label();
            this.label2 = new Label();
            this.SuspendLayout();
            // 
            // button1
            // 
            button1.Location = new Point(92, 123);
            button1.Name = "button1";
            button1.Size = new Size(94, 29);
            button1.TabIndex = 0;
            button1.Text = "button1";
            button1.UseVisualStyleBackColor = true;
            // 
            // button2
            // 
            button2.Location = new Point(290, 123);
            button2.Name = "button2";
            button2.Size = new Size(94, 29);
            button2.TabIndex = 1;
            button2.Text = "button2";
            button2.UseVisualStyleBackColor = true;
            // 
            // label1
            // 
            label1.Name = "label1";
            label1.TabIndex = 2;
            this.label1.Text = "Etiqueta 1";
            this.label1.Location = new System.Drawing.Point(10, 50);
            this.label1.Size = new System.Drawing.Size(20, 80);
            this.Controls.Add(this.label1);
            // 
            // label2
            // 
            label2.Location = new Point(281, 60);
            label2.Name = "label2";
            label2.TabIndex = 3;
            label2.Text = "label2";
            // Configuración del campo de texto 2
            this.label2.Location = new System.Drawing.Point(50, 100);
            this.label2.Size = new System.Drawing.Size(200, 25);
            this.Controls.Add(this.label2);
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(8F, 20F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(button2);
            Controls.Add(button1);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Button button1;
        private Button button2;
        private Label label1;
        private Label label2;
    }
}
