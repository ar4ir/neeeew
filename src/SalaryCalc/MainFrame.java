	package SalaryCalc; 

	import java.awt.*; 
	import java.awt.event.*; 

	import javax.swing.*; 

	public class MainFrame extends JFrame { 
		// Создаем окно калькулятора: 
		static JPanel panel = new JPanel(); 
		//JPanel panel2 = new JPanel(); 
		// Создаем кнопку для выбора работы калькулятора: 
		JButton byxgalterButton = new JButton("Бухгалтер"); 
		static JButton rabot9gaButton = new JButton("Работяга"); 
		JButton exitButton = new JButton("Выход"); 
		JLabel label=new JLabel("Выберите пользователя:"); //надпись № 1 

		MainFrame() { 
			super("Калькулятор расчета заработной платы"); 
			// Завершение программы при закрытии окна: 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			this.setLocationRelativeTo(null); //разместить по середине экрана форму frame 

			// Установка размеров окна и расположение элементов: 
			setSize(250, 125); 
			panel.setBackground(new Color(255,255,255)); 
			//255,0,0 - красный 
			//0,255,0 - зеленый 
			//0,0,255 - синий 
			//1)меняем цвет фона главной формы 
			//panel.setBackground(new Color(0,255,0); 
			panel.setLayout(new FlowLayout()); 
			exitButton.setBackground(new Color(255,190,210)); 
			//2)меняем цвет кнопки выход 
			//exitButton.setBackground(Color.GREEN); 
			//3)меняем цвет кнопки Бухгалтер 
			//byxgalterButton.setBackground(Color.GREEN); 
			//4)меняем цвет кнопки Работяга 
			//rabot9gaButton.setBackground(Color.GREEN); 
			//5)меняем размер формы 
			//(длина,ширина) 
			//setSize(750, 300); 
			//6)меняем размер кнопки Выход 
			//(длина,ширина) 
			//exitButton.setPreferredSize(new Dimension(100,50)); 
			//7)меняем размер кнопки Бухгалтер 
			//(длина,ширина) 
			//byxgalterButton.setPreferredSize(new Dimension(100,50)); 
			//8)меняем размер кнопки Работяга 
			//(длина,ширина) 
			//rabot9gaButton.setPreferredSize(new Dimension(100,50)); 
			//9)меняем шрифт "Выберите пользователя" 
			//label.setFont(new Font("Serif", Font.PLAIN, 24)); 
			//10)меняем шрифт "Выход" 
			//exitButton.setFont(new Font("Serif", Font.PLAIN, 24)); 
			//11)меняем шрифт "Бухгалтер" 
			//byxgalterButton.setFont(new Font("Serif", Font.PLAIN, 24)); 
			//12)меняем шрифт "Работяга" 
			//rabot9gaButton.setFont(new Font("Serif", Font.PLAIN, 24)); 
			panel.add(label); 
			//13)убираем видимость кнопки бухгалтер 
			//просто закоменти след строку 
			panel.add(byxgalterButton); 
			//14)убираем видимость кнопки работяга 
			//просто закоменти след строку 
			panel.add(rabot9gaButton); 
			//15)убираем видимость кнопки выход 
			//просто закоменти след строку 
			panel.add(exitButton); 
			add(panel); 
			//16)меняем цвет текста "Выход" 
			//exitButton.setForeground(Color.GREEN); 
			//17)меняем цвет текста "Бухгалтер" 
			//byxgalterButton.setForeground(Color.RED); 
			//18)меняем цвет текста "Работяга" 
			//rabot9gaButton.setForeground(Color.RED); 

			byxgalterButton.addActionListener(new ActionListener() { 
				@Override 
				public void actionPerformed(ActionEvent ae) { 
					new SalaryCalc(); 
				} 
			}); 
			rabot9gaButton.addActionListener(new ActionListener() { 
				@Override 
				public void actionPerformed(ActionEvent ae) { 
						new SalaryCalcjunior(); 
				} 
			}); 


			exitButton.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					System.exit(0); 
				} 
			}); 
		} 
		public static void main(String[] args) { 
			// Создаем объект класса Counter (калькулятора): 
			MainFrame rgr = new MainFrame(); 
			// Запускаем окно калькулятора: 
			rgr.setVisible(true); 
		} 
	}