import org.sql2o.*;

public abstract class DB {
  public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/virtual_pets", "postgres", "skylar12");

  protected abstract void before();

  protected abstract void after();
}
