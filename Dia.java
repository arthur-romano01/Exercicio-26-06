import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Dia {
    LocalDate data = LocalDate.now();
    String diaDaSemana = data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pt-BR"));    
}
