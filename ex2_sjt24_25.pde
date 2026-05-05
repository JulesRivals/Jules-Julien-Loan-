void setup(){
  int n = 15;
  int[] tab1 = new int[n]; 
  
  remplirtab(tab1);
  affichertab(tab1);
  calculerMoy(tab1);
  estDivisible(tab1);
  
  
}

void remplirtab(int[] tab){
  for(int i = 0; i<tab.length-1; i++){
    int nb = int(random(-10, 21));
    tab[i] = nb;
  }
}

void affichertab(int[] tab){
  for(int j = 0; j<tab.length-1; j++){
    println(tab[j]);
  }
}

void calculerMoy(int[] tab){
  int moy = 0;
  for(int k = 0; k<tab.length-1; k++){
    if(k == 0){
      moy = tab[k];
    }
    moy = (tab[k] + moy)/2;
  }
  println("la moyenne est : " + moy);
}

void estDivisible(int[] tab){
  for(int l = 0; l<tab.length-1; l++){
    if(tab[l] % 6 == 0){
      println(tab[l] + " oui");
    }
    else{
      println(tab[l] + " non");
    }
  }
}
      
