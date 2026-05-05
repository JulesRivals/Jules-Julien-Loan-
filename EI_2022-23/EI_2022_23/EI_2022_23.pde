//EI 2022-23
void setup(){
  fct_1();
  SuiteGeometrique(9, 3, 6);
}

//Exercice 1
int[] tab_1 = new int[10];
int PGE = 20;
int PPE = 75;

void fct_1(){
  for(int i = 0; i<tab_1.length; i++){
    tab_1[i] = int(random(20,76));
    if(tab_1[i]>PGE){
      PGE = tab_1[i];
    }
    if(tab_1[i]<PPE){
      PPE = tab_1[i];
  }
  }
  println(tab_1);
  println(PGE);
  println(PPE);
}

//Exerice 2 
int c = 0;
int d = 0;
int Un1 = 0;

int produit(int a, int b){ 
  c = a*b;
  return c;
}

void SuiteGeometrique(int n, int u0, int q){
  for(n=0; n<=d; n++){
    Un1 = produit(u0, q);
    u0 = Un1;
  }
  println(Un1);
}
    
    
    
    
    
    
