import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrinho {

   private Map<Item,Integer> carrinho = new HashMap<>();


  public  void adicionarItem(Item item, int quantidade){

     if (carrinho.containsKey(item)){
        carrinho.put(item,carrinho.get(item)+quantidade);
     }else {
        carrinho.put(item,quantidade);
     }

  }
  public void listar(){
      for (Map.Entry<Item,Integer> itemCarrinho : carrinho.entrySet()){
          Item item  = itemCarrinho.getKey();
          int quantidade = itemCarrinho.getValue();
          System.out.println("Seus Itens são:");
          System.out.println("Item " + item.getNome() + " Quantidade " + quantidade + " Preço R$: "+item.getPreco()*quantidade);

      }
  }
  }

