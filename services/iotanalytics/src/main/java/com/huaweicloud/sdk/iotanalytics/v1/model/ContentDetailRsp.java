package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** IoTA服务各类数据源详细配置内容 */
public class ContentDetailRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iotda_content")

    private IotdaContentRsp iotdaContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_content")

    private ObsContentRsp obsContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dis_content")

    private DisContentRsp disContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_content")

    private SmnContentRsp smnContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_graph_content")

    private FunctionGraphContentRsp functionGraphContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_arts_content")

    private ModelArtsContentRsp modelArtsContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcs_content")

    private DcsContentRsp dcsContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_content")

    private KafkaContentRsp kafkaContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_content")

    private ApiContentRsp apiContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_content")

    private NodeContentRsp nodeContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_content")

    private EdgeContentRsp edgeContent;

    public ContentDetailRsp withIotdaContent(IotdaContentRsp iotdaContent) {
        this.iotdaContent = iotdaContent;
        return this;
    }

    public ContentDetailRsp withIotdaContent(Consumer<IotdaContentRsp> iotdaContentSetter) {
        if (this.iotdaContent == null) {
            this.iotdaContent = new IotdaContentRsp();
            iotdaContentSetter.accept(this.iotdaContent);
        }

        return this;
    }

    /** Get iotdaContent
     * 
     * @return iotdaContent */
    public IotdaContentRsp getIotdaContent() {
        return iotdaContent;
    }

    public void setIotdaContent(IotdaContentRsp iotdaContent) {
        this.iotdaContent = iotdaContent;
    }

    public ContentDetailRsp withObsContent(ObsContentRsp obsContent) {
        this.obsContent = obsContent;
        return this;
    }

    public ContentDetailRsp withObsContent(Consumer<ObsContentRsp> obsContentSetter) {
        if (this.obsContent == null) {
            this.obsContent = new ObsContentRsp();
            obsContentSetter.accept(this.obsContent);
        }

        return this;
    }

    /** Get obsContent
     * 
     * @return obsContent */
    public ObsContentRsp getObsContent() {
        return obsContent;
    }

    public void setObsContent(ObsContentRsp obsContent) {
        this.obsContent = obsContent;
    }

    public ContentDetailRsp withDisContent(DisContentRsp disContent) {
        this.disContent = disContent;
        return this;
    }

    public ContentDetailRsp withDisContent(Consumer<DisContentRsp> disContentSetter) {
        if (this.disContent == null) {
            this.disContent = new DisContentRsp();
            disContentSetter.accept(this.disContent);
        }

        return this;
    }

    /** Get disContent
     * 
     * @return disContent */
    public DisContentRsp getDisContent() {
        return disContent;
    }

    public void setDisContent(DisContentRsp disContent) {
        this.disContent = disContent;
    }

    public ContentDetailRsp withSmnContent(SmnContentRsp smnContent) {
        this.smnContent = smnContent;
        return this;
    }

    public ContentDetailRsp withSmnContent(Consumer<SmnContentRsp> smnContentSetter) {
        if (this.smnContent == null) {
            this.smnContent = new SmnContentRsp();
            smnContentSetter.accept(this.smnContent);
        }

        return this;
    }

    /** Get smnContent
     * 
     * @return smnContent */
    public SmnContentRsp getSmnContent() {
        return smnContent;
    }

    public void setSmnContent(SmnContentRsp smnContent) {
        this.smnContent = smnContent;
    }

    public ContentDetailRsp withFunctionGraphContent(FunctionGraphContentRsp functionGraphContent) {
        this.functionGraphContent = functionGraphContent;
        return this;
    }

    public ContentDetailRsp withFunctionGraphContent(Consumer<FunctionGraphContentRsp> functionGraphContentSetter) {
        if (this.functionGraphContent == null) {
            this.functionGraphContent = new FunctionGraphContentRsp();
            functionGraphContentSetter.accept(this.functionGraphContent);
        }

        return this;
    }

    /** Get functionGraphContent
     * 
     * @return functionGraphContent */
    public FunctionGraphContentRsp getFunctionGraphContent() {
        return functionGraphContent;
    }

    public void setFunctionGraphContent(FunctionGraphContentRsp functionGraphContent) {
        this.functionGraphContent = functionGraphContent;
    }

    public ContentDetailRsp withModelArtsContent(ModelArtsContentRsp modelArtsContent) {
        this.modelArtsContent = modelArtsContent;
        return this;
    }

    public ContentDetailRsp withModelArtsContent(Consumer<ModelArtsContentRsp> modelArtsContentSetter) {
        if (this.modelArtsContent == null) {
            this.modelArtsContent = new ModelArtsContentRsp();
            modelArtsContentSetter.accept(this.modelArtsContent);
        }

        return this;
    }

    /** Get modelArtsContent
     * 
     * @return modelArtsContent */
    public ModelArtsContentRsp getModelArtsContent() {
        return modelArtsContent;
    }

    public void setModelArtsContent(ModelArtsContentRsp modelArtsContent) {
        this.modelArtsContent = modelArtsContent;
    }

    public ContentDetailRsp withDcsContent(DcsContentRsp dcsContent) {
        this.dcsContent = dcsContent;
        return this;
    }

    public ContentDetailRsp withDcsContent(Consumer<DcsContentRsp> dcsContentSetter) {
        if (this.dcsContent == null) {
            this.dcsContent = new DcsContentRsp();
            dcsContentSetter.accept(this.dcsContent);
        }

        return this;
    }

    /** Get dcsContent
     * 
     * @return dcsContent */
    public DcsContentRsp getDcsContent() {
        return dcsContent;
    }

    public void setDcsContent(DcsContentRsp dcsContent) {
        this.dcsContent = dcsContent;
    }

    public ContentDetailRsp withKafkaContent(KafkaContentRsp kafkaContent) {
        this.kafkaContent = kafkaContent;
        return this;
    }

    public ContentDetailRsp withKafkaContent(Consumer<KafkaContentRsp> kafkaContentSetter) {
        if (this.kafkaContent == null) {
            this.kafkaContent = new KafkaContentRsp();
            kafkaContentSetter.accept(this.kafkaContent);
        }

        return this;
    }

    /** Get kafkaContent
     * 
     * @return kafkaContent */
    public KafkaContentRsp getKafkaContent() {
        return kafkaContent;
    }

    public void setKafkaContent(KafkaContentRsp kafkaContent) {
        this.kafkaContent = kafkaContent;
    }

    public ContentDetailRsp withApiContent(ApiContentRsp apiContent) {
        this.apiContent = apiContent;
        return this;
    }

    public ContentDetailRsp withApiContent(Consumer<ApiContentRsp> apiContentSetter) {
        if (this.apiContent == null) {
            this.apiContent = new ApiContentRsp();
            apiContentSetter.accept(this.apiContent);
        }

        return this;
    }

    /** Get apiContent
     * 
     * @return apiContent */
    public ApiContentRsp getApiContent() {
        return apiContent;
    }

    public void setApiContent(ApiContentRsp apiContent) {
        this.apiContent = apiContent;
    }

    public ContentDetailRsp withNodeContent(NodeContentRsp nodeContent) {
        this.nodeContent = nodeContent;
        return this;
    }

    public ContentDetailRsp withNodeContent(Consumer<NodeContentRsp> nodeContentSetter) {
        if (this.nodeContent == null) {
            this.nodeContent = new NodeContentRsp();
            nodeContentSetter.accept(this.nodeContent);
        }

        return this;
    }

    /** Get nodeContent
     * 
     * @return nodeContent */
    public NodeContentRsp getNodeContent() {
        return nodeContent;
    }

    public void setNodeContent(NodeContentRsp nodeContent) {
        this.nodeContent = nodeContent;
    }

    public ContentDetailRsp withEdgeContent(EdgeContentRsp edgeContent) {
        this.edgeContent = edgeContent;
        return this;
    }

    public ContentDetailRsp withEdgeContent(Consumer<EdgeContentRsp> edgeContentSetter) {
        if (this.edgeContent == null) {
            this.edgeContent = new EdgeContentRsp();
            edgeContentSetter.accept(this.edgeContent);
        }

        return this;
    }

    /** Get edgeContent
     * 
     * @return edgeContent */
    public EdgeContentRsp getEdgeContent() {
        return edgeContent;
    }

    public void setEdgeContent(EdgeContentRsp edgeContent) {
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
        ContentDetailRsp contentDetailRsp = (ContentDetailRsp) o;
        return Objects.equals(this.iotdaContent, contentDetailRsp.iotdaContent)
            && Objects.equals(this.obsContent, contentDetailRsp.obsContent)
            && Objects.equals(this.disContent, contentDetailRsp.disContent)
            && Objects.equals(this.smnContent, contentDetailRsp.smnContent)
            && Objects.equals(this.functionGraphContent, contentDetailRsp.functionGraphContent)
            && Objects.equals(this.modelArtsContent, contentDetailRsp.modelArtsContent)
            && Objects.equals(this.dcsContent, contentDetailRsp.dcsContent)
            && Objects.equals(this.kafkaContent, contentDetailRsp.kafkaContent)
            && Objects.equals(this.apiContent, contentDetailRsp.apiContent)
            && Objects.equals(this.nodeContent, contentDetailRsp.nodeContent)
            && Objects.equals(this.edgeContent, contentDetailRsp.edgeContent);
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
        sb.append("class ContentDetailRsp {\n");
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
