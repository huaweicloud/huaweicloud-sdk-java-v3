package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 子维度信息。
 */
public class ShowCeshierarchyRespChildren  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metrics")
    
    private List<String> metrics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_name")
    
    private List<String> keyName = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dim_router")
    
    private List<String> dimRouter = null;
    
    public ShowCeshierarchyRespChildren withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 子维度名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ShowCeshierarchyRespChildren withMetrics(List<String> metrics) {
        this.metrics = metrics;
        return this;
    }

    
    public ShowCeshierarchyRespChildren addMetricsItem(String metricsItem) {
        this.metrics.add(metricsItem);
        return this;
    }

    public ShowCeshierarchyRespChildren withMetrics(Consumer<List<String>> metricsSetter) {
        if(this.metrics == null ){
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 监控指标名称列表。
     * @return metrics
     */
    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    

    public ShowCeshierarchyRespChildren withKeyName(List<String> keyName) {
        this.keyName = keyName;
        return this;
    }

    
    public ShowCeshierarchyRespChildren addKeyNameItem(String keyNameItem) {
        this.keyName.add(keyNameItem);
        return this;
    }

    public ShowCeshierarchyRespChildren withKeyName(Consumer<List<String>> keyNameSetter) {
        if(this.keyName == null ){
            this.keyName = new ArrayList<>();
        }
        keyNameSetter.accept(this.keyName);
        return this;
    }

    /**
     * 监控查询使用的key。
     * @return keyName
     */
    public List<String> getKeyName() {
        return keyName;
    }

    public void setKeyName(List<String> keyName) {
        this.keyName = keyName;
    }

    

    public ShowCeshierarchyRespChildren withDimRouter(List<String> dimRouter) {
        this.dimRouter = dimRouter;
        return this;
    }

    
    public ShowCeshierarchyRespChildren addDimRouterItem(String dimRouterItem) {
        this.dimRouter.add(dimRouterItem);
        return this;
    }

    public ShowCeshierarchyRespChildren withDimRouter(Consumer<List<String>> dimRouterSetter) {
        if(this.dimRouter == null ){
            this.dimRouter = new ArrayList<>();
        }
        dimRouterSetter.accept(this.dimRouter);
        return this;
    }

    /**
     * 监控维度路由。
     * @return dimRouter
     */
    public List<String> getDimRouter() {
        return dimRouter;
    }

    public void setDimRouter(List<String> dimRouter) {
        this.dimRouter = dimRouter;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCeshierarchyRespChildren showCeshierarchyRespChildren = (ShowCeshierarchyRespChildren) o;
        return Objects.equals(this.name, showCeshierarchyRespChildren.name) &&
            Objects.equals(this.metrics, showCeshierarchyRespChildren.metrics) &&
            Objects.equals(this.keyName, showCeshierarchyRespChildren.keyName) &&
            Objects.equals(this.dimRouter, showCeshierarchyRespChildren.dimRouter);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, metrics, keyName, dimRouter);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCeshierarchyRespChildren {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    dimRouter: ").append(toIndentedString(dimRouter)).append("\n");
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

