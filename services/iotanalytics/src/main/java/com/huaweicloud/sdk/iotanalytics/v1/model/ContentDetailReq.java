package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * IoTA服务各类数据源详细配置内容
 */
public class ContentDetailReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iotda_content")

    @JacksonXmlProperty(localName = "iotda_content")

    private IotdaContentReq iotdaContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_content")

    @JacksonXmlProperty(localName = "obs_content")

    private ObsContentReq obsContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis_content")

    @JacksonXmlProperty(localName = "dis_content")

    private DisContentReq disContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_content")

    @JacksonXmlProperty(localName = "smn_content")

    private SmnContentReq smnContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_graph_content")

    @JacksonXmlProperty(localName = "function_graph_content")

    private FunctionGraphContentReq functionGraphContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_arts_content")

    @JacksonXmlProperty(localName = "model_arts_content")

    private ModelArtsContentReq modelArtsContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcs_content")

    @JacksonXmlProperty(localName = "dcs_content")

    private DcsContentReq dcsContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_content")

    @JacksonXmlProperty(localName = "kafka_content")

    private KafkaContentReq kafkaContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_content")

    @JacksonXmlProperty(localName = "api_content")

    private ApiContentReq apiContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_content")

    @JacksonXmlProperty(localName = "node_content")

    private NodeContentReq nodeContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_content")

    @JacksonXmlProperty(localName = "edge_content")

    private EdgeContentReq edgeContent;

    public ContentDetailReq withIotdaContent(IotdaContentReq iotdaContent) {
        this.iotdaContent = iotdaContent;
        return this;
    }

    public ContentDetailReq withIotdaContent(Consumer<IotdaContentReq> iotdaContentSetter) {
        if (this.iotdaContent == null) {
            this.iotdaContent = new IotdaContentReq();
            iotdaContentSetter.accept(this.iotdaContent);
        }

        return this;
    }

    /**
     * Get iotdaContent
     * @return iotdaContent
     */
    public IotdaContentReq getIotdaContent() {
        return iotdaContent;
    }

    public void setIotdaContent(IotdaContentReq iotdaContent) {
        this.iotdaContent = iotdaContent;
    }

    public ContentDetailReq withObsContent(ObsContentReq obsContent) {
        this.obsContent = obsContent;
        return this;
    }

    public ContentDetailReq withObsContent(Consumer<ObsContentReq> obsContentSetter) {
        if (this.obsContent == null) {
            this.obsContent = new ObsContentReq();
            obsContentSetter.accept(this.obsContent);
        }

        return this;
    }

    /**
     * Get obsContent
     * @return obsContent
     */
    public ObsContentReq getObsContent() {
        return obsContent;
    }

    public void setObsContent(ObsContentReq obsContent) {
        this.obsContent = obsContent;
    }

    public ContentDetailReq withDisContent(DisContentReq disContent) {
        this.disContent = disContent;
        return this;
    }

    public ContentDetailReq withDisContent(Consumer<DisContentReq> disContentSetter) {
        if (this.disContent == null) {
            this.disContent = new DisContentReq();
            disContentSetter.accept(this.disContent);
        }

        return this;
    }

    /**
     * Get disContent
     * @return disContent
     */
    public DisContentReq getDisContent() {
        return disContent;
    }

    public void setDisContent(DisContentReq disContent) {
        this.disContent = disContent;
    }

    public ContentDetailReq withSmnContent(SmnContentReq smnContent) {
        this.smnContent = smnContent;
        return this;
    }

    public ContentDetailReq withSmnContent(Consumer<SmnContentReq> smnContentSetter) {
        if (this.smnContent == null) {
            this.smnContent = new SmnContentReq();
            smnContentSetter.accept(this.smnContent);
        }

        return this;
    }

    /**
     * Get smnContent
     * @return smnContent
     */
    public SmnContentReq getSmnContent() {
        return smnContent;
    }

    public void setSmnContent(SmnContentReq smnContent) {
        this.smnContent = smnContent;
    }

    public ContentDetailReq withFunctionGraphContent(FunctionGraphContentReq functionGraphContent) {
        this.functionGraphContent = functionGraphContent;
        return this;
    }

    public ContentDetailReq withFunctionGraphContent(Consumer<FunctionGraphContentReq> functionGraphContentSetter) {
        if (this.functionGraphContent == null) {
            this.functionGraphContent = new FunctionGraphContentReq();
            functionGraphContentSetter.accept(this.functionGraphContent);
        }

        return this;
    }

    /**
     * Get functionGraphContent
     * @return functionGraphContent
     */
    public FunctionGraphContentReq getFunctionGraphContent() {
        return functionGraphContent;
    }

    public void setFunctionGraphContent(FunctionGraphContentReq functionGraphContent) {
        this.functionGraphContent = functionGraphContent;
    }

    public ContentDetailReq withModelArtsContent(ModelArtsContentReq modelArtsContent) {
        this.modelArtsContent = modelArtsContent;
        return this;
    }

    public ContentDetailReq withModelArtsContent(Consumer<ModelArtsContentReq> modelArtsContentSetter) {
        if (this.modelArtsContent == null) {
            this.modelArtsContent = new ModelArtsContentReq();
            modelArtsContentSetter.accept(this.modelArtsContent);
        }

        return this;
    }

    /**
     * Get modelArtsContent
     * @return modelArtsContent
     */
    public ModelArtsContentReq getModelArtsContent() {
        return modelArtsContent;
    }

    public void setModelArtsContent(ModelArtsContentReq modelArtsContent) {
        this.modelArtsContent = modelArtsContent;
    }

    public ContentDetailReq withDcsContent(DcsContentReq dcsContent) {
        this.dcsContent = dcsContent;
        return this;
    }

    public ContentDetailReq withDcsContent(Consumer<DcsContentReq> dcsContentSetter) {
        if (this.dcsContent == null) {
            this.dcsContent = new DcsContentReq();
            dcsContentSetter.accept(this.dcsContent);
        }

        return this;
    }

    /**
     * Get dcsContent
     * @return dcsContent
     */
    public DcsContentReq getDcsContent() {
        return dcsContent;
    }

    public void setDcsContent(DcsContentReq dcsContent) {
        this.dcsContent = dcsContent;
    }

    public ContentDetailReq withKafkaContent(KafkaContentReq kafkaContent) {
        this.kafkaContent = kafkaContent;
        return this;
    }

    public ContentDetailReq withKafkaContent(Consumer<KafkaContentReq> kafkaContentSetter) {
        if (this.kafkaContent == null) {
            this.kafkaContent = new KafkaContentReq();
            kafkaContentSetter.accept(this.kafkaContent);
        }

        return this;
    }

    /**
     * Get kafkaContent
     * @return kafkaContent
     */
    public KafkaContentReq getKafkaContent() {
        return kafkaContent;
    }

    public void setKafkaContent(KafkaContentReq kafkaContent) {
        this.kafkaContent = kafkaContent;
    }

    public ContentDetailReq withApiContent(ApiContentReq apiContent) {
        this.apiContent = apiContent;
        return this;
    }

    public ContentDetailReq withApiContent(Consumer<ApiContentReq> apiContentSetter) {
        if (this.apiContent == null) {
            this.apiContent = new ApiContentReq();
            apiContentSetter.accept(this.apiContent);
        }

        return this;
    }

    /**
     * Get apiContent
     * @return apiContent
     */
    public ApiContentReq getApiContent() {
        return apiContent;
    }

    public void setApiContent(ApiContentReq apiContent) {
        this.apiContent = apiContent;
    }

    public ContentDetailReq withNodeContent(NodeContentReq nodeContent) {
        this.nodeContent = nodeContent;
        return this;
    }

    public ContentDetailReq withNodeContent(Consumer<NodeContentReq> nodeContentSetter) {
        if (this.nodeContent == null) {
            this.nodeContent = new NodeContentReq();
            nodeContentSetter.accept(this.nodeContent);
        }

        return this;
    }

    /**
     * Get nodeContent
     * @return nodeContent
     */
    public NodeContentReq getNodeContent() {
        return nodeContent;
    }

    public void setNodeContent(NodeContentReq nodeContent) {
        this.nodeContent = nodeContent;
    }

    public ContentDetailReq withEdgeContent(EdgeContentReq edgeContent) {
        this.edgeContent = edgeContent;
        return this;
    }

    public ContentDetailReq withEdgeContent(Consumer<EdgeContentReq> edgeContentSetter) {
        if (this.edgeContent == null) {
            this.edgeContent = new EdgeContentReq();
            edgeContentSetter.accept(this.edgeContent);
        }

        return this;
    }

    /**
     * Get edgeContent
     * @return edgeContent
     */
    public EdgeContentReq getEdgeContent() {
        return edgeContent;
    }

    public void setEdgeContent(EdgeContentReq edgeContent) {
        this.edgeContent = edgeContent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentDetailReq contentDetailReq = (ContentDetailReq) o;
        return Objects.equals(this.iotdaContent, contentDetailReq.iotdaContent)
            && Objects.equals(this.obsContent, contentDetailReq.obsContent)
            && Objects.equals(this.disContent, contentDetailReq.disContent)
            && Objects.equals(this.smnContent, contentDetailReq.smnContent)
            && Objects.equals(this.functionGraphContent, contentDetailReq.functionGraphContent)
            && Objects.equals(this.modelArtsContent, contentDetailReq.modelArtsContent)
            && Objects.equals(this.dcsContent, contentDetailReq.dcsContent)
            && Objects.equals(this.kafkaContent, contentDetailReq.kafkaContent)
            && Objects.equals(this.apiContent, contentDetailReq.apiContent)
            && Objects.equals(this.nodeContent, contentDetailReq.nodeContent)
            && Objects.equals(this.edgeContent, contentDetailReq.edgeContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iotdaContent,
            obsContent,
            disContent,
            smnContent,
            functionGraphContent,
            modelArtsContent,
            dcsContent,
            kafkaContent,
            apiContent,
            nodeContent,
            edgeContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentDetailReq {\n");
        sb.append("    iotdaContent: ").append(toIndentedString(iotdaContent)).append("\n");
        sb.append("    obsContent: ").append(toIndentedString(obsContent)).append("\n");
        sb.append("    disContent: ").append(toIndentedString(disContent)).append("\n");
        sb.append("    smnContent: ").append(toIndentedString(smnContent)).append("\n");
        sb.append("    functionGraphContent: ").append(toIndentedString(functionGraphContent)).append("\n");
        sb.append("    modelArtsContent: ").append(toIndentedString(modelArtsContent)).append("\n");
        sb.append("    dcsContent: ").append(toIndentedString(dcsContent)).append("\n");
        sb.append("    kafkaContent: ").append(toIndentedString(kafkaContent)).append("\n");
        sb.append("    apiContent: ").append(toIndentedString(apiContent)).append("\n");
        sb.append("    nodeContent: ").append(toIndentedString(nodeContent)).append("\n");
        sb.append("    edgeContent: ").append(toIndentedString(edgeContent)).append("\n");
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
