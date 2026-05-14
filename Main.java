package projet_java;
import java.sql.*;
import java.util.Scanner;

public class Main {
		

			public static void main(String[] args) {
				// TODO Auto-generated method stub
							    String url = "jdbc:sqlite:C:\\cours CPI1\\Projet Java\\BDD_pj_java.db.db"; // Fichier de base de données local
							    Scanner sc = new Scanner(System.in);

						        try {
						            Connection conn = DriverManager.getConnection(url);
						            System.out.println("Connexion établie avec la base SQLite.");

						            // ── Afficher la liste de tous les ingrédients ──────────────────
						            Statement stmt = conn.createStatement();
						            ResultSet rs = stmt.executeQuery("SELECT id_ingredient, nom FROM ingredient");
						            System.out.println("\n=== Liste des ingrédients disponibles ===");
						            while (rs.next()) {
						                System.out.println(rs.getInt("id_ingredient") + " - " + rs.getString("nom"));
						            }
						            System.out.println("=========================================\n");

						            // ── Demander combien d'aliments (entre 1 et 5) ─────────────────
						            int nb_aliment = 0;
						            do {
						                System.out.print("Combien d'aliments voulez-vous choisir ? (1 à 5) : ");
						                nb_aliment = sc.nextInt();
						                if (nb_aliment < 1 || nb_aliment > 5) {
						                    System.out.println("Veuillez entrer un nombre entre 1 et 5.");
						                }
						            } while (nb_aliment < 1 || nb_aliment > 5);
						            
						            
						            
						            
						            String sql1 = "SELECT nom FROM ingredient WHERE id_ingredient = ?";

						            for (int x = 0; x < nb_aliment; x++) {
						                // for plus lisible que do/while ici : on sait exactement
						                // combien de tours on fait (nb_aliment fois)

						                System.out.print("Aliment " + (x + 1) + " - Entrez l'id : ");
						                int id_aliment = sc.nextInt();

						                PreparedStatement pst1 = conn.prepareStatement(sql1);
						                pst1.setInt(1, id_aliment);

						                try (ResultSet rs1 = pst1.executeQuery()) {
						                    if (rs1.next()) {
						                        // ✅ rs1 et non rs — c'est le résultat de la recherche par id
						                        System.out.println("  → " + rs1.getString("nom") + " ajouté !");
						                    } else {
						                        System.out.println("  → Aucun ingrédient trouvé avec cet id, réessayez.");
						                        x--; // on ne compte pas ce tour, l'utilisateur doit réessayer
						                    }
						                }
						            }
						            
						            System.out.println("\nVos " + nb_aliment + " aliment(s) ont été sélectionnés !");

						            conn.close();

						        } catch (SQLException e) {
						            System.err.println("Erreur SQL : " + e.getMessage());
						        }

						        sc.close();
						    }
						}