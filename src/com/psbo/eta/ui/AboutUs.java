/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psbo.eta.ui;

import javax.swing.UIManager;

/**
 *
 * @author Andjey
 * Develop by E.T.A
 */
public class AboutUs extends javax.swing.JDialog {

    /**
     * Creates new form AboutUs
     */
    public AboutUs(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        contain();
    }
    
    public void contain(){
        textContain.setText(" Program ini dibuat berdasarkan tugas besar pemrograman \n"
                            + " sistem berorientasi objek dengan studi kasus pembuatan \n"
                            + " surat pengantar pembuatan kartu keluarga disebuah \n"
                            + " pemerintahan setingkat rt. dengan adanya aplikasi ini \n"
                            + " diharapkan bapak rt lebih mudah dalam melakukan pengelolaan \n"
                            + " berkas pengantar pembuatan kartu keluarga.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textContain = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        authorLabel = new javax.swing.JLabel();
        lisensiLabel = new javax.swing.JLabel();
        creditLabel = new javax.swing.JLabel();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Surat Pengantar Pembuatan Kartu Keluarga - About Us");
        setAlwaysOnTop(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("SPKK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Surat Pengantar Kartu Keluarga");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        jLabel3.setText("Version 1.0");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jScrollPane1.setBorder(null);

        textContain.setEditable(false);
        textContain.setColumns(20);
        textContain.setRows(5);
        jScrollPane1.setViewportView(textContain);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 470, 280));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        authorLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        authorLabel.setForeground(new java.awt.Color(255, 51, 51));
        authorLabel.setText("Author");
        authorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorLabelMouseClicked(evt);
            }
        });

        lisensiLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lisensiLabel.setForeground(new java.awt.Color(255, 51, 51));
        lisensiLabel.setText("Lisensi");
        lisensiLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lisensiLabelMouseClicked(evt);
            }
        });

        creditLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        creditLabel.setForeground(new java.awt.Color(255, 51, 51));
        creditLabel.setText("Credit");
        creditLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(authorLabel)
                .addGap(173, 173, 173)
                .addComponent(lisensiLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(creditLabel)
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorLabel)
                    .addComponent(lisensiLabel)
                    .addComponent(creditLabel))
                .addGap(34, 34, 34))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 550, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        //konten author
    private void authorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorLabelMouseClicked
        textContain.setText(
        
            " Developer yang ikut terlibat dalam pembuatan SPPK adalah \n \n"
            + " Programmer \n"
            + " ---------- \n"
            + " 1. Okky Surya Lesmana \n"
            + " 2. Syamsi Ridwan Falah R \n \n"
            + " Dokumentasi \n"
            + " ----------- \n"
            + " 1. Luqman labib \n"
            + " 2. Syamsi Ridwan Falah R \n"
            + " 3. Fanjar Rizkianto \n \n"
            + " Terima kasih kami team developer ucapkan kepada : \n \n"
            + " Heru Andriatna - Assisten Pembimbing \n"
            + " dan rekan lain yang ikut berkontribusi secara tidak langsung \n"
            + " terhadap terciptanya aplikasi ini \n"
        
        );
    }//GEN-LAST:event_authorLabelMouseClicked
        //konten lisensi
    private void lisensiLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lisensiLabelMouseClicked
        textContain.setText(
        
                " \t GNU GENERAL PUBLIC LICENSE\n" +
                " \t           Version 2, June 1991\n" +
                "\n" +
                " Copyright (C) 1989, 1991 Free Software Foundation, Inc.,\n" +
                " 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA\n" +
                " Everyone is permitted to copy and distribute verbatim copies\n" +
                " of this license document, but changing it is not allowed.\n" +
                "\n" +
                " \t Preamble\n" +
                "\n" +
                " The licenses for most software are designed to \n"
                +" take away your freedom to share and change it.  \n"
                +" By contrast, the GNU General Public License is intended to \n"
                + " guarantee your freedom to share and change free \n" +
                " software--to make sure the software is free for all its users. This\n" +
                " General Public License applies to most of the Free Software\n" +
                " Foundation's software and to any other program whose authors\n"
                + " commit to using it.  (Some other Free Software Foundation software\n"
                + " is covered by the GNU Lesser General Public License instead.) \n"
                + " You can apply it to your programs, too.\n" +
                "\n" +
                " When we speak of free software, we are referring to freedom, not\n" +
                " price.  Our General Public Licenses are designed to make sure that you\n" +
                " have the freedom to distribute copies of free software (and charge for\n" +
                " this service if you wish), that you receive source code or can get it\n" +
                " if you want it, that you can change the software or use pieces of it\n" +
                " in new free programs; and that you know you can do these things.\n" +
                "\n" +
                "  To protect your rights, we need to make restrictions that forbid\n" +
                "anyone to deny you these rights or to ask you to surrender the rights.\n" +
                "These restrictions translate to certain responsibilities for you if you\n" +
                "distribute copies of the software, or if you modify it.\n" +
                "\n" +
                "  For example, if you distribute copies of such a program, whether\n" +
                "gratis or for a fee, you must give the recipients all the rights that\n" +
                "you have.  You must make sure that they, too, receive or can get the\n" +
                "source code.  And you must show them these terms so they know their\n" +
                "rights.\n" +
                "\n" +
                "  We protect your rights with two steps: (1) copyright the software, and\n" +
                "(2) offer you this license which gives you legal permission to copy,\n" +
                "distribute and/or modify the software.\n" +
                "\n" +
                "  Also, for each author's protection and ours, we want to make certain\n" +
                "that everyone understands that there is no warranty for this free\n" +
                "software.  If the software is modified by someone else and passed on, we\n" +
                "want its recipients to know that what they have is not the original, so\n" +
                "that any problems introduced by others will not reflect on the original\n" +
                "authors' reputations.\n" +
                "\n" +
                "  Finally, any free program is threatened constantly by software\n" +
                "patents.  We wish to avoid the danger that redistributors of a free\n" +
                "program will individually obtain patent licenses, in effect making the\n" +
                "program proprietary.  To prevent this, we have made it clear that any\n" +
                "patent must be licensed for everyone's free use or not licensed at all.\n" +
                "\n" +
                "  The precise terms and conditions for copying, distribution and\n" +
                "modification follow.\n" +
                "\n" +
                "                    GNU GENERAL PUBLIC LICENSE\n" +
                "   TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION\n" +
                "\n" +
                "  0. This License applies to any program or other work which contains\n" +
                "a notice placed by the copyright holder saying it may be distributed\n" +
                "under the terms of this General Public License.  The \"Program\", below,\n" +
                "refers to any such program or work, and a \"work based on the Program\"\n" +
                "means either the Program or any derivative work under copyright law:\n" +
                "that is to say, a work containing the Program or a portion of it,\n" +
                "either verbatim or with modifications and/or translated into another\n" +
                "language.  (Hereinafter, translation is included without limitation in\n" +
                "the term \"modification\".)  Each licensee is addressed as \"you\".\n" +
                "\n" +
                "Activities other than copying, distribution and modification are not\n" +
                "covered by this License; they are outside its scope.  The act of\n" +
                "running the Program is not restricted, and the output from the Program\n" +
                "is covered only if its contents constitute a work based on the\n" +
                "Program (independent of having been made by running the Program).\n" +
                "Whether that is true depends on what the Program does.\n" +
                "\n" +
                "  1. You may copy and distribute verbatim copies of the Program's\n" +
                "source code as you receive it, in any medium, provided that you\n" +
                "conspicuously and appropriately publish on each copy an appropriate\n" +
                "copyright notice and disclaimer of warranty; keep intact all the\n" +
                "notices that refer to this License and to the absence of any warranty;\n" +
                "and give any other recipients of the Program a copy of this License\n" +
                "along with the Program.\n" +
                "\n" +
                "You may charge a fee for the physical act of transferring a copy, and\n" +
                "you may at your option offer warranty protection in exchange for a fee.\n" +
                "\n" +
                "  2. You may modify your copy or copies of the Program or any portion\n" +
                "of it, thus forming a work based on the Program, and copy and\n" +
                "distribute such modifications or work under the terms of Section 1\n" +
                "above, provided that you also meet all of these conditions:\n" +
                "\n" +
                "    a) You must cause the modified files to carry prominent notices\n" +
                "    stating that you changed the files and the date of any change.\n" +
                "\n" +
                "    b) You must cause any work that you distribute or publish, that in\n" +
                "    whole or in part contains or is derived from the Program or any\n" +
                "    part thereof, to be licensed as a whole at no charge to all third\n" +
                "    parties under the terms of this License.\n" +
                "\n" +
                "    c) If the modified program normally reads commands interactively\n" +
                "    when run, you must cause it, when started running for such\n" +
                "    interactive use in the most ordinary way, to print or display an\n" +
                "    announcement including an appropriate copyright notice and a\n" +
                "    notice that there is no warranty (or else, saying that you provide\n" +
                "    a warranty) and that users may redistribute the program under\n" +
                "    these conditions, and telling the user how to view a copy of this\n" +
                "    License.  (Exception: if the Program itself is interactive but\n" +
                "    does not normally print such an announcement, your work based on\n" +
                "    the Program is not required to print an announcement.)\n" +
                "\n" +
                "These requirements apply to the modified work as a whole.  If\n" +
                "identifiable sections of that work are not derived from the Program,\n" +
                "and can be reasonably considered independent and separate works in\n" +
                "themselves, then this License, and its terms, do not apply to those\n" +
                "sections when you distribute them as separate works.  But when you\n" +
                "distribute the same sections as part of a whole which is a work based\n" +
                "on the Program, the distribution of the whole must be on the terms of\n" +
                "this License, whose permissions for other licensees extend to the\n" +
                "entire whole, and thus to each and every part regardless of who wrote it.\n" +
                "\n" +
                "Thus, it is not the intent of this section to claim rights or contest\n" +
                "your rights to work written entirely by you; rather, the intent is to\n" +
                "exercise the right to control the distribution of derivative or\n" +
                "collective works based on the Program.\n" +
                "\n" +
                "In addition, mere aggregation of another work not based on the Program\n" +
                "with the Program (or with a work based on the Program) on a volume of\n" +
                "a storage or distribution medium does not bring the other work under\n" +
                "the scope of this License.\n" +
                "\n" +
                "  3. You may copy and distribute the Program (or a work based on it,\n" +
                "under Section 2) in object code or executable form under the terms of\n" +
                "Sections 1 and 2 above provided that you also do one of the following:\n" +
                "\n" +
                "    a) Accompany it with the complete corresponding machine-readable\n" +
                "    source code, which must be distributed under the terms of Sections\n" +
                "    1 and 2 above on a medium customarily used for software interchange; or,\n" +
                "\n" +
                "    b) Accompany it with a written offer, valid for at least three\n" +
                "    years, to give any third party, for a charge no more than your\n" +
                "    cost of physically performing source distribution, a complete\n" +
                "    machine-readable copy of the corresponding source code, to be\n" +
                "    distributed under the terms of Sections 1 and 2 above on a medium\n" +
                "    customarily used for software interchange; or,\n" +
                "\n" +
                "    c) Accompany it with the information you received as to the offer\n" +
                "    to distribute corresponding source code.  (This alternative is\n" +
                "    allowed only for noncommercial distribution and only if you\n" +
                "    received the program in object code or executable form with such\n" +
                "    an offer, in accord with Subsection b above.)\n" +
                "\n" +
                "The source code for a work means the preferred form of the work for\n" +
                "making modifications to it.  For an executable work, complete source\n" +
                "code means all the source code for all modules it contains, plus any\n" +
                "associated interface definition files, plus the scripts used to\n" +
                "control compilation and installation of the executable.  However, as a\n" +
                "special exception, the source code distributed need not include\n" +
                "anything that is normally distributed (in either source or binary\n" +
                "form) with the major components (compiler, kernel, and so on) of the\n" +
                "operating system on which the executable runs, unless that component\n" +
                "itself accompanies the executable.\n" +
                "\n" +
                "If distribution of executable or object code is made by offering\n" +
                "access to copy from a designated place, then offering equivalent\n" +
                "access to copy the source code from the same place counts as\n" +
                "distribution of the source code, even though third parties are not\n" +
                "compelled to copy the source along with the object code.\n" +
                "\n" +
                "  4. You may not copy, modify, sublicense, or distribute the Program\n" +
                "except as expressly provided under this License.  Any attempt\n" +
                "otherwise to copy, modify, sublicense or distribute the Program is\n" +
                "void, and will automatically terminate your rights under this License.\n" +
                "However, parties who have received copies, or rights, from you under\n" +
                "this License will not have their licenses terminated so long as such\n" +
                "parties remain in full compliance.\n" +
                "\n" +
                "  5. You are not required to accept this License, since you have not\n" +
                "signed it.  However, nothing else grants you permission to modify or\n" +
                "distribute the Program or its derivative works.  These actions are\n" +
                "prohibited by law if you do not accept this License.  Therefore, by\n" +
                "modifying or distributing the Program (or any work based on the\n" +
                "Program), you indicate your acceptance of this License to do so, and\n" +
                "all its terms and conditions for copying, distributing or modifying\n" +
                "the Program or works based on it.\n" +
                "\n" +
                "  6. Each time you redistribute the Program (or any work based on the\n" +
                "Program), the recipient automatically receives a license from the\n" +
                "original licensor to copy, distribute or modify the Program subject to\n" +
                "these terms and conditions.  You may not impose any further\n" +
                "restrictions on the recipients' exercise of the rights granted herein.\n" +
                "You are not responsible for enforcing compliance by third parties to\n" +
                "this License.\n" +
                "\n" +
                "  7. If, as a consequence of a court judgment or allegation of patent\n" +
                "infringement or for any other reason (not limited to patent issues),\n" +
                "conditions are imposed on you (whether by court order, agreement or\n" +
                "otherwise) that contradict the conditions of this License, they do not\n" +
                "excuse you from the conditions of this License.  If you cannot\n" +
                "distribute so as to satisfy simultaneously your obligations under this\n" +
                "License and any other pertinent obligations, then as a consequence you\n" +
                "may not distribute the Program at all.  For example, if a patent\n" +
                "license would not permit royalty-free redistribution of the Program by\n" +
                "all those who receive copies directly or indirectly through you, then\n" +
                "the only way you could satisfy both it and this License would be to\n" +
                "refrain entirely from distribution of the Program.\n" +
                "\n" +
                "If any portion of this section is held invalid or unenforceable under\n" +
                "any particular circumstance, the balance of the section is intended to\n" +
                "apply and the section as a whole is intended to apply in other\n" +
                "circumstances.\n" +
                "\n" +
                "It is not the purpose of this section to induce you to infringe any\n" +
                "patents or other property right claims or to contest validity of any\n" +
                "such claims; this section has the sole purpose of protecting the\n" +
                "integrity of the free software distribution system, which is\n" +
                "implemented by public license practices.  Many people have made\n" +
                "generous contributions to the wide range of software distributed\n" +
                "through that system in reliance on consistent application of that\n" +
                "system; it is up to the author/donor to decide if he or she is willing\n" +
                "to distribute software through any other system and a licensee cannot\n" +
                "impose that choice.\n" +
                "\n" +
                "This section is intended to make thoroughly clear what is believed to\n" +
                "be a consequence of the rest of this License.\n" +
                "\n" +
                "  8. If the distribution and/or use of the Program is restricted in\n" +
                "certain countries either by patents or by copyrighted interfaces, the\n" +
                "original copyright holder who places the Program under this License\n" +
                "may add an explicit geographical distribution limitation excluding\n" +
                "those countries, so that distribution is permitted only in or among\n" +
                "countries not thus excluded.  In such case, this License incorporates\n" +
                "the limitation as if written in the body of this License.\n" +
                "\n" +
                "  9. The Free Software Foundation may publish revised and/or new versions\n" +
                "of the General Public License from time to time.  Such new versions will\n" +
                "be similar in spirit to the present version, but may differ in detail to\n" +
                "address new problems or concerns.\n" +
                "\n" +
                "Each version is given a distinguishing version number.  If the Program\n" +
                "specifies a version number of this License which applies to it and \"any\n" +
                "later version\", you have the option of following the terms and conditions\n" +
                "either of that version or of any later version published by the Free\n" +
                "Software Foundation.  If the Program does not specify a version number of\n" +
                "this License, you may choose any version ever published by the Free Software\n" +
                "Foundation.\n" +
                "\n" +
                "  10. If you wish to incorporate parts of the Program into other free\n" +
                "programs whose distribution conditions are different, write to the author\n" +
                "to ask for permission.  For software which is copyrighted by the Free\n" +
                "Software Foundation, write to the Free Software Foundation; we sometimes\n" +
                "make exceptions for this.  Our decision will be guided by the two goals\n" +
                "of preserving the free status of all derivatives of our free software and\n" +
                "of promoting the sharing and reuse of software generally.\n" +
                "\n" +
                "                            NO WARRANTY\n" +
                "\n" +
                "  11. BECAUSE THE PROGRAM IS LICENSED FREE OF CHARGE, THERE IS NO WARRANTY\n" +
                "FOR THE PROGRAM, TO THE EXTENT PERMITTED BY APPLICABLE LAW.  EXCEPT WHEN\n" +
                "OTHERWISE STATED IN WRITING THE COPYRIGHT HOLDERS AND/OR OTHER PARTIES\n" +
                "PROVIDE THE PROGRAM \"AS IS\" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED\n" +
                "OR IMPLIED, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF\n" +
                "MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.  THE ENTIRE RISK AS\n" +
                "TO THE QUALITY AND PERFORMANCE OF THE PROGRAM IS WITH YOU.  SHOULD THE\n" +
                "PROGRAM PROVE DEFECTIVE, YOU ASSUME THE COST OF ALL NECESSARY SERVICING,\n" +
                "REPAIR OR CORRECTION.\n" +
                "\n" +
                "  12. IN NO EVENT UNLESS REQUIRED BY APPLICABLE LAW OR AGREED TO IN WRITING\n" +
                "WILL ANY COPYRIGHT HOLDER, OR ANY OTHER PARTY WHO MAY MODIFY AND/OR\n" +
                "REDISTRIBUTE THE PROGRAM AS PERMITTED ABOVE, BE LIABLE TO YOU FOR DAMAGES,\n" +
                "INCLUDING ANY GENERAL, SPECIAL, INCIDENTAL OR CONSEQUENTIAL DAMAGES ARISING\n" +
                "OUT OF THE USE OR INABILITY TO USE THE PROGRAM (INCLUDING BUT NOT LIMITED\n" +
                "TO LOSS OF DATA OR DATA BEING RENDERED INACCURATE OR LOSSES SUSTAINED BY\n" +
                "YOU OR THIRD PARTIES OR A FAILURE OF THE PROGRAM TO OPERATE WITH ANY OTHER\n" +
                "PROGRAMS), EVEN IF SUCH HOLDER OR OTHER PARTY HAS BEEN ADVISED OF THE\n" +
                "POSSIBILITY OF SUCH DAMAGES.\n" +
                "\n" +
                "                     END OF TERMS AND CONDITIONS\n" +
                "\n" +
                "            How to Apply These Terms to Your New Programs\n" +
                "\n" +
                "  If you develop a new program, and you want it to be of the greatest\n" +
                "possible use to the public, the best way to achieve this is to make it\n" +
                "free software which everyone can redistribute and change under these terms.\n" +
                "\n" +
                "  To do so, attach the following notices to the program.  It is safest\n" +
                "to attach them to the start of each source file to most effectively\n" +
                "convey the exclusion of warranty; and each file should have at least\n" +
                "the \"copyright\" line and a pointer to where the full notice is found.\n" +
                "\n" +
                "    <one line to give the program's name and a brief idea of what it does.>\n" +
                "    Copyright (C) <year>  <name of author>\n" +
                "\n" +
                "    This program is free software; you can redistribute it and/or modify\n" +
                "    it under the terms of the GNU General Public License as published by\n" +
                "    the Free Software Foundation; either version 2 of the License, or\n" +
                "    (at your option) any later version.\n" +
                "\n" +
                "    This program is distributed in the hope that it will be useful,\n" +
                "    but WITHOUT ANY WARRANTY; without even the implied warranty of\n" +
                "    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\n" +
                "    GNU General Public License for more details.\n" +
                "\n" +
                "    You should have received a copy of the GNU General Public License along\n" +
                "    with this program; if not, write to the Free Software Foundation, Inc.,\n" +
                "    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.\n" +
                "\n" +
                "Also add information on how to contact you by electronic and paper mail.\n" +
                "\n" +
                "If the program is interactive, make it output a short notice like this\n" +
                "when it starts in an interactive mode:\n" +
                "\n" +
                "    Gnomovision version 69, Copyright (C) year name of author\n" +
                "    Gnomovision comes with ABSOLUTELY NO WARRANTY; for details type `show w'.\n" +
                "    This is free software, and you are welcome to redistribute it\n" +
                "    under certain conditions; type `show c' for details.\n" +
                "\n" +
                "The hypothetical commands `show w' and `show c' should show the appropriate\n" +
                "parts of the General Public License.  Of course, the commands you use may\n" +
                "be called something other than `show w' and `show c'; they could even be\n" +
                "mouse-clicks or menu items--whatever suits your program.\n" +
                "\n" +
                "You should also get your employer (if you work as a programmer) or your\n" +
                "school, if any, to sign a \"copyright disclaimer\" for the program, if\n" +
                "necessary.  Here is a sample; alter the names:\n" +
                "\n" +
                "  Yoyodyne, Inc., hereby disclaims all copyright interest in the program\n" +
                "  `Gnomovision' (which makes passes at compilers) written by James Hacker.\n" +
                "\n" +
                "  <signature of Ty Coon>, 1 April 1989\n" +
                "  Ty Coon, President of Vice\n" +
                "\n" +
                "This General Public License does not permit incorporating your program into\n" +
                "proprietary programs.  If your program is a subroutine library, you may\n" +
                "consider it more useful to permit linking proprietary applications with the\n" +
                "library.  If this is what you want to do, use the GNU Lesser General\n" +
                "Public License instead of this License. \n"

        );
    }//GEN-LAST:event_lisensiLabelMouseClicked
        //konten credit
    private void creditLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditLabelMouseClicked
        textContain.setText(
        
                "       SPKK menggunakan library dari pengembang lain diantaranya : \n \n"+
                " JTatto-1.6.11.jar - Copyright(C) Apache Lisence - GPLv2 or Later \n"+
                " jasperreports-5.5.0.jar - Copyright Apache \n"
        
        );
    }//GEN-LAST:event_creditLabelMouseClicked
    
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
                    com.jtattoo.plaf.mcwin.McWinLookAndFeel.setTheme("Large-Font", "Java Swing", "");
                    UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AboutUs dialog = new AboutUs(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lisensiLabel;
    private javax.swing.JTextArea textContain;
    // End of variables declaration//GEN-END:variables
}