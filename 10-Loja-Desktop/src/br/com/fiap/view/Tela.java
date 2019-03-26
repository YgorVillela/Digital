package br.com.fiap.view;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import br.com.fiap.loja.bo.EstoqueBOStub;
import br.com.fiap.loja.bo.EstoqueBOStub.ConsultarProduto;
import br.com.fiap.loja.bo.EstoqueBOStub.ConsultarProdutoResponse;
import br.com.fiap.loja.bo.EstoqueBOStub.ProdutoTO;

public class Tela {

	protected Shell shell;
	private Text txtCodigo;
	private Text txtProduto;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Tela window = new Tela();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");

		Label lblCodigo = new Label(shell, SWT.NONE);
		lblCodigo.setBounds(10, 10, 55, 15);
		lblCodigo.setText("C\u00F3digo");

		txtCodigo = new Text(shell, SWT.BORDER);
		txtCodigo.setBounds(10, 31, 76, 21);

		txtProduto = new Text(shell, SWT.BORDER);
		txtProduto.setBounds(193, 31, 76, 21);

		Label lblProduto = new Label(shell, SWT.NONE);
		lblProduto.setBounds(193, 10, 55, 15);
		lblProduto.setText("Produto");

		Button btnPesquisar = new Button(shell, SWT.NONE);
		btnPesquisar.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				int codigo = Integer.parseInt(txtCodigo.getText());
				
				try {
					EstoqueBOStub stub = new EstoqueBOStub();
					ConsultarProduto consulta = new ConsultarProduto();
					consulta.setCodProduto(codigo);
					
					ConsultarProdutoResponse cpr = stub.consultarProduto(consulta);
					
					ProdutoTO produto = cpr.get_return();
					
					String tProduto = produto.getDescricao();
					txtProduto.setText(tProduto);
					
				} catch (AxisFault e1) {
					
					e1.printStackTrace();
				} catch (RemoteException e1) {
					
					e1.printStackTrace();
				}
				
				
			}
		});
		btnPesquisar.setBounds(10, 73, 75, 25);
		btnPesquisar.setText("Pesquisar");
	}
}
