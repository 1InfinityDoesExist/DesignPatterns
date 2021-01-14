import com.design.pattern.creational.factoryMethod.Database;
import com.design.pattern.creational.factoryMethod.DatabaseFactory;
import com.design.pattern.creational.factoryMethod.DatabaseType;
import com.design.pattern.creational.singleton.SingletonDemo;
import com.prototype.GameType;
import com.prototype.Ludo;
import com.prototype.Registry;

public class DPMain {
	public static void main(String[] args) throws CloneNotSupportedException {

		SingletonDemo sample1 = SingletonDemo.getInstance();
		System.out.println(sample1);
		SingletonDemo sample2 = SingletonDemo.getInstance();
		System.out.println(sample2);

		System.out.println();
		System.out.println();
		// factoryMethod
		Database obj = DatabaseFactory.createDatabaseObject(DatabaseType.MYSQL);
		obj.showConnectionDetails();

		System.out.println();
		System.out.println();

		// prototype

		Ludo ludo = new Ludo();
		ludo.setName("Luddooo");
		System.out.println(ludo);
		ludo.setName("Fuddooo");

		Ludo ludo1 = (Ludo) ludo.clone();
		// ludo.setName("Luddooo");
		System.out.println(ludo1);

		Registry reg = new Registry();
		Ludo ludo2 = (Ludo) reg.getGame(GameType.LUDO);
		System.out.println(ludo2);
		ludo2.setName("abi");

		Ludo ludo3 = (Ludo) reg.getGame(GameType.LUDO);
		System.out.println(ludo3);
	}
}
