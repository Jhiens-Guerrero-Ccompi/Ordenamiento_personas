package uni.aed.gui;

import java.util.Arrays;
import javax.swing.DefaultListModel;
import uni.aed.ordenamiento.Complejidad;
import uni.aed.ordenamiento.Ordenamiento;

public class SortJFrame extends javax.swing.JFrame {
    
    private final DefaultListModel modeloList1 = new DefaultListModel();
    private final DefaultListModel modeloList2 = new DefaultListModel();
    private final String CADENA_VACIA="";
    private final long FACTOR_CONVERSION_NS_TO_MS=100000;
    

    /**
     * Creates new form SortJFrame
     */
    public SortJFrame() {
        initComponents();
        ListaInicial.setModel(modeloList1);
        ListaOrdenada.setModel(modeloList2);
        jpIntervalo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaInicial = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaOrdenada = new javax.swing.JList<>();
        BtnCerrar = new javax.swing.JButton();
        BtnLimpiar = new javax.swing.JButton();
        BtnOrdenar = new javax.swing.JButton();
        lblIntercambios = new javax.swing.JLabel();
        lblCompraciones = new javax.swing.JLabel();
        txtIntercambios = new javax.swing.JTextField();
        txtComparaciones = new javax.swing.JTextField();
        cbMetodo = new javax.swing.JComboBox<>();
        lblMetodo = new javax.swing.JLabel();
        txtTiempoEjecucion = new javax.swing.JTextField();
        lblTEjecucion = new javax.swing.JLabel();
        lblCarga = new javax.swing.JLabel();
        cbCarga = new javax.swing.JComboBox<>();
        lblComplejidad = new javax.swing.JLabel();
        txtComplejidad = new javax.swing.JTextField();
        lblMsTEjecucion = new javax.swing.JLabel();
        lblFIntercambios = new javax.swing.JLabel();
        lblFComparaciones = new javax.swing.JLabel();
        jpIntervalo = new javax.swing.JPanel();
        jsIni = new javax.swing.JSpinner();
        jsFin = new javax.swing.JSpinner();
        btnGenerar = new javax.swing.JButton();
        lblIni = new javax.swing.JLabel();
        lblFin = new javax.swing.JLabel();
        rbUnico = new javax.swing.JRadioButton();
        rbDuplicado = new javax.swing.JRadioButton();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmos Sort && Search");

        lblValor.setText("Ingrese los Valores a Ordenar:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(ListaInicial);

        jScrollPane2.setViewportView(ListaOrdenada);

        BtnCerrar.setText("Cerrar");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        BtnOrdenar.setText("Ordenar");
        BtnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrdenarActionPerformed(evt);
            }
        });

        lblIntercambios.setText("#Intercambios:");

        lblCompraciones.setText("#Comparaciones:");

        txtIntercambios.setEditable(false);

        txtComparaciones.setEditable(false);

        cbMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Burbuja", "Insercion", "Insercion Binaria", "Seleccion4c", "Shell", "QuickSort", "MergeSort", "HeapSort" }));
        cbMetodo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMetodoItemStateChanged(evt);
            }
        });

        lblMetodo.setText("Metodo Ordenamiento:");

        txtTiempoEjecucion.setEditable(false);

        lblTEjecucion.setText("Tiempo Ejecucion (ns):");

        lblCarga.setText("Tipo de Carga:");

        cbCarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Aleatoria" }));
        cbCarga.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCargaItemStateChanged(evt);
            }
        });

        lblComplejidad.setText("Complejidad Asintotica:");

        txtComplejidad.setEditable(false);

        lblMsTEjecucion.setText(".");

        lblFIntercambios.setText(".");

        lblFComparaciones.setText(".");

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        lblIni.setText("Int.Ini:");

        lblFin.setText("Int.Fin:");

        javax.swing.GroupLayout jpIntervaloLayout = new javax.swing.GroupLayout(jpIntervalo);
        jpIntervalo.setLayout(jpIntervaloLayout);
        jpIntervaloLayout.setHorizontalGroup(
            jpIntervaloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIntervaloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jsIni, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsFin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
        );
        jpIntervaloLayout.setVerticalGroup(
            jpIntervaloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIntervaloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpIntervaloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar)
                    .addComponent(lblIni)
                    .addComponent(lblFin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rbUnico.setSelected(true);
        rbUnico.setText("Valores Unicos");

        rbDuplicado.setText("Valores Duplicados");

        lblMsg.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cbMetodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cbCarga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnLimpiar))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(BtnOrdenar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblIntercambios, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(6, 6, 6))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTEjecucion)
                                                        .addComponent(lblCompraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblComplejidad))
                                                    .addGap(18, 18, 18)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(BtnCerrar)
                                                .addComponent(txtIntercambios)
                                                .addComponent(txtComparaciones)
                                                .addComponent(txtTiempoEjecucion)
                                                .addComponent(txtComplejidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMsTEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblFComparaciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblFIntercambios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(rbUnico)
                .addGap(29, 29, 29)
                .addComponent(rbDuplicado)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarga)
                    .addComponent(cbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMetodo))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbUnico)
                    .addComponent(rbDuplicado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpIntervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(BtnOrdenar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIntercambios)
                            .addComponent(txtIntercambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFIntercambios))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCompraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFComparaciones))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTiempoEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTEjecucion)
                            .addComponent(lblMsTEjecucion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComplejidad)
                            .addComponent(txtComplejidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(BtnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMsg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnLimpiar)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
        modeloList1.addElement(txtValor.getText());
        txtValor.setText("");
    }//GEN-LAST:event_txtValorActionPerformed

    private void BtnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrdenarActionPerformed
        Integer N=modeloList1.size();//aquie esta los elementos a ordenar
        if(N<=1) return;
        Integer[] X =Arrays.stream(modeloList1.toArray())
                .map(obj->Integer.valueOf(obj.toString())).toArray(Integer[]::new);        
        Ordenamiento o=new Ordenamiento();
        Integer[] Y=null;
        switch(cbMetodo.getSelectedIndex()){
            case 0->{//burbuja
                //Realizar el ordenamiento
                o.burbuja(X); 
                lblFIntercambios.setText(Complejidad.BURBUJA_NINTERCAMBIOS);
                lblFComparaciones.setText(Complejidad.BURBUJA_NCOMPARACIONES);
                txtComplejidad.setText(Complejidad.BURBUJA_COMPLEJIDAD_WORSTCASE);
            }
            case 1->{//insercion
                o.insercion(X);                
                lblFIntercambios.setText(Complejidad.INSERCION_NINTERCAMBIOS_WORSTCASE);
                lblFComparaciones.setText(Complejidad.INSERCION_NCOMPARACIONES_WORSTCASE);
                txtComplejidad.setText(Complejidad.INSERCION_COMPLEJIDAD_WORSTCASE);
            }
            case 2->{//insercionBinaria
                o.insercionBinaria(X);                
                lblFIntercambios.setText(Complejidad.INSERCIONBINARIA_NINTERCAMBIOS_WORSTCASE);
                lblFComparaciones.setText(Complejidad.INSERCIONBINARIA_NCOMPARACIONES_WORSTCASE);
                txtComplejidad.setText(Complejidad.INSERCIONBINARIA_COMPLEJIDAD_WORSTCASE);
            }
            case 3->{//seleccion4c
                o.seleccion4c(X);                
                lblFIntercambios.setText(Complejidad.SELECCION_NINTERCAMBIOS_WORSTCASE);
                lblFComparaciones.setText(Complejidad.SELECCION_NCOMPARACIONES_WORSTCASE);
                txtComplejidad.setText(Complejidad.SELECCION_COMPLEJIDAD_WORSTCASE);
            }
            case 4->{//shell
                o.ShellSort(X);
                lblFIntercambios.setText(Complejidad.SHELL_NINTERCAMBIOS_WORSTCASE);
                lblFComparaciones.setText(Complejidad.SHELL_NCOMPARACIONES_WORSTCASE);
                txtComplejidad.setText(Complejidad.SHELL_COMPLEJIDAD_WORSTCASE);                
            }        
            case 5->{//QuickSort
                o.CallQuickSort(X);
                lblFIntercambios.setText(Complejidad.QUICKSORT_NINTERCAMBIOS);
                lblFComparaciones.setText(Complejidad.QUICKSORT_NCOMPARACIONES);
                txtComplejidad.setText(Complejidad.QUICKSORT_COMPLEJIDAD_WORSTCASE);                
            }
            case 6->{//MergeSort
                o.CallMergeSort(X);
                lblFIntercambios.setText(Complejidad.MERGESORT_NINTERCAMBIOS);
                lblFComparaciones.setText(Complejidad.MERGESORT_NCOMPARACIONES_WORSTCASE);
                txtComplejidad.setText(Complejidad.MERGESORT_COMPLEJIDAD_WORSTCASE);                                
            }
            case 7->{//HeapSort
                Y=new Integer[N];
                Y=o.HeapSort(X);                
                lblFComparaciones.setText(Complejidad.HEAPSORT_NCOMPARACIONES_WORSTCASE);
                txtComplejidad.setText(Complejidad.HEAPSORT_COMPLEJIDAD_WORSTCASE);                
            }            
        }//end switch                  
        txtComparaciones.setText(Integer.toString(o.getnComparaciones()));
        txtIntercambios.setText(Integer.toString(o.getnIntercambios()));
        txtTiempoEjecucion.setText(Long.toString(o.gettEjecucion()));
        if(o.gettEjecucion()>0)
            lblMsTEjecucion.setText(Double.toString(o.gettEjecucion()/FACTOR_CONVERSION_NS_TO_MS)+ " (ms)");
        modeloList2.removeAllElements();
        if (cbMetodo.getSelectedIndex()==7)
            for(Integer i: Y)        
                modeloList2.addElement(i); 
        else
            for(Integer i: X)        
                modeloList2.addElement(i); 
        
    }//GEN-LAST:event_BtnOrdenarActionPerformed
    private static int random(int low,int high){
        return (int) Math.floor(Math.random()*(high-low+1)) + low;
    }
    private void ClearResult(){        
        modeloList2.removeAllElements();
        txtIntercambios.setText(CADENA_VACIA);
        txtComparaciones.setText(CADENA_VACIA);
        txtTiempoEjecucion.setText(CADENA_VACIA);
        lblFComparaciones.setText(CADENA_VACIA);
        lblFIntercambios.setText(CADENA_VACIA);
        txtComplejidad.setText(CADENA_VACIA);
        lblMsTEjecucion.setText(CADENA_VACIA);
    }
     
    private void ClearAll(){
        modeloList1.removeAllElements();    
        modeloList2.removeAllElements();
        txtIntercambios.setText(CADENA_VACIA);
        txtComparaciones.setText(CADENA_VACIA);
        txtTiempoEjecucion.setText(CADENA_VACIA);
        txtValor.setText(CADENA_VACIA);
        jsIni.setValue(0);
        jsFin.setValue(0);
        lblFComparaciones.setText(CADENA_VACIA);
        lblFIntercambios.setText(CADENA_VACIA);
        txtComplejidad.setText(CADENA_VACIA);
        lblMsTEjecucion.setText(CADENA_VACIA);
    }
    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
       ClearAll();
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        // TODO add your handling code here:        
        int key =evt.getKeyChar();
        boolean numero=key>=48 && key<=57;
        if(!numero)
            evt.consume();
    }//GEN-LAST:event_txtValorKeyTyped

    private void cbMetodoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMetodoItemStateChanged
        // TODO add your handling code here:
        ClearResult();
    }//GEN-LAST:event_cbMetodoItemStateChanged

    private void cbCargaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCargaItemStateChanged
        // TODO add your handling code here:
        switch(cbCarga.getSelectedIndex()){
            case 0->{//manual
                lblValor.setText("Ingrese los Valores a Ordenar:");
                jpIntervalo.setVisible(false);
            }
            case 1->{//aleatoria
                lblValor.setText("Ingrese la cantidad de numeros a Generar:");
                jpIntervalo.setVisible(true);
            }
        }
    }//GEN-LAST:event_cbCargaItemStateChanged

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
        switch(cbCarga.getSelectedIndex()){
            case 1->{//aleatoria
                if(txtValor.getText().length()==0) return;
                int N=Integer.parseInt(txtValor.getText());
                if(N<=1) return;
                Object valueIni=jsIni.getValue();
                Object valueFin=jsFin.getValue();
                if (("0".equals(valueIni.toString())) 
                || ("0".equals(valueFin.toString()))) return;
                if (Integer.parseInt(valueFin.toString())
                <=(Integer.parseInt(valueIni.toString())+N)) return;
                int valor;
                for(int i=0;i<N;i++){
                    valor=random(Integer.parseInt(valueIni.toString()),
                            Integer.parseInt(valueFin.toString()));
                    if(rbUnico.isSelected())
                        if(!modeloList1.contains(valor))
                            modeloList1.addElement(valor);
                    if(rbDuplicado.isSelected())
                        modeloList1.addElement(valor);
                }
                lblMsg.setText("Se generaron " + modeloList1.size()+ " valores");
            }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnOrdenar;
    private javax.swing.JList<String> ListaInicial;
    private javax.swing.JList<String> ListaOrdenada;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JComboBox<String> cbCarga;
    private javax.swing.JComboBox<String> cbMetodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpIntervalo;
    private javax.swing.JSpinner jsFin;
    private javax.swing.JSpinner jsIni;
    private javax.swing.JLabel lblCarga;
    private javax.swing.JLabel lblComplejidad;
    private javax.swing.JLabel lblCompraciones;
    private javax.swing.JLabel lblFComparaciones;
    private javax.swing.JLabel lblFIntercambios;
    private javax.swing.JLabel lblFin;
    private javax.swing.JLabel lblIni;
    private javax.swing.JLabel lblIntercambios;
    private javax.swing.JLabel lblMetodo;
    private javax.swing.JLabel lblMsTEjecucion;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblTEjecucion;
    private javax.swing.JLabel lblValor;
    private javax.swing.JRadioButton rbDuplicado;
    private javax.swing.JRadioButton rbUnico;
    private javax.swing.JTextField txtComparaciones;
    private javax.swing.JTextField txtComplejidad;
    private javax.swing.JTextField txtIntercambios;
    private javax.swing.JTextField txtTiempoEjecucion;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
