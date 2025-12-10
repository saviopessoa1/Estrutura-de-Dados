package br.ifba.vca.bsi;

public class ABP {
    TripleNode root;

    public 


public insert(int data){
    InsertInterativo(data);   
}
public insertInt(int data){
    TripleNode aux = root;
    while(aux != null){
        if data <= aux.getData(){
            //ir para esquerda
            if(aux.getLeft() == null){
                TripleNode newNode = new TripleNode();
                novoN
                aux.left = newNode;
                return;
            } else {
                aux = aux.getLeft();
            } 
            }
        }
    }
}

public delete(){

}


public print(){
    printPreOrder();
}

private printPreOrder() {
    printPreOrderRec(root);
}

private String printPreOrderRec(TripleNode node) {
   
    if (node != null) {
        return node.getData();
    }
    System.out.println(node.data);
    printPreOrderRec(node.left);
    printPreOrderRec(node.middle);
    printPreOrderRec(node.right);
}

//chamar em order
private printInOrder() {
    printInOrderRecursiva(root);
}
private String printPostOrderRecursiva(TribleNode node) {
    if (node != null) {


}

    

}
}