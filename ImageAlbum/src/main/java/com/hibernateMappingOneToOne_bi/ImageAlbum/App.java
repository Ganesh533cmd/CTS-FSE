package com.hibernateMappingOneToOne_bi.ImageAlbum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

import org.h2.engine.User;

import com.hibernateMappinghbm.User.UserDAO;
import com.hibernateMappinghbm.User.UserDAOImpl;

public class App 
{
	private static UserDAOImpl dao;
	static {
		dao = new UserDAOImpl(null);
	}
	
    public static void main( String[] args ) throws Exception {
		int choice = 0;
		Album album = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			do {
				System.out.println("======================\n1. create Album");
				System.out.println("2. find album by id");
				System.out.println("3. update album");
				System.out.println("4. delete album");
				System.out.println("0. exit");
				System.out.print("choice: ");
				choice = Integer.parseInt(br.readLine().toString());
				int uId;
				switch (choice) {
				case 1:
					
					System.out.print("Enter user name: ");
					String name = br.readLine().toString();
					User a = new User(null, uId, name, false);
					System.out.print("Enter user url: ");
					String url = br.readLine().toString();
					User tempUser = new User(null, uId, url, false);
					((Object) a).setUser(tempUser);

					UserDAO a1 = dao.createUser(a);
					System.out.println(a1);
					System.err.println("User created");
					break;
				case 2:
					System.out.print("enter UID: ");
					uId = Integer.parseInt(br.readLine());
					dao.findbyId(uId);
					break;
				case 3:
					System.out.print("enter UID: ");
					uId = Integer.parseInt(br.readLine());
					System.out.println(dao.createUser(uId));
					break;
				case 4:
					System.out.print("enter UID: ");
					uId = Integer.parseInt(br.readLine());
					System.out.println(dao.deleteUser(uId));
					break;

				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("invalid choice");
					break;
				}

			} while (choice != 0);

		} catch (Exception e) {
			e.printStackTrace();
		}

        
    }
}
