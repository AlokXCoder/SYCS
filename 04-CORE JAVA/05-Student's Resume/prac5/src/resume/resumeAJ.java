package resume;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class Resume extends Frame implements ActionListener
{
 String msg=" ";
 Button btnNew, btnSubmit;
 Label lblName, lblAge, lblAddr, lblGender, lblIQua;
 TextField txtName, txtAge;
 TextArea txtAddr, txtAns;
 CheckboxGroup chkGrp;
 Checkbox chkMale, chkFemale;
 Checkbox chkMSc, chkBSc, chkBba, chkMba;
 Panel pname,page,paddr,pgender,pqua,pbtn,pans;
 Resume(String name)
 {
 super(name);
 setLayout(new GridLayout(9,1));
 lblName=new Label("Name: ");
 lblAge=new Label("Age: ");
 lblAddr=new Label("Address:");
 lblGender=new Label("Gender: ");
 lblIQua=new Label("Qualification: ");
 txtName=new TextField(20);
 txtAge=new TextField(20);
 txtAddr=new TextArea(3,20);
 chkGrp=new CheckboxGroup();
 chkMale=new Checkbox("Male",chkGrp,false);
 chkFemale=new Checkbox("Female",chkGrp,false);
 chkMSc=new Checkbox("MSc");
 chkBSc=new Checkbox("BSc");
 chkMba=new Checkbox("MBA");
 chkBba=new Checkbox("BBA");
 btnNew=new Button("NEW");
 btnSubmit=new Button("SUBMIT");
 btnNew.addActionListener(this);
 btnSubmit.addActionListener(this);
 pname=new Panel();
 page=new Panel();
 paddr=new Panel();
 pgender=new Panel();
 pqua=new Panel();
 pbtn=new Panel();
 pans=new Panel();
 pname.add(lblName);
 pname.add(txtName);
 page.add(lblAge);
 page.add(txtAge);
 paddr.add(lblAddr);
 paddr.add(txtAddr);
 pgender.add(lblGender);
 pgender.add(chkMale);
 pgender.add(chkFemale);
 pqua.add(lblIQua);
 pqua.add(chkBSc);
 pqua.add(chkBba);
 pqua.add(chkMSc);
 pqua.add(chkMba);
 pbtn.add(btnNew);
 pbtn.add(btnSubmit);
txtAns=new TextArea(7,30);
 pans.add(txtAns);
 add(pname);
 add(page);
 add(paddr);
 add(pgender);
 add(pqua);
 add(pbtn);
 add(pans);
 setSize(400,600);
 show();
 }
 public void actionPerformed(ActionEvent ae)
 {
 String s="";
 boolean b;
 String str=ae.getActionCommand();
 if(str.equals("SUBMIT"))
 {
 s=txtName.getText().trim();
 txtAns.append(s+"\n");
 txtAns.append(txtAge.getText()+"\n");
 s=txtAddr.getText();
 txtAns.append(s+"\n");
 if(chkMale.getState())
 txtAns.append("Male\n");
 if(chkFemale.getState())
 txtAns.append("Female\n");
 s="";
 if(chkMSc.getState())
 s="MSc";
 if(chkBSc.getState())
 s="BSc";
 if(chkBba.getState())
 s="BBA";
 if(chkMba.getState())
 s="MBA";
 s+="!";
 txtAns.append(s+"\n");
 }
 if(str.equals("NEW"))
 {
 txtName.setText("");
 txtAge.setText("");
 txtAddr.setText("");
chkMale.setState(false);
 chkFemale.setState(false);
 chkMSc.setState(false);
 chkBSc.setState(false);
 chkBba.setState(false);
 chkMba.setState(false);
 }
 }
public static void main(String[] args) {
 new Resume("Resume");
 }
}