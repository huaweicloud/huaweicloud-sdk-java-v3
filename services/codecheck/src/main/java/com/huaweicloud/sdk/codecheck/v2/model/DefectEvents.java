package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DefectEvents
 */
public class DefectEvents {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<DefectEvents> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fix_suggestions")

    private List<String> fixSuggestions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line")

    private Integer line;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_line")

    private Integer endLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_context_start_line")

    private Integer codeContextStartLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main")

    private Boolean main;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_buggy_code")

    private String mainBuggyCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code_context")

    private String codeContext;

    public DefectEvents withEvents(List<DefectEvents> events) {
        this.events = events;
        return this;
    }

    public DefectEvents addEventsItem(DefectEvents eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public DefectEvents withEvents(Consumer<List<DefectEvents>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 调用链信息
     * @return events
     */
    public List<DefectEvents> getEvents() {
        return events;
    }

    public void setEvents(List<DefectEvents> events) {
        this.events = events;
    }

    public DefectEvents withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DefectEvents withFixSuggestions(List<String> fixSuggestions) {
        this.fixSuggestions = fixSuggestions;
        return this;
    }

    public DefectEvents addFixSuggestionsItem(String fixSuggestionsItem) {
        if (this.fixSuggestions == null) {
            this.fixSuggestions = new ArrayList<>();
        }
        this.fixSuggestions.add(fixSuggestionsItem);
        return this;
    }

    public DefectEvents withFixSuggestions(Consumer<List<String>> fixSuggestionsSetter) {
        if (this.fixSuggestions == null) {
            this.fixSuggestions = new ArrayList<>();
        }
        fixSuggestionsSetter.accept(this.fixSuggestions);
        return this;
    }

    /**
     * fix suggestions
     * @return fixSuggestions
     */
    public List<String> getFixSuggestions() {
        return fixSuggestions;
    }

    public void setFixSuggestions(List<String> fixSuggestions) {
        this.fixSuggestions = fixSuggestions;
    }

    public DefectEvents withLine(Integer line) {
        this.line = line;
        return this;
    }

    /**
     * 缺陷所在行
     * @return line
     */
    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public DefectEvents withEndLine(Integer endLine) {
        this.endLine = endLine;
        return this;
    }

    /**
     * 缺陷结束行
     * @return endLine
     */
    public Integer getEndLine() {
        return endLine;
    }

    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    public DefectEvents withCodeContextStartLine(Integer codeContextStartLine) {
        this.codeContextStartLine = codeContextStartLine;
        return this;
    }

    /**
     * 缺陷开始行
     * @return codeContextStartLine
     */
    public Integer getCodeContextStartLine() {
        return codeContextStartLine;
    }

    public void setCodeContextStartLine(Integer codeContextStartLine) {
        this.codeContextStartLine = codeContextStartLine;
    }

    public DefectEvents withMain(Boolean main) {
        this.main = main;
        return this;
    }

    /**
     * 代码片段
     * @return main
     */
    public Boolean getMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    public DefectEvents withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * file path
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public DefectEvents withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 标签
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public DefectEvents withMainBuggyCode(String mainBuggyCode) {
        this.mainBuggyCode = mainBuggyCode;
        return this;
    }

    /**
     * main buggy code
     * @return mainBuggyCode
     */
    public String getMainBuggyCode() {
        return mainBuggyCode;
    }

    public void setMainBuggyCode(String mainBuggyCode) {
        this.mainBuggyCode = mainBuggyCode;
    }

    public DefectEvents withCodeContext(String codeContext) {
        this.codeContext = codeContext;
        return this;
    }

    /**
     * code context
     * @return codeContext
     */
    public String getCodeContext() {
        return codeContext;
    }

    public void setCodeContext(String codeContext) {
        this.codeContext = codeContext;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DefectEvents defectEvents = (DefectEvents) o;
        return Objects.equals(this.events, defectEvents.events)
            && Objects.equals(this.description, defectEvents.description)
            && Objects.equals(this.fixSuggestions, defectEvents.fixSuggestions)
            && Objects.equals(this.line, defectEvents.line) && Objects.equals(this.endLine, defectEvents.endLine)
            && Objects.equals(this.codeContextStartLine, defectEvents.codeContextStartLine)
            && Objects.equals(this.main, defectEvents.main) && Objects.equals(this.path, defectEvents.path)
            && Objects.equals(this.tag, defectEvents.tag)
            && Objects.equals(this.mainBuggyCode, defectEvents.mainBuggyCode)
            && Objects.equals(this.codeContext, defectEvents.codeContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events,
            description,
            fixSuggestions,
            line,
            endLine,
            codeContextStartLine,
            main,
            path,
            tag,
            mainBuggyCode,
            codeContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefectEvents {\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    fixSuggestions: ").append(toIndentedString(fixSuggestions)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    endLine: ").append(toIndentedString(endLine)).append("\n");
        sb.append("    codeContextStartLine: ").append(toIndentedString(codeContextStartLine)).append("\n");
        sb.append("    main: ").append(toIndentedString(main)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    mainBuggyCode: ").append(toIndentedString(mainBuggyCode)).append("\n");
        sb.append("    codeContext: ").append(toIndentedString(codeContext)).append("\n");
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
