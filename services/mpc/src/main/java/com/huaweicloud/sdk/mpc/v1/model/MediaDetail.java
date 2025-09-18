package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MediaDetail
 */
public class MediaDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "features")

    private List<String> features = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_para")

    private OriginPara originPara;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_video_paras")

    private List<OutputVideoPara> outputVideoParas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replace_sub_index")

    private List<String> replaceSubIndex = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_thumbnail_para")

    private OutputThumbnailPara outputThumbnailPara;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_watermark_paras")

    private OutputWatermarkPara outputWatermarkParas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private List<FileMetaData> metadata = null;

    public MediaDetail withFeatures(List<String> features) {
        this.features = features;
        return this;
    }

    public MediaDetail addFeaturesItem(String featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    public MediaDetail withFeatures(Consumer<List<String>> featuresSetter) {
        if (this.features == null) {
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
        if (this.originPara == null) {
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
        if (this.outputVideoParas == null) {
            this.outputVideoParas = new ArrayList<>();
        }
        this.outputVideoParas.add(outputVideoParasItem);
        return this;
    }

    public MediaDetail withOutputVideoParas(Consumer<List<OutputVideoPara>> outputVideoParasSetter) {
        if (this.outputVideoParas == null) {
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

    public MediaDetail withReplaceSubIndex(List<String> replaceSubIndex) {
        this.replaceSubIndex = replaceSubIndex;
        return this;
    }

    public MediaDetail addReplaceSubIndexItem(String replaceSubIndexItem) {
        if (this.replaceSubIndex == null) {
            this.replaceSubIndex = new ArrayList<>();
        }
        this.replaceSubIndex.add(replaceSubIndexItem);
        return this;
    }

    public MediaDetail withReplaceSubIndex(Consumer<List<String>> replaceSubIndexSetter) {
        if (this.replaceSubIndex == null) {
            this.replaceSubIndex = new ArrayList<>();
        }
        replaceSubIndexSetter.accept(this.replaceSubIndex);
        return this;
    }

    /**
     * 被替换的子索引文件 
     * @return replaceSubIndex
     */
    public List<String> getReplaceSubIndex() {
        return replaceSubIndex;
    }

    public void setReplaceSubIndex(List<String> replaceSubIndex) {
        this.replaceSubIndex = replaceSubIndex;
    }

    public MediaDetail withOutputThumbnailPara(OutputThumbnailPara outputThumbnailPara) {
        this.outputThumbnailPara = outputThumbnailPara;
        return this;
    }

    public MediaDetail withOutputThumbnailPara(Consumer<OutputThumbnailPara> outputThumbnailParaSetter) {
        if (this.outputThumbnailPara == null) {
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
        if (this.outputWatermarkParas == null) {
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

    public MediaDetail withMetadata(List<FileMetaData> metadata) {
        this.metadata = metadata;
        return this;
    }

    public MediaDetail addMetadataItem(FileMetaData metadataItem) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        this.metadata.add(metadataItem);
        return this;
    }

    public MediaDetail withMetadata(Consumer<List<FileMetaData>> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ArrayList<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }

    /**
     * 输出文件的metadata信息 
     * @return metadata
     */
    public List<FileMetaData> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<FileMetaData> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaDetail that = (MediaDetail) obj;
        return Objects.equals(this.features, that.features) && Objects.equals(this.originPara, that.originPara)
            && Objects.equals(this.outputVideoParas, that.outputVideoParas)
            && Objects.equals(this.replaceSubIndex, that.replaceSubIndex)
            && Objects.equals(this.outputThumbnailPara, that.outputThumbnailPara)
            && Objects.equals(this.outputWatermarkParas, that.outputWatermarkParas)
            && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(features,
            originPara,
            outputVideoParas,
            replaceSubIndex,
            outputThumbnailPara,
            outputWatermarkParas,
            metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MediaDetail {\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
        sb.append("    originPara: ").append(toIndentedString(originPara)).append("\n");
        sb.append("    outputVideoParas: ").append(toIndentedString(outputVideoParas)).append("\n");
        sb.append("    replaceSubIndex: ").append(toIndentedString(replaceSubIndex)).append("\n");
        sb.append("    outputThumbnailPara: ").append(toIndentedString(outputThumbnailPara)).append("\n");
        sb.append("    outputWatermarkParas: ").append(toIndentedString(outputWatermarkParas)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
