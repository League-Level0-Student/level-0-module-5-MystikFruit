
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	public static void main(String[] args) {
		String pi = "3141592653589";

		System.out.println(pi.charAt(0) + "" + pi.charAt(1) + "" + pi.charAt(2));
		for (int i = 0; i < 999999999; i++) {
			String pi1 = JOptionPane.showInputDialog("What's the next digit of pi?");
			int pi2 = Integer.parseInt(pi1);
			if (pi2 == 1) {
				JOptionPane.showMessageDialog(null, "Correct!");
				System.out.println(pi.charAt(3));
				String pi3 = JOptionPane.showInputDialog("What's the next digit of pi?");
				int pi4 = Integer.parseInt(pi3);
				if (pi4 == 5) {
					JOptionPane.showMessageDialog(null, "Correct!");
					System.out.println(pi.charAt(4));
					String pi5 = JOptionPane.showInputDialog("What's the next digit of pi?");
					int pi6 = Integer.parseInt(pi5);
					if (pi6 == 9) {
						JOptionPane.showMessageDialog(null, "Correct!");
						System.out.println(pi.charAt(5));
						String pi7 = JOptionPane.showInputDialog("What's the next digit of pi?");
						int pi8 = Integer.parseInt(pi7);
						if (pi8 == 2) {
							JOptionPane.showMessageDialog(null, "Correct!");
							System.out.println(pi.charAt(6));
							String pi9 = JOptionPane.showInputDialog("What's the next digit of pi?");
							int pi10 = Integer.parseInt(pi9);
							if (pi10 == 6) {
								JOptionPane.showMessageDialog(null, "Correct!");
								System.out.println(pi.charAt(7));
								String pi11 = JOptionPane.showInputDialog("What's the next digit of pi?");
								int pi12 = Integer.parseInt(pi11);
								if (pi12 == 5) {
									JOptionPane.showMessageDialog(null, "Correct!");
									System.out.println(pi.charAt(8));
									String pi13 = JOptionPane.showInputDialog("What's the next digit of pi?");
									int pi14 = Integer.parseInt(pi13);
									if (pi14 == 3) {
										JOptionPane.showMessageDialog(null, "Correct");
										System.out.println(pi.charAt(9));
										String pi15 = JOptionPane.showInputDialog("What's the next digit of pi?");
										int pi16 = Integer.parseInt(pi15);
										if (pi16 == 5) {
											JOptionPane.showMessageDialog(null, "Correct!");
											System.out.println(pi.charAt(10));
											String pi17 = JOptionPane.showInputDialog("What's the next digit of pi?");
											int pi18 = Integer.parseInt(pi17);
											if (pi18 == 8) {
												JOptionPane.showMessageDialog(null, "Correct!");
												System.out.println(pi.charAt(11));
												String pi19 = JOptionPane
														.showInputDialog("What's the next digit of pi?");
												int pi20 = Integer.parseInt(pi19);
												if (pi20 == 9) {
													JOptionPane.showMessageDialog(null, "Correct!");
													System.out.println(pi.charAt(12));
													JOptionPane.showMessageDialog(null, "You have completed the game.");
													JOptionPane.showMessageDialog(null,
															"You now know the first 13 digits of pi.");
													break;
												} else {
													JOptionPane.showMessageDialog(null, "Wrong!");
													break;
												}
											} else {
												JOptionPane.showMessageDialog(null, "Wrong!");
												break;
											}
										} else {
											JOptionPane.showMessageDialog(null, "Wrong!");
											break;
										}
									} else {
										JOptionPane.showMessageDialog(null, "Wrong!");
										break;
									}
								} else {
									JOptionPane.showMessageDialog(null, "Wrong!");
									break;
								}
							} else {
								JOptionPane.showMessageDialog(null, "Wrong!");
								break;
							}

						} else {
							JOptionPane.showMessageDialog(null, "Wrong!");
							break;
						}

					} else {
						JOptionPane.showMessageDialog(null, "Wrong!");
						break;
					}
				} else {
					JOptionPane.showMessageDialog(null, "Wrong!");
					break;
				}
			} else {
				JOptionPane.showMessageDialog(null, "Wrong!");
				break;
			}
		}
	}
}
