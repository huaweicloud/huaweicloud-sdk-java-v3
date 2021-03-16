package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.OriginPara;
import com.huaweicloud.sdk.mpc.v1.model.OutputThumbnailPara;
import com.huaweicloud.sdk.mpc.v1.model.OutputVideoPara;
import com.huaweicloud.sdk.mpc.v1.model.OutputWatermarkPara;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MediaDetail
 */
public class MediaDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="features")
    
    private List<String> features = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="origin_para")
    
    private OriginPara originPara;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_video_paras")
    
    private List<OutputVideoPara> outputVideoParas = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_thumbnail_para")
    
    private OutputThumbnailPara outputThumbnailPara;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_watermark_paras")
    
    private OutputWatermarkPara outputWatermarkParas;

    public MediaDetail withFeatures(List<String> features) {
        this.features = features;
        return this;
    }

    
    public MediaDetail addFeaturesItem(String featuresItem) {
        this.features.add(featuresItem);
        return this;
    }

    public MediaDetail withFeatures(Consumer<List<String>> featuresSetter) {
        if(this.features == null ){
            this.features = new ArrayList<>();
        }
        featuresSetter.accept(this.features);
        return this;
    }

    /**
     * 任务名称
     * @return features
     */
    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    

    public MediaDetail withOriginPara(OriginPara originPara) {
        this.originPara = originPara;
        return this;
    }

    public MediaDetail withOriginPara(Consumer<OriginPara> originParaSetter) {
        if(this.originPara == null ){
            this.originPara = new OriginPara();
            originParaSetter.accept(this.originPara);
        }
        
        return this;
    }


    /**
     * Get originPara
     * @return originPara
     */
    public OriginPara getOriginPara() {
        return originPara;
    }

    public void setOriginPara(OriginPara originPara) {
        this.originPara = originPara;
    }

    

    public MediaDetail withOutputVideoParas(List<OutputVideoPara> outputVideoParas) {
        this.outputVideoParas = outputVideoParas;
        return this;
    }

    
    public MediaDetail addOutputVideoParasItem(OutputVideoPara outputVideoParasItem) {
        this.outputVideoParas.add(outputVideoParasItem);
        return this;
    }

    public MediaDetail withOutputVideoParas(Consumer<List<OutputVideoPara>> outputVideoParasSetter) {
        if(this.outputVideoParas == null ){
            this.outputVideoParas = new ArrayList<>();
        }
        outputVideoParasSetter.accept(this.outputVideoParas);
        return this;
    }

    /**
     * 多路输出片源信息
     * @return outputVideoParas
     */
    public List<OutputVideoPara> getOutputVideoParas() {
        return outputVideoParas;
    }

    public void setOutputVideoParas(List<OutputVideoPara> outputVideoParas) {
        this.outputVideoParas = outputVideoParas;
    }

    

    public MediaDetail withOutputThumbnailPara(OutputThumbnailPara outputThumbnailPara) {
        this.outputThumbnailPara = outputThumbnailPara;
        return this;
    }

    public MediaDetail withOutputThumbnailPara(Consumer<OutputThumbnailPara> outputThumbnailParaSetter) {
        if(this.outputThumbnailPara == null ){
            this.outputThumbnailPara = new OutputThumbnailPara();
            outputThumbnailParaSetter.accept(this.outputThumbnailPara);
        }
        
        return this;
    }


    /**
     * Get outputThumbnailPara
     * @return outputThumbnailPara
     */
    public OutputThumbnailPara getOutputThumbnailPara() {
        return outputThumbnailPara;
    }

    public void setOutputThumbnailPara(OutputThumbnailPara outputThumbnailPara) {
        this.outputThumbnailPara = outputThumbnailPara;
    }

    

    public MediaDetail withOutputWatermarkParas(OutputWatermarkPara outputWatermarkParas) {
        this.outputWatermarkParas = outputWatermarkParas;
        return this;
    }

    public MediaDetail withOutputWatermarkParas(Consumer<OutputWatermarkPara> outputWatermarkParasSetter) {
        if(this.outputWatermarkParas == null ){
            this.outputWatermarkParas = new OutputWatermarkPara();
            outputWatermarkParasSetter.accept(this.outputWatermarkParas);
        }
        
        return this;
    }


    /**
     * Get outputWatermarkParas
     * @return outputWatermarkParas
     */
    public OutputWatermarkPara getOutputWatermarkParas() {
        return outputWatermarkParas;
    }

    public void setOutputWatermarkParas(OutputWatermarkPara outputWatermarkParas) {
        this.outputWatermarkParas = outputWatermarkParas;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MediaDetail mediaDetail = (MediaDetail) o;
        return Objects.equals(this.features, mediaDetail.features) &&
            Objects.equals(this.originPara, mediaDetail.originPara) &&
            Objects.equals(this.outputVideoParas, mediaDetail.outputVideoParas) &&
            Objects.equals(this.outputThumbnailPara, mediaDetail.outputThumbnailPara) &&
            Objects.equals(this.outputWatermarkParas, mediaDetail.outputWatermarkParas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(features, originPara, outputVideoParas, outputThumbnailPara, outputWatermarkParas);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MediaDetail {\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
        sb.append("    originPara: ").append(toIndentedString(originPara)).append("\n");
        sb.append("    outputVideoParas: ").append(toIndentedString(outputVideoParas)).append("\n");
        sb.append("    outputThumbnailPara: ").append(toIndentedString(outputThumbnailPara)).append("\n");
        sb.append("    outputWatermarkParas: ").append(toIndentedString(outputWatermarkParas)).append("\n");
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

