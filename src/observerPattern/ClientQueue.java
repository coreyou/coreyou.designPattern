package observerPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * ==| Observer Pattern 觀察者模式 |== 
 * 每個連線後的客戶端，都會建立一個Client物件封裝客戶端的相關資訊，並且加入一個 ClientQueue中集中管理。
 * 程式中其它部份，可能對ClientQueue中Client的加入或移除有興趣，並且希望Client加入或移除時都可以收到通知，以便作一些 處理。
 * Observer Pattern 也可以用java.util.Observable和java.util.Observer兩個內建的功能去實作。
 * 
 * @author coreyou
 *
 */
public class ClientQueue {
	private List<Client> clients = new LinkedList<Client>();
    private List<ClientListener> listeners = new LinkedList<ClientListener>();
    private boolean changedFlag = false;
            
    void addClientListener(ClientListener listener) {
        listeners.add(listener);
    }
    void removeClientListener(ClientListener listener) {
        listeners.remove(listener);
    }
    
    void notifyAdded(Client client) {
        ClientEvent event = new ClientEvent(client);
        for(ClientListener listener : listeners) {
            listener.clientAdded(event);
        }
    }
    void notifyRemoved(Client client) {
        ClientEvent event = new ClientEvent(client);
        for(ClientListener listener : listeners) {
            listener.clientRemoved(event);
        }
    }
    
    void add(Client client) {
        clients.add(client);
        notifyAdded(client);
    }
    void remove(Client client) {
        clients.remove(client);
        notifyRemoved(client);
    }
    
    public void setChanged() {
    	setChangedFlag(true);
    }
	public boolean isChangedFlag() {
		return changedFlag;
	}
	public void setChangedFlag(boolean changedFlag) {
		this.changedFlag = changedFlag;
	}
}
