import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;

public class Teste {
    public static void main(String[] args){
        DefaultCategoryDataset  dataset = new DefaultCategoryDataset();
        dataset.addValue(4.0, "Ciências", "Kiko");
        dataset.addValue(3.0, "Matemática", "Kiko");
        dataset.addValue(5.0, "Ciências", "Chaves");
        dataset.addValue(2.0, "Matemática", "Chaves");
        dataset.addValue(3.0, "Ciências", "Chiquinha");
        dataset.addValue(5.0, "Matemática", "Chiquinha");
        dataset.addValue(8.0, "Ciências", "Nhonho");
        dataset.addValue(9.0, "Matemática", "Nhonho");

        JFreeChart chart = ChartFactory.createLineChart(
                "Comparação de Notas",
                "Alunos",
                "Notas",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
        chart.setBackgroundPaint(Color.gray);
        chart.getTitle().setPaint(Color.blue);
        CategoryPlot p = chart.getCategoryPlot();
        p.setForegroundAlpha(0.9f);
        p.setRangeGridlinePaint(Color.red);
        p.setDomainGridlinesVisible(true);
        p.setDomainGridlinePaint(Color.black);
        CategoryItemRenderer renderer =  p.getRenderer();
        renderer.setSeriesPaint(1, Color.red);
        renderer.setSeriesPaint(0, Color.green);
        renderer.setSeriesStroke( 1, new BasicStroke( 5 ) );
        renderer.setSeriesStroke( 0, new BasicStroke( 5 ) );

        ChartFrame frame1 = new ChartFrame("Gráfico de linhas", chart);
        frame1.setVisible(true);
        frame1.setSize(1300, 1000);
    }
}
