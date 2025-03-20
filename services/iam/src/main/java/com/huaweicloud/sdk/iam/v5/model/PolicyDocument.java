package com.huaweicloud.sdk.iam.v5.model;

import java.util.Objects;

/**
 * 自定义身份策略或系统预置身份策略的策略文档的json格式。下面的字符&#x60;&#x3D; &lt; &gt; ( ) |&#x60;是语法中的特殊字符，不包含在身份策略中。  问号&#x60;?&#x60;表示元素是可选的。例如&#x60;sid_block?&#x60;。  竖线&#x60;|&#x60;表示可选项，括号定义了可选项的范围。例如&#x60;(\&quot;Allow\&quot; | \&quot;Deny\&quot;)&#x60;。  当一个元素允许多个值时，使用重复值、&#x60;,&#x60;以及&#x60;...&#x60;表示。例如&#x60;[ &lt;policy_statement&gt;, &lt;policy_statement&gt;, ... ]&#x60;。  下面的递归文法描述了身份策略的语法： &#x60;&#x60;&#x60; policy &#x3D; {   &lt;version_block&gt;,   &lt;statement_block&gt; }  &lt;version_block&gt; &#x3D; \&quot;Version\&quot; : (\&quot;5.0\&quot;)  &lt;statement_block&gt; &#x3D; \&quot;Statement\&quot; : [ &lt;policy_statement&gt;, &lt;policy_statement&gt;, ... ]  &lt;policy_statement&gt; &#x3D; {   &lt;sid_block?&gt;,   &lt;effect_block&gt;,   &lt;action_block&gt;,   &lt;resource_block?&gt;,   &lt;condition_block?&gt; }  &lt;sid_block&gt; &#x3D; \&quot;Sid\&quot; : &lt;sid_string&gt;  &lt;effect_block&gt; &#x3D; \&quot;Effect\&quot; : (\&quot;Allow\&quot; | \&quot;Deny\&quot;)  &lt;action_block&gt; &#x3D; (\&quot;Action\&quot; | \&quot;NotAction\&quot;) : [ &lt;action_string&gt;, &lt;action_string&gt;, ... ]  &lt;resource_block&gt; &#x3D; (\&quot;Resource\&quot; | \&quot;NotResource\&quot;) : [ &lt;resource_string&gt;, &lt;resource_string&gt;, ... ]  &lt;condition_block&gt; &#x3D; \&quot;Condition\&quot; : { &lt;condition_map&gt; }  &lt;condition_map&gt; &#x3D; {   &lt;condition_type_string&gt; : { &lt;condition_key_string&gt; : &lt;condition_value_list&gt; },   &lt;condition_type_string&gt; : { &lt;condition_key_string&gt; : &lt;condition_value_list&gt; },   ... }  &lt;condition_value_list&gt; &#x3D; ( &lt;condition_value&gt; | [ &lt;condition_value&gt;, &lt;condition_value&gt;, ... ] )  &lt;condition_value&gt; &#x3D; \&quot;string\&quot; &#x60;&#x60;&#x60; 
 */
public class PolicyDocument {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyDocument {\n");
        sb.append("}");
        return sb.toString();
    }

}
