package parking.refactored;

import java.util.List;

public class CsvReceiptFormatter extends ReceiptFormatter {
    @Override
    public String formatDailyReport(List<String> receipts, double total) {
        StringBuilder sb = new StringBuilder("plate,type,hours,amount,method\n");
        for (String receipt : receipts) {
            sb.append(receipt.replace(" | ", ",")).append("\n");
        }
        sb.append("Total,").append(total).append("\n");
        return sb.toString();
    }
}
