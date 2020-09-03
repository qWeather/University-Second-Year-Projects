/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import classes.CustomRenderer;
import database.databaseConnection;
import java.awt.BorderLayout;
import java.awt.Paint;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;

/**
 *
 * @author Zehra Mahmood - w1681624
 */
public class dashboard2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form GraphInternalFrame
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public dashboard2() throws ClassNotFoundException, SQLException {
        initComponents();
        //call the getChartData method and pass dropdownlist item
        getChartData(cbox.getSelectedItem().toString());
    }
    
     //created a method of showChart
    private void showChart(JFreeChart chart) throws ClassNotFoundException, SQLException
    {
        CategoryPlot plot = (CategoryPlot)chart.getPlot();
        //set the colors of chart bars using customrenderer class
        CategoryItemRenderer barColor = new CustomRenderer(new Paint[]{});
        plot.setRenderer(barColor);
        //create chart panel
        ChartPanel chartpanel = new ChartPanel(chart);
        //added chart panel in graphPanel
        graphPanel.removeAll();
        graphPanel.add(chartpanel, BorderLayout.CENTER);
        graphPanel.validate();
    }
    //created the getChartData method
    private void getChartData(String filter) throws ClassNotFoundException, SQLException{
        //database queries for filters
        switch (filter) {
            case "Top 10":
                {
                    String query="SELECT country,COUNT(country) AS BarsRepresentTopCountries FROM dataset GROUP BY country ORDER BY BarsRepresentTopCountries DESC LIMIT 10";
                    //create a data set and pass the connection and query
                    DefaultCategoryDataset dataset =  new JDBCCategoryDataset(databaseConnection.getConnection(),query);
                    //created the bar chart with JFreeChart library
                    JFreeChart chart=ChartFactory.createBarChart("Top 10 participant countries", "Countries", "Number Of Projects", dataset, PlotOrientation.VERTICAL, true, true, true);
                    showChart(chart);
                    break;
                }
            case "Top 5":
                {
                    String query="SELECT country,COUNT(country) AS BarsRepresentTopCountries FROM dataset GROUP BY country ORDER BY BarsRepresentTopCountries DESC LIMIT 5";
                    //create a data set and pass the connection and query
                    DefaultCategoryDataset dataset =  new JDBCCategoryDataset(databaseConnection.getConnection(),query);
                    //created the bar chart with JFreeChart library
                    JFreeChart chart=ChartFactory.createBarChart("Top 5 participant countries", "Countries", "Number Of Projects", dataset, PlotOrientation.VERTICAL, true, true, true);
                    showChart(chart);
                    break;
                }
            case "Top 20":
                {
                    String query="SELECT country,COUNT(country) AS BarsRepresentTopCountries FROM dataset GROUP BY country ORDER BY BarsRepresentTopCountries DESC LIMIT 20";
                    //create a data set and pass the connection and query
                    DefaultCategoryDataset dataset =  new JDBCCategoryDataset(databaseConnection.getConnection(),query);
                    //created the bar chart with JFreeChart library
                    JFreeChart chart=ChartFactory.createBarChart("Top 20 participant countries", "Countries", "Number Of Projects", dataset, PlotOrientation.VERTICAL, true, true, true);
                    showChart(chart);
                    break;
                }
            default:
                break;
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbox = new javax.swing.JComboBox<>();
        graphPanel = new javax.swing.JPanel();

        cbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Top 10", "Top 5", "Top 20" }));
        cbox.setToolTipText("");
        cbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxItemStateChanged(evt);
            }
        });

        graphPanel.setBackground(new java.awt.Color(0, 0, 204));
        graphPanel.setForeground(new java.awt.Color(51, 51, 51));
        graphPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 532, Short.MAX_VALUE))
                    .addComponent(graphPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(graphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxItemStateChanged
        
        try {
            //call the getChartData method and pass dropdownlist item
            getChartData(cbox.getSelectedItem().toString());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dashboard2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbox;
    private javax.swing.JPanel graphPanel;
    // End of variables declaration//GEN-END:variables
}
