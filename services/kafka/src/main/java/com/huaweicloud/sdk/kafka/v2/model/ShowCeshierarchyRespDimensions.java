package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.ShowCeshierarchyRespChildren;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowCeshierarchyRespDimensions
 */
public class ShowCeshierarchyRespDimensions  {



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
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="children")
    
    private List<ShowCeshierarchyRespChildren> children = null;
    
    public ShowCeshierarchyRespDimensions withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 监控维度名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowCeshierarchyRespDimensions withMetrics(List<String> metrics) {
        this.metrics = metrics;
        return this;
    }

    
    public ShowCeshierarchyRespDimensions addMetricsItem(String metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public ShowCeshierarchyRespDimensions withMetrics(Consumer<List<String>> metricsSetter) {
        if(this.metrics == null ){
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 监控指标名称。请参考[支持的监控指标](https://support.huaweicloud.com/usermanual-kafka/kafka-ug-180413002.html)。
     * @return metrics
     */
    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    public ShowCeshierarchyRespDimensions withKeyName(List<String> keyName) {
        this.keyName = keyName;
        return this;
    }

    
    public ShowCeshierarchyRespDimensions addKeyNameItem(String keyNameItem) {
        if (this.keyName == null) {
            this.keyName = new ArrayList<>();
        }
        this.keyName.add(keyNameItem);
        return this;
    }

    public ShowCeshierarchyRespDimensions withKeyName(Consumer<List<String>> keyNameSetter) {
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

    public ShowCeshierarchyRespDimensions withDimRouter(List<String> dimRouter) {
        this.dimRouter = dimRouter;
        return this;
    }

    
    public ShowCeshierarchyRespDimensions addDimRouterItem(String dimRouterItem) {
        if (this.dimRouter == null) {
            this.dimRouter = new ArrayList<>();
        }
        this.dimRouter.add(dimRouterItem);
        return this;
    }

    public ShowCeshierarchyRespDimensions withDimRouter(Consumer<List<String>> dimRouterSetter) {
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

    public ShowCeshierarchyRespDimensions withChildren(List<ShowCeshierarchyRespChildren> children) {
        this.children = children;
        return this;
    }

    
    public ShowCeshierarchyRespDimensions addChildrenItem(ShowCeshierarchyRespChildren childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public ShowCeshierarchyRespDimensions withChildren(Consumer<List<ShowCeshierarchyRespChildren>> childrenSetter) {
        if(this.children == null ){
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子维度列表。
     * @return children
     */
    public List<ShowCeshierarchyRespChildren> getChildren() {
        return children;
    }

    public void setChildren(List<ShowCeshierarchyRespChildren> children) {
        this.children = children;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCeshierarchyRespDimensions showCeshierarchyRespDimensions = (ShowCeshierarchyRespDimensions) o;
        return Objects.equals(this.name, showCeshierarchyRespDimensions.name) &&
            Objects.equals(this.metrics, showCeshierarchyRespDimensions.metrics) &&
            Objects.equals(this.keyName, showCeshierarchyRespDimensions.keyName) &&
            Objects.equals(this.dimRouter, showCeshierarchyRespDimensions.dimRouter) &&
            Objects.equals(this.children, showCeshierarchyRespDimensions.children);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, metrics, keyName, dimRouter, children);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCeshierarchyRespDimensions {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    dimRouter: ").append(toIndentedString(dimRouter)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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

