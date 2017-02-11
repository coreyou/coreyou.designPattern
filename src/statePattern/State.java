package statePattern;
/**
 * 影響糖果機狀態的幾個動作方法(稱為handler())，
 * 這個狀態介面會被其他狀態實作。
 * SoldOutState、NoQuarterState、HasQuarterState、SoldState四個class實作了此介面，
 * 以上四個狀態類別在糖果機(稱為Context())投錢、退錢、轉柄、發糖這幾個動作進行的時候會有不同行為。
 * 
 * @author coreyou
 *
 */
public interface State {
	// 投錢
	public void insertQuarter();
	// 退錢
	public void ejectQuarter();
	// 轉柄
	public void turnCrank();
	// 發糖
	public void dispense();
}
