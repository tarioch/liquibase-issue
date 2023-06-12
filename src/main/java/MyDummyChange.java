import liquibase.change.custom.CustomSqlChange;
import liquibase.database.Database;
import liquibase.exception.CustomChangeException;
import liquibase.exception.SetupException;
import liquibase.exception.ValidationErrors;
import liquibase.resource.ResourceAccessor;
import liquibase.statement.SqlStatement;
import liquibase.statement.StoredProcedureStatement;

public class MyDummyChange implements CustomSqlChange {

    public String getConfirmationMessage() {
        return null;
    }

    public void setUp() throws SetupException {
    }

    public void setFileOpener(ResourceAccessor resourceAccessor) {
    }

    public ValidationErrors validate(Database database) {
        return null;
    }

    public SqlStatement[] generateStatements(Database database) throws CustomChangeException {
        StoredProcedureStatement stmt = new StoredProcedureStatement("myDummy");

        return new SqlStatement[]{stmt};
    }

}
