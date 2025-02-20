import com.azure.autorest.customization.ClassCustomization;
import com.azure.autorest.customization.Customization;
import com.azure.autorest.customization.LibraryCustomization;
import org.slf4j.Logger;

public class MetricsCustomization extends Customization {
    @Override
    public void customize(LibraryCustomization libraryCustomization, Logger logger) {
        ClassCustomization metrics = libraryCustomization
                .getClass("com.azure.monitor.query.implementation.metrics", "Metrics");
        metrics.rename("MetricsImpl");

        ClassCustomization metricsClient = libraryCustomization
                .getClass("com.azure.monitor.query.implementation.metrics", "MonitorManagementClient");
        metricsClient.rename("MonitorManagementClientImpl");

        ClassCustomization metricsClientBuilder = libraryCustomization
                .getClass("com.azure.monitor.query.implementation.metrics", "MonitorManagementClientBuilder");
        metricsClientBuilder.rename("MonitorManagementClientImplBuilder");
    }

}
