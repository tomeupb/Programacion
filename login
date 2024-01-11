Scanner sc = new Scanner(System.in);

        String usuario = "user1";
        String contraseña = "asdfg";
        
        boolean login = false;

        for (int intentos = 3; intentos  >= 1 && !login ; intentos--) {
            
            System.out.println("Introduce usuario: ");
            String inputUsuario = sc.next();

            System.out.println("Introduce contraseña");
            String inputContraseña = sc.next();
            
            if (funcionLogin(inputUsuario,inputContraseña)) {
                
                login = true;
                 System.out.println("Login correcto: "+login);
            }else{
                System.out.println("Datos incorrecto: "+login );
            }
        }
    }
    
  static boolean funcionLogin( String usuario, String contraseña){
      
     if (usuario.equals("user1") && contraseña.equals("asdfg")) {
            return true;
            
      
            } 
                return false;
            }
                
           
            }
      
