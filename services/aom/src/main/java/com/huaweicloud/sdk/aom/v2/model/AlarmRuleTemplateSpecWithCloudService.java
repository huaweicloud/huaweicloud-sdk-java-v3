package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlarmRuleTemplateSpecWithCloudService
 */
public class AlarmRuleTemplateSpecWithCloudService {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_cloud_service")

    private String relatedCloudService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_cce_clusters")

    private List<String> relatedCceClusters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_prometheus_instances")

    private List<String> relatedPrometheusInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notification")

    private AlarmNotification alarmNotification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_template_spec_items")

    private List<AlarmTemplateSpecItem> alarmTemplateSpecItems = null;

    public AlarmRuleTemplateSpecWithCloudService withRelatedCloudService(String relatedCloudService) {
        this.relatedCloudService = relatedCloudService;
        return this;
    }

    /**
     * 关联的云服务。
     * @return relatedCloudService
     */
    public String getRelatedCloudService() {
        return relatedCloudService;
    }

    public void setRelatedCloudService(String relatedCloudService) {
        this.relatedCloudService = relatedCloudService;
    }

    public AlarmRuleTemplateSpecWithCloudService withRelatedCceClusters(List<String> relatedCceClusters) {
        this.relatedCceClusters = relatedCceClusters;
        return this;
    }

    public AlarmRuleTemplateSpecWithCloudService addRelatedCceClustersItem(String relatedCceClustersItem) {
        if (this.relatedCceClusters == null) {
            this.relatedCceClusters = new ArrayList<>();
        }
        this.relatedCceClusters.add(relatedCceClustersItem);
        return this;
    }

    public AlarmRuleTemplateSpecWithCloudService withRelatedCceClusters(
        Consumer<List<String>> relatedCceClustersSetter) {
        if (this.relatedCceClusters == null) {
            this.relatedCceClusters = new ArrayList<>();
        }
        relatedCceClustersSetter.accept(this.relatedCceClusters);
        return this;
    }

    /**
     * 关联的CCE集群。
     * @return relatedCceClusters
     */
    public List<String> getRelatedCceClusters() {
        return relatedCceClusters;
    }

    public void setRelatedCceClusters(List<String> relatedCceClusters) {
        this.relatedCceClusters = relatedCceClusters;
    }

    public AlarmRuleTemplateSpecWithCloudService withRelatedPrometheusInstances(
        List<String> relatedPrometheusInstances) {
        this.relatedPrometheusInstances = relatedPrometheusInstances;
        return this;
    }

    public AlarmRuleTemplateSpecWithCloudService addRelatedPrometheusInstancesItem(
        String relatedPrometheusInstancesItem) {
        if (this.relatedPrometheusInstances == null) {
            this.relatedPrometheusInstances = new ArrayList<>();
        }
        this.relatedPrometheusInstances.add(relatedPrometheusInstancesItem);
        return this;
    }

    public AlarmRuleTemplateSpecWithCloudService withRelatedPrometheusInstances(
        Consumer<List<String>> relatedPrometheusInstancesSetter) {
        if (this.relatedPrometheusInstances == null) {
            this.relatedPrometheusInstances = new ArrayList<>();
        }
        relatedPrometheusInstancesSetter.accept(this.relatedPrometheusInstances);
        return this;
    }

    /**
     * 关联的Prom实例。
     * @return relatedPrometheusInstances
     */
    public List<String> getRelatedPrometheusInstances() {
        return relatedPrometheusInstances;
    }

    public void setRelatedPrometheusInstances(List<String> relatedPrometheusInstances) {
        this.relatedPrometheusInstances = relatedPrometheusInstances;
    }

    public AlarmRuleTemplateSpecWithCloudService withAlarmNotification(AlarmNotification alarmNotification) {
        this.alarmNotification = alarmNotification;
        return this;
    }

    public AlarmRuleTemplateSpecWithCloudService withAlarmNotification(
        Consumer<AlarmNotification> alarmNotificationSetter) {
        if (this.alarmNotification == null) {
            this.alarmNotification = new AlarmNotification();
            alarmNotificationSetter.accept(this.alarmNotification);
        }

        return this;
    }

    /**
     * Get alarmNotification
     * @return alarmNotification
     */
    public AlarmNotification getAlarmNotification() {
        return alarmNotification;
    }

    public void setAlarmNotification(AlarmNotification alarmNotification) {
        this.alarmNotification = alarmNotification;
    }

    public AlarmRuleTemplateSpecWithCloudService withAlarmTemplateSpecItems(
        List<AlarmTemplateSpecItem> alarmTemplateSpecItems) {
        this.alarmTemplateSpecItems = alarmTemplateSpecItems;
        return this;
    }

    public AlarmRuleTemplateSpecWithCloudService addAlarmTemplateSpecItemsItem(
        AlarmTemplateSpecItem alarmTemplateSpecItemsItem) {
        if (this.alarmTemplateSpecItems == null) {
            this.alarmTemplateSpecItems = new ArrayList<>();
        }
        this.alarmTemplateSpecItems.add(alarmTemplateSpecItemsItem);
        return this;
    }

    public AlarmRuleTemplateSpecWithCloudService withAlarmTemplateSpecItems(
        Consumer<List<AlarmTemplateSpecItem>> alarmTemplateSpecItemsSetter) {
        if (this.alarmTemplateSpecItems == null) {
            this.alarmTemplateSpecItems = new ArrayList<>();
        }
        alarmTemplateSpecItemsSetter.accept(this.alarmTemplateSpecItems);
        return this;
    }

    /**
     * 告警模板列表。
     * @return alarmTemplateSpecItems
     */
    public List<AlarmTemplateSpecItem> getAlarmTemplateSpecItems() {
        return alarmTemplateSpecItems;
    }

    public void setAlarmTemplateSpecItems(List<AlarmTemplateSpecItem> alarmTemplateSpecItems) {
        this.alarmTemplateSpecItems = alarmTemplateSpecItems;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmRuleTemplateSpecWithCloudService that = (AlarmRuleTemplateSpecWithCloudService) obj;
        return Objects.equals(this.relatedCloudService, that.relatedCloudService)
            && Objects.equals(this.relatedCceClusters, that.relatedCceClusters)
            && Objects.equals(this.relatedPrometheusInstances, that.relatedPrometheusInstances)
            && Objects.equals(this.alarmNotification, that.alarmNotification)
            && Objects.equals(this.alarmTemplateSpecItems, that.alarmTemplateSpecItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(relatedCloudService,
            relatedCceClusters,
            relatedPrometheusInstances,
            alarmNotification,
            alarmTemplateSpecItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmRuleTemplateSpecWithCloudService {\n");
        sb.append("    relatedCloudService: ").append(toIndentedString(relatedCloudService)).append("\n");
        sb.append("    relatedCceClusters: ").append(toIndentedString(relatedCceClusters)).append("\n");
        sb.append("    relatedPrometheusInstances: ").append(toIndentedString(relatedPrometheusInstances)).append("\n");
        sb.append("    alarmNotification: ").append(toIndentedString(alarmNotification)).append("\n");
        sb.append("    alarmTemplateSpecItems: ").append(toIndentedString(alarmTemplateSpecItems)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
