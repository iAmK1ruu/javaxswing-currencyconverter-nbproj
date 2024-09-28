
import java.awt.Image;
import java.io.*;
import static java.lang.Float.NaN;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import javax.swing.*;

public class DefaultWindow extends javax.swing.JFrame {


    public DefaultWindow() throws IOException {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
        setWindowFeel();
        icon_down.setVisible(false);
        if (CallCurrencyAPI.getAPI().equals("NO_API")) {
            JOptionPane.showMessageDialog(this, "Your API isn't set.\nGo to Settings and enter your API key.", "No API Key", 2);
        } else {
            popularCurrencies();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        pane_conversion = new javax.swing.JPanel();
        btn_settings = new javax.swing.JButton();
        btn_reload = new javax.swing.JButton();
        icon_app = new javax.swing.JLabel();
        label_text = new javax.swing.JLabel();
        field_to = new javax.swing.JTextField();
        field_amount = new javax.swing.JTextField();
        field_from = new javax.swing.JTextField();
        btn_exchange = new javax.swing.JButton();
        icon_from = new javax.swing.JLabel();
        label_fromVal = new javax.swing.JLabel();
        icon_from1 = new javax.swing.JLabel();
        label_toVal = new javax.swing.JLabel();
        icon_down = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a3 = new javax.swing.JLabel();
        a4 = new javax.swing.JLabel();
        a5 = new javax.swing.JLabel();
        a6 = new javax.swing.JLabel();
        a7 = new javax.swing.JLabel();
        a8 = new javax.swing.JLabel();
        a10 = new javax.swing.JLabel();
        a11 = new javax.swing.JLabel();
        a12 = new javax.swing.JLabel();
        a13 = new javax.swing.JLabel();
        a9 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        c10 = new javax.swing.JLabel();
        c11 = new javax.swing.JLabel();
        c12 = new javax.swing.JLabel();
        c13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        pane_conversion.setBackground(new java.awt.Color(229, 217, 242));
        pane_conversion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        btn_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settingsActionPerformed(evt);
            }
        });

        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });

        icon_app.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        label_text.setBackground(new java.awt.Color(22, 66, 60));
        label_text.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label_text.setForeground(new java.awt.Color(165, 148, 249));
        label_text.setText("Real-time Currency Converter");

        field_to.setBackground(new java.awt.Color(229, 217, 242));
        field_to.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        field_to.setForeground(new java.awt.Color(22, 66, 60));
        field_to.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_to.setBorder(javax.swing.BorderFactory.createTitledBorder("To"));
        field_to.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        field_to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_toActionPerformed(evt);
            }
        });

        field_amount.setBackground(new java.awt.Color(229, 217, 242));
        field_amount.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        field_amount.setForeground(new java.awt.Color(22, 66, 60));
        field_amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_amount.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter amount"));
        field_amount.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        field_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_amountActionPerformed(evt);
            }
        });

        field_from.setBackground(new java.awt.Color(229, 217, 242));
        field_from.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        field_from.setForeground(new java.awt.Color(22, 66, 60));
        field_from.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_from.setBorder(javax.swing.BorderFactory.createTitledBorder("From"));
        field_from.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        field_from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_fromActionPerformed(evt);
            }
        });

        btn_exchange.setBackground(new java.awt.Color(165, 148, 249));
        btn_exchange.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_exchange.setForeground(new java.awt.Color(245, 239, 255));
        btn_exchange.setText("Get Exchange Rate");
        btn_exchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exchangeActionPerformed(evt);
            }
        });

        label_fromVal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        label_toVal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        javax.swing.GroupLayout pane_conversionLayout = new javax.swing.GroupLayout(pane_conversion);
        pane_conversion.setLayout(pane_conversionLayout);
        pane_conversionLayout.setHorizontalGroup(
            pane_conversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_conversionLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(icon_app, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(label_text)
                .addGap(10, 10, 10)
                .addComponent(btn_reload)
                .addGap(7, 7, 7)
                .addComponent(btn_settings))
            .addGroup(pane_conversionLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(field_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pane_conversionLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(field_from, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(field_to, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pane_conversionLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pane_conversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pane_conversionLayout.createSequentialGroup()
                        .addComponent(icon_from1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_toVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pane_conversionLayout.createSequentialGroup()
                        .addComponent(icon_from, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_fromVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_exchange, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pane_conversionLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(icon_down, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pane_conversionLayout.setVerticalGroup(
            pane_conversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_conversionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pane_conversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_app, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_text, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pane_conversionLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(pane_conversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_reload, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64)
                .addComponent(field_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pane_conversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(field_from, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(field_to))
                .addGap(18, 18, 18)
                .addComponent(btn_exchange, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(pane_conversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_from, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_fromVal, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icon_down, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pane_conversionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_from1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_toVal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 51, 35));
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 51, 35));
        jPanel1.add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 51, 35));
        jPanel1.add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 51, 35));
        jPanel1.add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 51, 35));
        jPanel1.add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 51, 35));
        jPanel1.add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 51, 35));
        jPanel1.add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 487, 51, 35));
        jPanel1.add(a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 51, 35));
        jPanel1.add(a11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 51, 35));
        jPanel1.add(a12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 51, 35));
        jPanel1.add(a13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 51, 35));
        jPanel1.add(a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 51, 35));

        c1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.setText(" ");
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 145, 30));

        c2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 255, 255));
        c2.setText(" ");
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 145, 30));

        c3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c3.setForeground(new java.awt.Color(255, 255, 255));
        c3.setText(" ");
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 145, 30));

        c4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c4.setForeground(new java.awt.Color(255, 255, 255));
        c4.setText(" ");
        jPanel1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 328, 145, 30));

        c5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c5.setForeground(new java.awt.Color(255, 255, 255));
        c5.setText(" ");
        jPanel1.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 145, 30));

        c6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c6.setForeground(new java.awt.Color(255, 255, 255));
        c6.setText(" ");
        jPanel1.add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 145, 30));

        c7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c7.setForeground(new java.awt.Color(255, 255, 255));
        c7.setText(" ");
        jPanel1.add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 145, 30));

        c8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c8.setForeground(new java.awt.Color(255, 255, 255));
        c8.setText(" ");
        jPanel1.add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 492, 145, 30));

        c9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c9.setForeground(new java.awt.Color(255, 255, 255));
        c9.setText(" ");
        jPanel1.add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 145, 30));

        c10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c10.setForeground(new java.awt.Color(255, 255, 255));
        c10.setText(" ");
        jPanel1.add(c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 145, 30));

        c11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c11.setForeground(new java.awt.Color(255, 255, 255));
        c11.setText(" ");
        jPanel1.add(c11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 168, 145, 30));

        c12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c12.setForeground(new java.awt.Color(255, 255, 255));
        c12.setText(" ");
        jPanel1.add(c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 98, 145, 30));

        c13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c13.setForeground(new java.awt.Color(255, 255, 255));
        c13.setText(" ");
        jPanel1.add(c13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 145, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Set your API Key first.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pane_conversion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pane_conversion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void field_toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_toActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_toActionPerformed

    private void field_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_amountActionPerformed

    private void btn_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settingsActionPerformed
        Settings ns = new Settings();
        ns.setVisible(true);
    }//GEN-LAST:event_btn_settingsActionPerformed

    private void field_fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_fromActionPerformed

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed
        try {

            BufferedReader dateReader = new BufferedReader(new FileReader("res/upd/date.dat"));
            String fetched_date = (dateReader.readLine()).substring(0, 11);
            if (fetched_date.equals((new Date()).toString().substring(0, 11)) && String.valueOf(CallCurrencyAPI.readForNoResponse()) == "false") {
                System.out.println(String.valueOf(CallCurrencyAPI.readForNoResponse()));
                JOptionPane.showMessageDialog(this, "The data stored is already updated. Please try again tomorrow.", "Data Already Updated", 0);
            } else {
                try {
                    CallCurrencyAPI.updateWriter();
                    if (CallCurrencyAPI.readForNoResponse() == false) {
                        DefaultWindow nw = new DefaultWindow();
                        nw.setVisible(true);
                        this.dispose();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(DefaultWindow.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this, "There was an error updating the currency data.");
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DefaultWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DefaultWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_reloadActionPerformed

    private void btn_exchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exchangeActionPerformed
        if (field_amount.getText().isEmpty() || field_to.getText().isEmpty() || field_from.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field/s cannot be empty.", "Input Error", 0);
            return;
        }

        // Divides the amount to the same currency relative to the US dollar and multiplies it to the corresponding currencies (galing ko talaga sheesh)
        float getTotalValue = (Float.parseFloat(field_amount.getText())) / (GetRates.getSpecificRate(field_from.getText().toUpperCase())) * GetRates.getSpecificRate(field_to.getText().toUpperCase());

        // Sets the flags and values
        Image scaledFrom = new ImageIcon(GetRates.getFlagDirectory(field_from.getText())).getImage().getScaledInstance(icon_from.getWidth(), icon_from.getHeight(), Image.SCALE_SMOOTH);
        icon_from.setIcon(new ImageIcon(scaledFrom));
        label_fromVal.setText(field_from.getText().toUpperCase() + " "+ field_amount.getText());;

        // Sets the flags and values
        Image scaledTo = new ImageIcon(GetRates.getFlagDirectory(field_to.getText())).getImage().getScaledInstance(icon_from1.getWidth(), icon_from1.getHeight(), Image.SCALE_SMOOTH);
        icon_from1.setIcon(new ImageIcon(scaledTo));
        label_toVal.setText(field_to.getText().toUpperCase() + " "+ String.valueOf(getTotalValue));

        icon_down.setVisible(true);
    }//GEN-LAST:event_btn_exchangeActionPerformed

    public void popularCurrencies() throws FileNotFoundException, IOException {
        Image scaledDown = new ImageIcon("res/icon/equals.png").getImage().getScaledInstance(icon_down.getWidth(), icon_down.getHeight(), Image.SCALE_SMOOTH);
        icon_down.setIcon(new ImageIcon(scaledDown));
            if (CallCurrencyAPI.readForNoResponse() == true) {
                JOptionPane.showMessageDialog(this, "The currency data cannot be updated.\nPlease set your API key and reload currency data", "Error Updating Data", 0);
            } else {
                String[] currencyCodes = {"USD", "EUR", "JPY", "GBP", "AUD", "CAD", "CHF", "CNY", "HKD", "NZD", "SEK", "SGD", "PHP"}; // The flags in design are rumbled up
                JLabel[] labels = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13};
                JLabel[] currencies = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13};
                for (int i = 0; i < currencyCodes.length; i++) {
                    String flagPath = GetRates.getFlagDirectory(currencyCodes[i]);
                    Image currentFlag = new ImageIcon(flagPath).getImage().getScaledInstance(a1.getWidth(), a1.getHeight(), Image.SCALE_SMOOTH);
                    labels[i].setIcon(new ImageIcon(currentFlag));
                    currencies[i].setText(String.valueOf(GetRates.getSpecificRate(currencyCodes[i])));
                    jLabel1.setVisible(false);
                    
                }
            }
    }

    public void setWindowFeel() {

        // Setting Window Properties
        this.setTitle("Currency Converter");
        Image scaledIcon = new ImageIcon("res/icon/currency.png").getImage();
        this.setIconImage(scaledIcon);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        // Showing the settings icon
        Image scaledSettings = new ImageIcon("res/icon/settings.png").getImage().getScaledInstance(btn_settings.getWidth(), btn_settings.getHeight(), Image.SCALE_SMOOTH);
        btn_settings.setIcon(new ImageIcon(scaledSettings));
        btn_settings.setContentAreaFilled(false);
        // Showing the reload icon
        Image scaledReload = new ImageIcon("res/icon/reload.png").getImage().getScaledInstance(btn_settings.getWidth(), btn_settings.getHeight(), Image.SCALE_SMOOTH);
        btn_reload.setIcon(new ImageIcon(scaledReload));
        btn_reload.setContentAreaFilled(false);
        Image scaledAppIcon = new ImageIcon("res/icon/currency.png").getImage().getScaledInstance(icon_app.getWidth(), icon_app.getHeight(), Image.SCALE_SMOOTH);
        icon_app.setIcon(new ImageIcon(scaledAppIcon));

        Image scaledDown = new ImageIcon("res/icon/equals.png").getImage().getScaledInstance(icon_down.getWidth(), icon_down.getHeight(), Image.SCALE_SMOOTH);
        icon_down.setIcon(new ImageIcon(scaledDown));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DefaultWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DefaultWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DefaultWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DefaultWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DefaultWindow().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(DefaultWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a10;
    private javax.swing.JLabel a11;
    private javax.swing.JLabel a12;
    private javax.swing.JLabel a13;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel a3;
    private javax.swing.JLabel a4;
    private javax.swing.JLabel a5;
    private javax.swing.JLabel a6;
    private javax.swing.JLabel a7;
    private javax.swing.JLabel a8;
    private javax.swing.JLabel a9;
    private javax.swing.JButton btn_exchange;
    private javax.swing.JButton btn_reload;
    private javax.swing.JButton btn_settings;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c10;
    private javax.swing.JLabel c11;
    private javax.swing.JLabel c12;
    private javax.swing.JLabel c13;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JLabel c9;
    private javax.swing.JTextField field_amount;
    private javax.swing.JTextField field_from;
    private javax.swing.JTextField field_to;
    private javax.swing.JLabel icon_app;
    private javax.swing.JLabel icon_down;
    private javax.swing.JLabel icon_from;
    private javax.swing.JLabel icon_from1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_fromVal;
    private javax.swing.JLabel label_text;
    private javax.swing.JLabel label_toVal;
    private javax.swing.JPanel pane_conversion;
    // End of variables declaration//GEN-END:variables
}
