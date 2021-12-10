package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 度量项 */
public class MetricInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_size")

    private String codeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw_lines")

    private String rawLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "methods_total")

    private String methodsTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cyclomatic_complexity_total")

    private String cyclomaticComplexityTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cyclomatic_complexity_per_method")

    private String cyclomaticComplexityPerMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_cyclomatic_complexity")

    private String maximumCyclomaticComplexity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_cyclomatic_complexity_total")

    private String hugeCyclomaticComplexityTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_cyclomatic_complexity_ratio")

    private String hugeCyclomaticComplexityRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cca_cyclomatic_complexity_total")

    private String ccaCyclomaticComplexityTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cca_cyclomatic_complexity_per_method")

    private String ccaCyclomaticComplexityPerMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_cca_cyclomatic_complexity")

    private String maximumCcaCyclomaticComplexity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_cca_cyclomatic_complexity_total")

    private String hugeCcaCyclomaticComplexityTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cyclomatic_complexity_adequacy")

    private String cyclomaticComplexityAdequacy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_depth")

    private String maximumDepth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_depth_total")

    private String hugeDepthTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_depth_ratio")

    private String hugeDepthRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method_lines")

    private String methodLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lines_per_method")

    private String linesPerMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_method_total")

    private String hugeMethodTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_method_ratio")

    private String hugeMethodRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "files_total")

    private String filesTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "folders_total")

    private String foldersTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lines_per_file")

    private String linesPerFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_headerfile_total")

    private String hugeHeaderfileTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_headerfile_ratio")

    private String hugeHeaderfileRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_non_headerfile_total")

    private String hugeNonHeaderfileTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_non_headerfile_ratio")

    private String hugeNonHeaderfileRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_folder_total")

    private String hugeFolderTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "huge_folder_ratio")

    private String hugeFolderRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_duplication_total")

    private String fileDuplicationTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_duplication_ratio")

    private String fileDuplicationRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_hfile_duplication_total")

    private String nonHfileDuplicationTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_hfile_duplication_ratio")

    private String nonHfileDuplicationRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_duplication_total")

    private String codeDuplicationTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_duplication_ratio")

    private String codeDuplicationRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_hfile_code_duplication_total")

    private String nonHfileCodeDuplicationTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_hfile_code_duplication_ratio")

    private String nonHfileCodeDuplicationRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsafe_functions_total")

    private String unsafeFunctionsTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsafe_functions_kloc")

    private String unsafeFunctionsKloc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redundant_code_total")

    private String redundantCodeTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redundant_code_kloc")

    private String redundantCodeKloc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warning_suppression_total")

    private String warningSuppressionTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warning_suppression_kloc")

    private String warningSuppressionKloc;

    public MetricInfo withCodeSize(String codeSize) {
        this.codeSize = codeSize;
        return this;
    }

    /** 代码规模
     * 
     * @return codeSize */
    public String getCodeSize() {
        return codeSize;
    }

    public void setCodeSize(String codeSize) {
        this.codeSize = codeSize;
    }

    public MetricInfo withRawLines(String rawLines) {
        this.rawLines = rawLines;
        return this;
    }

    /** 原始代码行数
     * 
     * @return rawLines */
    public String getRawLines() {
        return rawLines;
    }

    public void setRawLines(String rawLines) {
        this.rawLines = rawLines;
    }

    public MetricInfo withMethodsTotal(String methodsTotal) {
        this.methodsTotal = methodsTotal;
        return this;
    }

    /** 函数总数
     * 
     * @return methodsTotal */
    public String getMethodsTotal() {
        return methodsTotal;
    }

    public void setMethodsTotal(String methodsTotal) {
        this.methodsTotal = methodsTotal;
    }

    public MetricInfo withCyclomaticComplexityTotal(String cyclomaticComplexityTotal) {
        this.cyclomaticComplexityTotal = cyclomaticComplexityTotal;
        return this;
    }

    /** 圈复杂度总数
     * 
     * @return cyclomaticComplexityTotal */
    public String getCyclomaticComplexityTotal() {
        return cyclomaticComplexityTotal;
    }

    public void setCyclomaticComplexityTotal(String cyclomaticComplexityTotal) {
        this.cyclomaticComplexityTotal = cyclomaticComplexityTotal;
    }

    public MetricInfo withCyclomaticComplexityPerMethod(String cyclomaticComplexityPerMethod) {
        this.cyclomaticComplexityPerMethod = cyclomaticComplexityPerMethod;
        return this;
    }

    /** 平均圈复杂度
     * 
     * @return cyclomaticComplexityPerMethod */
    public String getCyclomaticComplexityPerMethod() {
        return cyclomaticComplexityPerMethod;
    }

    public void setCyclomaticComplexityPerMethod(String cyclomaticComplexityPerMethod) {
        this.cyclomaticComplexityPerMethod = cyclomaticComplexityPerMethod;
    }

    public MetricInfo withMaximumCyclomaticComplexity(String maximumCyclomaticComplexity) {
        this.maximumCyclomaticComplexity = maximumCyclomaticComplexity;
        return this;
    }

    /** 最大圈复杂度
     * 
     * @return maximumCyclomaticComplexity */
    public String getMaximumCyclomaticComplexity() {
        return maximumCyclomaticComplexity;
    }

    public void setMaximumCyclomaticComplexity(String maximumCyclomaticComplexity) {
        this.maximumCyclomaticComplexity = maximumCyclomaticComplexity;
    }

    public MetricInfo withHugeCyclomaticComplexityTotal(String hugeCyclomaticComplexityTotal) {
        this.hugeCyclomaticComplexityTotal = hugeCyclomaticComplexityTotal;
        return this;
    }

    /** 超大圈复杂度数
     * 
     * @return hugeCyclomaticComplexityTotal */
    public String getHugeCyclomaticComplexityTotal() {
        return hugeCyclomaticComplexityTotal;
    }

    public void setHugeCyclomaticComplexityTotal(String hugeCyclomaticComplexityTotal) {
        this.hugeCyclomaticComplexityTotal = hugeCyclomaticComplexityTotal;
    }

    public MetricInfo withHugeCyclomaticComplexityRatio(String hugeCyclomaticComplexityRatio) {
        this.hugeCyclomaticComplexityRatio = hugeCyclomaticComplexityRatio;
        return this;
    }

    /** 超大圈复杂度比例
     * 
     * @return hugeCyclomaticComplexityRatio */
    public String getHugeCyclomaticComplexityRatio() {
        return hugeCyclomaticComplexityRatio;
    }

    public void setHugeCyclomaticComplexityRatio(String hugeCyclomaticComplexityRatio) {
        this.hugeCyclomaticComplexityRatio = hugeCyclomaticComplexityRatio;
    }

    public MetricInfo withCcaCyclomaticComplexityTotal(String ccaCyclomaticComplexityTotal) {
        this.ccaCyclomaticComplexityTotal = ccaCyclomaticComplexityTotal;
        return this;
    }

    /** cca圈复杂度总数
     * 
     * @return ccaCyclomaticComplexityTotal */
    public String getCcaCyclomaticComplexityTotal() {
        return ccaCyclomaticComplexityTotal;
    }

    public void setCcaCyclomaticComplexityTotal(String ccaCyclomaticComplexityTotal) {
        this.ccaCyclomaticComplexityTotal = ccaCyclomaticComplexityTotal;
    }

    public MetricInfo withCcaCyclomaticComplexityPerMethod(String ccaCyclomaticComplexityPerMethod) {
        this.ccaCyclomaticComplexityPerMethod = ccaCyclomaticComplexityPerMethod;
        return this;
    }

    /** cca平均圈复杂度
     * 
     * @return ccaCyclomaticComplexityPerMethod */
    public String getCcaCyclomaticComplexityPerMethod() {
        return ccaCyclomaticComplexityPerMethod;
    }

    public void setCcaCyclomaticComplexityPerMethod(String ccaCyclomaticComplexityPerMethod) {
        this.ccaCyclomaticComplexityPerMethod = ccaCyclomaticComplexityPerMethod;
    }

    public MetricInfo withMaximumCcaCyclomaticComplexity(String maximumCcaCyclomaticComplexity) {
        this.maximumCcaCyclomaticComplexity = maximumCcaCyclomaticComplexity;
        return this;
    }

    /** cca最大圈复杂度
     * 
     * @return maximumCcaCyclomaticComplexity */
    public String getMaximumCcaCyclomaticComplexity() {
        return maximumCcaCyclomaticComplexity;
    }

    public void setMaximumCcaCyclomaticComplexity(String maximumCcaCyclomaticComplexity) {
        this.maximumCcaCyclomaticComplexity = maximumCcaCyclomaticComplexity;
    }

    public MetricInfo withHugeCcaCyclomaticComplexityTotal(String hugeCcaCyclomaticComplexityTotal) {
        this.hugeCcaCyclomaticComplexityTotal = hugeCcaCyclomaticComplexityTotal;
        return this;
    }

    /** 超大圈复杂度函数总数
     * 
     * @return hugeCcaCyclomaticComplexityTotal */
    public String getHugeCcaCyclomaticComplexityTotal() {
        return hugeCcaCyclomaticComplexityTotal;
    }

    public void setHugeCcaCyclomaticComplexityTotal(String hugeCcaCyclomaticComplexityTotal) {
        this.hugeCcaCyclomaticComplexityTotal = hugeCcaCyclomaticComplexityTotal;
    }

    public MetricInfo withCyclomaticComplexityAdequacy(String cyclomaticComplexityAdequacy) {
        this.cyclomaticComplexityAdequacy = cyclomaticComplexityAdequacy;
        return this;
    }

    /** 圈复杂度满足度
     * 
     * @return cyclomaticComplexityAdequacy */
    public String getCyclomaticComplexityAdequacy() {
        return cyclomaticComplexityAdequacy;
    }

    public void setCyclomaticComplexityAdequacy(String cyclomaticComplexityAdequacy) {
        this.cyclomaticComplexityAdequacy = cyclomaticComplexityAdequacy;
    }

    public MetricInfo withMaximumDepth(String maximumDepth) {
        this.maximumDepth = maximumDepth;
        return this;
    }

    /** 最大深度
     * 
     * @return maximumDepth */
    public String getMaximumDepth() {
        return maximumDepth;
    }

    public void setMaximumDepth(String maximumDepth) {
        this.maximumDepth = maximumDepth;
    }

    public MetricInfo withHugeDepthTotal(String hugeDepthTotal) {
        this.hugeDepthTotal = hugeDepthTotal;
        return this;
    }

    /** 超大深度数
     * 
     * @return hugeDepthTotal */
    public String getHugeDepthTotal() {
        return hugeDepthTotal;
    }

    public void setHugeDepthTotal(String hugeDepthTotal) {
        this.hugeDepthTotal = hugeDepthTotal;
    }

    public MetricInfo withHugeDepthRatio(String hugeDepthRatio) {
        this.hugeDepthRatio = hugeDepthRatio;
        return this;
    }

    /** 超大深度占比
     * 
     * @return hugeDepthRatio */
    public String getHugeDepthRatio() {
        return hugeDepthRatio;
    }

    public void setHugeDepthRatio(String hugeDepthRatio) {
        this.hugeDepthRatio = hugeDepthRatio;
    }

    public MetricInfo withMethodLines(String methodLines) {
        this.methodLines = methodLines;
        return this;
    }

    /** 函数总行数
     * 
     * @return methodLines */
    public String getMethodLines() {
        return methodLines;
    }

    public void setMethodLines(String methodLines) {
        this.methodLines = methodLines;
    }

    public MetricInfo withLinesPerMethod(String linesPerMethod) {
        this.linesPerMethod = linesPerMethod;
        return this;
    }

    /** 函数平均代码行
     * 
     * @return linesPerMethod */
    public String getLinesPerMethod() {
        return linesPerMethod;
    }

    public void setLinesPerMethod(String linesPerMethod) {
        this.linesPerMethod = linesPerMethod;
    }

    public MetricInfo withHugeMethodTotal(String hugeMethodTotal) {
        this.hugeMethodTotal = hugeMethodTotal;
        return this;
    }

    /** 超大函数数
     * 
     * @return hugeMethodTotal */
    public String getHugeMethodTotal() {
        return hugeMethodTotal;
    }

    public void setHugeMethodTotal(String hugeMethodTotal) {
        this.hugeMethodTotal = hugeMethodTotal;
    }

    public MetricInfo withHugeMethodRatio(String hugeMethodRatio) {
        this.hugeMethodRatio = hugeMethodRatio;
        return this;
    }

    /** 超大函数占比
     * 
     * @return hugeMethodRatio */
    public String getHugeMethodRatio() {
        return hugeMethodRatio;
    }

    public void setHugeMethodRatio(String hugeMethodRatio) {
        this.hugeMethodRatio = hugeMethodRatio;
    }

    public MetricInfo withFilesTotal(String filesTotal) {
        this.filesTotal = filesTotal;
        return this;
    }

    /** 文件总数
     * 
     * @return filesTotal */
    public String getFilesTotal() {
        return filesTotal;
    }

    public void setFilesTotal(String filesTotal) {
        this.filesTotal = filesTotal;
    }

    public MetricInfo withFoldersTotal(String foldersTotal) {
        this.foldersTotal = foldersTotal;
        return this;
    }

    /** 目录总数
     * 
     * @return foldersTotal */
    public String getFoldersTotal() {
        return foldersTotal;
    }

    public void setFoldersTotal(String foldersTotal) {
        this.foldersTotal = foldersTotal;
    }

    public MetricInfo withLinesPerFile(String linesPerFile) {
        this.linesPerFile = linesPerFile;
        return this;
    }

    /** 文件平均代码行
     * 
     * @return linesPerFile */
    public String getLinesPerFile() {
        return linesPerFile;
    }

    public void setLinesPerFile(String linesPerFile) {
        this.linesPerFile = linesPerFile;
    }

    public MetricInfo withHugeHeaderfileTotal(String hugeHeaderfileTotal) {
        this.hugeHeaderfileTotal = hugeHeaderfileTotal;
        return this;
    }

    /** 超大头文件数
     * 
     * @return hugeHeaderfileTotal */
    public String getHugeHeaderfileTotal() {
        return hugeHeaderfileTotal;
    }

    public void setHugeHeaderfileTotal(String hugeHeaderfileTotal) {
        this.hugeHeaderfileTotal = hugeHeaderfileTotal;
    }

    public MetricInfo withHugeHeaderfileRatio(String hugeHeaderfileRatio) {
        this.hugeHeaderfileRatio = hugeHeaderfileRatio;
        return this;
    }

    /** 超大头文件占比
     * 
     * @return hugeHeaderfileRatio */
    public String getHugeHeaderfileRatio() {
        return hugeHeaderfileRatio;
    }

    public void setHugeHeaderfileRatio(String hugeHeaderfileRatio) {
        this.hugeHeaderfileRatio = hugeHeaderfileRatio;
    }

    public MetricInfo withHugeNonHeaderfileTotal(String hugeNonHeaderfileTotal) {
        this.hugeNonHeaderfileTotal = hugeNonHeaderfileTotal;
        return this;
    }

    /** 超大源文件数
     * 
     * @return hugeNonHeaderfileTotal */
    public String getHugeNonHeaderfileTotal() {
        return hugeNonHeaderfileTotal;
    }

    public void setHugeNonHeaderfileTotal(String hugeNonHeaderfileTotal) {
        this.hugeNonHeaderfileTotal = hugeNonHeaderfileTotal;
    }

    public MetricInfo withHugeNonHeaderfileRatio(String hugeNonHeaderfileRatio) {
        this.hugeNonHeaderfileRatio = hugeNonHeaderfileRatio;
        return this;
    }

    /** 超大源文件占比
     * 
     * @return hugeNonHeaderfileRatio */
    public String getHugeNonHeaderfileRatio() {
        return hugeNonHeaderfileRatio;
    }

    public void setHugeNonHeaderfileRatio(String hugeNonHeaderfileRatio) {
        this.hugeNonHeaderfileRatio = hugeNonHeaderfileRatio;
    }

    public MetricInfo withHugeFolderTotal(String hugeFolderTotal) {
        this.hugeFolderTotal = hugeFolderTotal;
        return this;
    }

    /** 超大目录数
     * 
     * @return hugeFolderTotal */
    public String getHugeFolderTotal() {
        return hugeFolderTotal;
    }

    public void setHugeFolderTotal(String hugeFolderTotal) {
        this.hugeFolderTotal = hugeFolderTotal;
    }

    public MetricInfo withHugeFolderRatio(String hugeFolderRatio) {
        this.hugeFolderRatio = hugeFolderRatio;
        return this;
    }

    /** 超大目录占比
     * 
     * @return hugeFolderRatio */
    public String getHugeFolderRatio() {
        return hugeFolderRatio;
    }

    public void setHugeFolderRatio(String hugeFolderRatio) {
        this.hugeFolderRatio = hugeFolderRatio;
    }

    public MetricInfo withFileDuplicationTotal(String fileDuplicationTotal) {
        this.fileDuplicationTotal = fileDuplicationTotal;
        return this;
    }

    /** 重复文件数
     * 
     * @return fileDuplicationTotal */
    public String getFileDuplicationTotal() {
        return fileDuplicationTotal;
    }

    public void setFileDuplicationTotal(String fileDuplicationTotal) {
        this.fileDuplicationTotal = fileDuplicationTotal;
    }

    public MetricInfo withFileDuplicationRatio(String fileDuplicationRatio) {
        this.fileDuplicationRatio = fileDuplicationRatio;
        return this;
    }

    /** 文件重复率
     * 
     * @return fileDuplicationRatio */
    public String getFileDuplicationRatio() {
        return fileDuplicationRatio;
    }

    public void setFileDuplicationRatio(String fileDuplicationRatio) {
        this.fileDuplicationRatio = fileDuplicationRatio;
    }

    public MetricInfo withNonHfileDuplicationTotal(String nonHfileDuplicationTotal) {
        this.nonHfileDuplicationTotal = nonHfileDuplicationTotal;
        return this;
    }

    /** 重复源文件数
     * 
     * @return nonHfileDuplicationTotal */
    public String getNonHfileDuplicationTotal() {
        return nonHfileDuplicationTotal;
    }

    public void setNonHfileDuplicationTotal(String nonHfileDuplicationTotal) {
        this.nonHfileDuplicationTotal = nonHfileDuplicationTotal;
    }

    public MetricInfo withNonHfileDuplicationRatio(String nonHfileDuplicationRatio) {
        this.nonHfileDuplicationRatio = nonHfileDuplicationRatio;
        return this;
    }

    /** 源文件重复率
     * 
     * @return nonHfileDuplicationRatio */
    public String getNonHfileDuplicationRatio() {
        return nonHfileDuplicationRatio;
    }

    public void setNonHfileDuplicationRatio(String nonHfileDuplicationRatio) {
        this.nonHfileDuplicationRatio = nonHfileDuplicationRatio;
    }

    public MetricInfo withCodeDuplicationTotal(String codeDuplicationTotal) {
        this.codeDuplicationTotal = codeDuplicationTotal;
        return this;
    }

    /** 代码重复数
     * 
     * @return codeDuplicationTotal */
    public String getCodeDuplicationTotal() {
        return codeDuplicationTotal;
    }

    public void setCodeDuplicationTotal(String codeDuplicationTotal) {
        this.codeDuplicationTotal = codeDuplicationTotal;
    }

    public MetricInfo withCodeDuplicationRatio(String codeDuplicationRatio) {
        this.codeDuplicationRatio = codeDuplicationRatio;
        return this;
    }

    /** 代码重复率
     * 
     * @return codeDuplicationRatio */
    public String getCodeDuplicationRatio() {
        return codeDuplicationRatio;
    }

    public void setCodeDuplicationRatio(String codeDuplicationRatio) {
        this.codeDuplicationRatio = codeDuplicationRatio;
    }

    public MetricInfo withNonHfileCodeDuplicationTotal(String nonHfileCodeDuplicationTotal) {
        this.nonHfileCodeDuplicationTotal = nonHfileCodeDuplicationTotal;
        return this;
    }

    /** 源文件代码重复数
     * 
     * @return nonHfileCodeDuplicationTotal */
    public String getNonHfileCodeDuplicationTotal() {
        return nonHfileCodeDuplicationTotal;
    }

    public void setNonHfileCodeDuplicationTotal(String nonHfileCodeDuplicationTotal) {
        this.nonHfileCodeDuplicationTotal = nonHfileCodeDuplicationTotal;
    }

    public MetricInfo withNonHfileCodeDuplicationRatio(String nonHfileCodeDuplicationRatio) {
        this.nonHfileCodeDuplicationRatio = nonHfileCodeDuplicationRatio;
        return this;
    }

    /** 源文件代码重复率
     * 
     * @return nonHfileCodeDuplicationRatio */
    public String getNonHfileCodeDuplicationRatio() {
        return nonHfileCodeDuplicationRatio;
    }

    public void setNonHfileCodeDuplicationRatio(String nonHfileCodeDuplicationRatio) {
        this.nonHfileCodeDuplicationRatio = nonHfileCodeDuplicationRatio;
    }

    public MetricInfo withUnsafeFunctionsTotal(String unsafeFunctionsTotal) {
        this.unsafeFunctionsTotal = unsafeFunctionsTotal;
        return this;
    }

    /** 危险函数总数
     * 
     * @return unsafeFunctionsTotal */
    public String getUnsafeFunctionsTotal() {
        return unsafeFunctionsTotal;
    }

    public void setUnsafeFunctionsTotal(String unsafeFunctionsTotal) {
        this.unsafeFunctionsTotal = unsafeFunctionsTotal;
    }

    public MetricInfo withUnsafeFunctionsKloc(String unsafeFunctionsKloc) {
        this.unsafeFunctionsKloc = unsafeFunctionsKloc;
        return this;
    }

    /** 危险函数密度
     * 
     * @return unsafeFunctionsKloc */
    public String getUnsafeFunctionsKloc() {
        return unsafeFunctionsKloc;
    }

    public void setUnsafeFunctionsKloc(String unsafeFunctionsKloc) {
        this.unsafeFunctionsKloc = unsafeFunctionsKloc;
    }

    public MetricInfo withRedundantCodeTotal(String redundantCodeTotal) {
        this.redundantCodeTotal = redundantCodeTotal;
        return this;
    }

    /** 冗余代码数
     * 
     * @return redundantCodeTotal */
    public String getRedundantCodeTotal() {
        return redundantCodeTotal;
    }

    public void setRedundantCodeTotal(String redundantCodeTotal) {
        this.redundantCodeTotal = redundantCodeTotal;
    }

    public MetricInfo withRedundantCodeKloc(String redundantCodeKloc) {
        this.redundantCodeKloc = redundantCodeKloc;
        return this;
    }

    /** 冗余代码块密度
     * 
     * @return redundantCodeKloc */
    public String getRedundantCodeKloc() {
        return redundantCodeKloc;
    }

    public void setRedundantCodeKloc(String redundantCodeKloc) {
        this.redundantCodeKloc = redundantCodeKloc;
    }

    public MetricInfo withWarningSuppressionTotal(String warningSuppressionTotal) {
        this.warningSuppressionTotal = warningSuppressionTotal;
        return this;
    }

    /** 抑制告警数
     * 
     * @return warningSuppressionTotal */
    public String getWarningSuppressionTotal() {
        return warningSuppressionTotal;
    }

    public void setWarningSuppressionTotal(String warningSuppressionTotal) {
        this.warningSuppressionTotal = warningSuppressionTotal;
    }

    public MetricInfo withWarningSuppressionKloc(String warningSuppressionKloc) {
        this.warningSuppressionKloc = warningSuppressionKloc;
        return this;
    }

    /** 抑制告警密度
     * 
     * @return warningSuppressionKloc */
    public String getWarningSuppressionKloc() {
        return warningSuppressionKloc;
    }

    public void setWarningSuppressionKloc(String warningSuppressionKloc) {
        this.warningSuppressionKloc = warningSuppressionKloc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetricInfo metricInfo = (MetricInfo) o;
        return Objects.equals(this.codeSize, metricInfo.codeSize) && Objects.equals(this.rawLines, metricInfo.rawLines)
            && Objects.equals(this.methodsTotal, metricInfo.methodsTotal)
            && Objects.equals(this.cyclomaticComplexityTotal, metricInfo.cyclomaticComplexityTotal)
            && Objects.equals(this.cyclomaticComplexityPerMethod, metricInfo.cyclomaticComplexityPerMethod)
            && Objects.equals(this.maximumCyclomaticComplexity, metricInfo.maximumCyclomaticComplexity)
            && Objects.equals(this.hugeCyclomaticComplexityTotal, metricInfo.hugeCyclomaticComplexityTotal)
            && Objects.equals(this.hugeCyclomaticComplexityRatio, metricInfo.hugeCyclomaticComplexityRatio)
            && Objects.equals(this.ccaCyclomaticComplexityTotal, metricInfo.ccaCyclomaticComplexityTotal)
            && Objects.equals(this.ccaCyclomaticComplexityPerMethod, metricInfo.ccaCyclomaticComplexityPerMethod)
            && Objects.equals(this.maximumCcaCyclomaticComplexity, metricInfo.maximumCcaCyclomaticComplexity)
            && Objects.equals(this.hugeCcaCyclomaticComplexityTotal, metricInfo.hugeCcaCyclomaticComplexityTotal)
            && Objects.equals(this.cyclomaticComplexityAdequacy, metricInfo.cyclomaticComplexityAdequacy)
            && Objects.equals(this.maximumDepth, metricInfo.maximumDepth)
            && Objects.equals(this.hugeDepthTotal, metricInfo.hugeDepthTotal)
            && Objects.equals(this.hugeDepthRatio, metricInfo.hugeDepthRatio)
            && Objects.equals(this.methodLines, metricInfo.methodLines)
            && Objects.equals(this.linesPerMethod, metricInfo.linesPerMethod)
            && Objects.equals(this.hugeMethodTotal, metricInfo.hugeMethodTotal)
            && Objects.equals(this.hugeMethodRatio, metricInfo.hugeMethodRatio)
            && Objects.equals(this.filesTotal, metricInfo.filesTotal)
            && Objects.equals(this.foldersTotal, metricInfo.foldersTotal)
            && Objects.equals(this.linesPerFile, metricInfo.linesPerFile)
            && Objects.equals(this.hugeHeaderfileTotal, metricInfo.hugeHeaderfileTotal)
            && Objects.equals(this.hugeHeaderfileRatio, metricInfo.hugeHeaderfileRatio)
            && Objects.equals(this.hugeNonHeaderfileTotal, metricInfo.hugeNonHeaderfileTotal)
            && Objects.equals(this.hugeNonHeaderfileRatio, metricInfo.hugeNonHeaderfileRatio)
            && Objects.equals(this.hugeFolderTotal, metricInfo.hugeFolderTotal)
            && Objects.equals(this.hugeFolderRatio, metricInfo.hugeFolderRatio)
            && Objects.equals(this.fileDuplicationTotal, metricInfo.fileDuplicationTotal)
            && Objects.equals(this.fileDuplicationRatio, metricInfo.fileDuplicationRatio)
            && Objects.equals(this.nonHfileDuplicationTotal, metricInfo.nonHfileDuplicationTotal)
            && Objects.equals(this.nonHfileDuplicationRatio, metricInfo.nonHfileDuplicationRatio)
            && Objects.equals(this.codeDuplicationTotal, metricInfo.codeDuplicationTotal)
            && Objects.equals(this.codeDuplicationRatio, metricInfo.codeDuplicationRatio)
            && Objects.equals(this.nonHfileCodeDuplicationTotal, metricInfo.nonHfileCodeDuplicationTotal)
            && Objects.equals(this.nonHfileCodeDuplicationRatio, metricInfo.nonHfileCodeDuplicationRatio)
            && Objects.equals(this.unsafeFunctionsTotal, metricInfo.unsafeFunctionsTotal)
            && Objects.equals(this.unsafeFunctionsKloc, metricInfo.unsafeFunctionsKloc)
            && Objects.equals(this.redundantCodeTotal, metricInfo.redundantCodeTotal)
            && Objects.equals(this.redundantCodeKloc, metricInfo.redundantCodeKloc)
            && Objects.equals(this.warningSuppressionTotal, metricInfo.warningSuppressionTotal)
            && Objects.equals(this.warningSuppressionKloc, metricInfo.warningSuppressionKloc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeSize,
            rawLines,
            methodsTotal,
            cyclomaticComplexityTotal,
            cyclomaticComplexityPerMethod,
            maximumCyclomaticComplexity,
            hugeCyclomaticComplexityTotal,
            hugeCyclomaticComplexityRatio,
            ccaCyclomaticComplexityTotal,
            ccaCyclomaticComplexityPerMethod,
            maximumCcaCyclomaticComplexity,
            hugeCcaCyclomaticComplexityTotal,
            cyclomaticComplexityAdequacy,
            maximumDepth,
            hugeDepthTotal,
            hugeDepthRatio,
            methodLines,
            linesPerMethod,
            hugeMethodTotal,
            hugeMethodRatio,
            filesTotal,
            foldersTotal,
            linesPerFile,
            hugeHeaderfileTotal,
            hugeHeaderfileRatio,
            hugeNonHeaderfileTotal,
            hugeNonHeaderfileRatio,
            hugeFolderTotal,
            hugeFolderRatio,
            fileDuplicationTotal,
            fileDuplicationRatio,
            nonHfileDuplicationTotal,
            nonHfileDuplicationRatio,
            codeDuplicationTotal,
            codeDuplicationRatio,
            nonHfileCodeDuplicationTotal,
            nonHfileCodeDuplicationRatio,
            unsafeFunctionsTotal,
            unsafeFunctionsKloc,
            redundantCodeTotal,
            redundantCodeKloc,
            warningSuppressionTotal,
            warningSuppressionKloc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricInfo {\n");
        sb.append("    codeSize: ").append(toIndentedString(codeSize)).append("\n");
        sb.append("    rawLines: ").append(toIndentedString(rawLines)).append("\n");
        sb.append("    methodsTotal: ").append(toIndentedString(methodsTotal)).append("\n");
        sb.append("    cyclomaticComplexityTotal: ").append(toIndentedString(cyclomaticComplexityTotal)).append("\n");
        sb.append("    cyclomaticComplexityPerMethod: ")
            .append(toIndentedString(cyclomaticComplexityPerMethod))
            .append("\n");
        sb.append("    maximumCyclomaticComplexity: ")
            .append(toIndentedString(maximumCyclomaticComplexity))
            .append("\n");
        sb.append("    hugeCyclomaticComplexityTotal: ")
            .append(toIndentedString(hugeCyclomaticComplexityTotal))
            .append("\n");
        sb.append("    hugeCyclomaticComplexityRatio: ")
            .append(toIndentedString(hugeCyclomaticComplexityRatio))
            .append("\n");
        sb.append("    ccaCyclomaticComplexityTotal: ")
            .append(toIndentedString(ccaCyclomaticComplexityTotal))
            .append("\n");
        sb.append("    ccaCyclomaticComplexityPerMethod: ")
            .append(toIndentedString(ccaCyclomaticComplexityPerMethod))
            .append("\n");
        sb.append("    maximumCcaCyclomaticComplexity: ")
            .append(toIndentedString(maximumCcaCyclomaticComplexity))
            .append("\n");
        sb.append("    hugeCcaCyclomaticComplexityTotal: ")
            .append(toIndentedString(hugeCcaCyclomaticComplexityTotal))
            .append("\n");
        sb.append("    cyclomaticComplexityAdequacy: ")
            .append(toIndentedString(cyclomaticComplexityAdequacy))
            .append("\n");
        sb.append("    maximumDepth: ").append(toIndentedString(maximumDepth)).append("\n");
        sb.append("    hugeDepthTotal: ").append(toIndentedString(hugeDepthTotal)).append("\n");
        sb.append("    hugeDepthRatio: ").append(toIndentedString(hugeDepthRatio)).append("\n");
        sb.append("    methodLines: ").append(toIndentedString(methodLines)).append("\n");
        sb.append("    linesPerMethod: ").append(toIndentedString(linesPerMethod)).append("\n");
        sb.append("    hugeMethodTotal: ").append(toIndentedString(hugeMethodTotal)).append("\n");
        sb.append("    hugeMethodRatio: ").append(toIndentedString(hugeMethodRatio)).append("\n");
        sb.append("    filesTotal: ").append(toIndentedString(filesTotal)).append("\n");
        sb.append("    foldersTotal: ").append(toIndentedString(foldersTotal)).append("\n");
        sb.append("    linesPerFile: ").append(toIndentedString(linesPerFile)).append("\n");
        sb.append("    hugeHeaderfileTotal: ").append(toIndentedString(hugeHeaderfileTotal)).append("\n");
        sb.append("    hugeHeaderfileRatio: ").append(toIndentedString(hugeHeaderfileRatio)).append("\n");
        sb.append("    hugeNonHeaderfileTotal: ").append(toIndentedString(hugeNonHeaderfileTotal)).append("\n");
        sb.append("    hugeNonHeaderfileRatio: ").append(toIndentedString(hugeNonHeaderfileRatio)).append("\n");
        sb.append("    hugeFolderTotal: ").append(toIndentedString(hugeFolderTotal)).append("\n");
        sb.append("    hugeFolderRatio: ").append(toIndentedString(hugeFolderRatio)).append("\n");
        sb.append("    fileDuplicationTotal: ").append(toIndentedString(fileDuplicationTotal)).append("\n");
        sb.append("    fileDuplicationRatio: ").append(toIndentedString(fileDuplicationRatio)).append("\n");
        sb.append("    nonHfileDuplicationTotal: ").append(toIndentedString(nonHfileDuplicationTotal)).append("\n");
        sb.append("    nonHfileDuplicationRatio: ").append(toIndentedString(nonHfileDuplicationRatio)).append("\n");
        sb.append("    codeDuplicationTotal: ").append(toIndentedString(codeDuplicationTotal)).append("\n");
        sb.append("    codeDuplicationRatio: ").append(toIndentedString(codeDuplicationRatio)).append("\n");
        sb.append("    nonHfileCodeDuplicationTotal: ")
            .append(toIndentedString(nonHfileCodeDuplicationTotal))
            .append("\n");
        sb.append("    nonHfileCodeDuplicationRatio: ")
            .append(toIndentedString(nonHfileCodeDuplicationRatio))
            .append("\n");
        sb.append("    unsafeFunctionsTotal: ").append(toIndentedString(unsafeFunctionsTotal)).append("\n");
        sb.append("    unsafeFunctionsKloc: ").append(toIndentedString(unsafeFunctionsKloc)).append("\n");
        sb.append("    redundantCodeTotal: ").append(toIndentedString(redundantCodeTotal)).append("\n");
        sb.append("    redundantCodeKloc: ").append(toIndentedString(redundantCodeKloc)).append("\n");
        sb.append("    warningSuppressionTotal: ").append(toIndentedString(warningSuppressionTotal)).append("\n");
        sb.append("    warningSuppressionKloc: ").append(toIndentedString(warningSuppressionKloc)).append("\n");
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
