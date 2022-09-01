package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TranscriberResult
 */
public class TranscriberResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    @JacksonXmlProperty(localName = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analysis_info")

    @JacksonXmlProperty(localName = "analysis_info")

    private AnalysisInfoResult analysisInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "word_info")

    @JacksonXmlProperty(localName = "word_info")

    private List<WordInfo> wordInfo = null;

    public TranscriberResult withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 识别结果文本。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TranscriberResult withAnalysisInfo(AnalysisInfoResult analysisInfo) {
        this.analysisInfo = analysisInfo;
        return this;
    }

    public TranscriberResult withAnalysisInfo(Consumer<AnalysisInfoResult> analysisInfoSetter) {
        if (this.analysisInfo == null) {
            this.analysisInfo = new AnalysisInfoResult();
            analysisInfoSetter.accept(this.analysisInfo);
        }

        return this;
    }

    /**
     * Get analysisInfo
     * @return analysisInfo
     */
    public AnalysisInfoResult getAnalysisInfo() {
        return analysisInfo;
    }

    public void setAnalysisInfo(AnalysisInfoResult analysisInfo) {
        this.analysisInfo = analysisInfo;
    }

    public TranscriberResult withWordInfo(List<WordInfo> wordInfo) {
        this.wordInfo = wordInfo;
        return this;
    }

    public TranscriberResult addWordInfoItem(WordInfo wordInfoItem) {
        if (this.wordInfo == null) {
            this.wordInfo = new ArrayList<>();
        }
        this.wordInfo.add(wordInfoItem);
        return this;
    }

    public TranscriberResult withWordInfo(Consumer<List<WordInfo>> wordInfoSetter) {
        if (this.wordInfo == null) {
            this.wordInfo = new ArrayList<>();
        }
        wordInfoSetter.accept(this.wordInfo);
        return this;
    }

    /**
     * 分词输出列表
     * @return wordInfo
     */
    public List<WordInfo> getWordInfo() {
        return wordInfo;
    }

    public void setWordInfo(List<WordInfo> wordInfo) {
        this.wordInfo = wordInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TranscriberResult transcriberResult = (TranscriberResult) o;
        return Objects.equals(this.text, transcriberResult.text)
            && Objects.equals(this.analysisInfo, transcriberResult.analysisInfo)
            && Objects.equals(this.wordInfo, transcriberResult.wordInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, analysisInfo, wordInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscriberResult {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    analysisInfo: ").append(toIndentedString(analysisInfo)).append("\n");
        sb.append("    wordInfo: ").append(toIndentedString(wordInfo)).append("\n");
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
