package com.huaweicloud.sdk.aos.v1;

import com.huaweicloud.sdk.aos.v1.model.ApplyExecutionPlanRequest;
import com.huaweicloud.sdk.aos.v1.model.ApplyExecutionPlanResponse;
import com.huaweicloud.sdk.aos.v1.model.ContinueDeployStackRequest;
import com.huaweicloud.sdk.aos.v1.model.ContinueDeployStackResponse;
import com.huaweicloud.sdk.aos.v1.model.ContinueRollbackStackRequest;
import com.huaweicloud.sdk.aos.v1.model.ContinueRollbackStackResponse;
import com.huaweicloud.sdk.aos.v1.model.CreateExecutionPlanRequest;
import com.huaweicloud.sdk.aos.v1.model.CreateExecutionPlanResponse;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateHookRequest;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateHookResponse;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateHookVersionRequest;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateHookVersionResponse;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateProviderRequest;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateProviderResponse;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateProviderVersionRequest;
import com.huaweicloud.sdk.aos.v1.model.CreatePrivateProviderVersionResponse;
import com.huaweicloud.sdk.aos.v1.model.CreateStackInstanceRequest;
import com.huaweicloud.sdk.aos.v1.model.CreateStackInstanceResponse;
import com.huaweicloud.sdk.aos.v1.model.CreateStackRequest;
import com.huaweicloud.sdk.aos.v1.model.CreateStackResponse;
import com.huaweicloud.sdk.aos.v1.model.CreateStackSetRequest;
import com.huaweicloud.sdk.aos.v1.model.CreateStackSetResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteExecutionPlanRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteExecutionPlanResponse;
import com.huaweicloud.sdk.aos.v1.model.DeletePrivateHookRequest;
import com.huaweicloud.sdk.aos.v1.model.DeletePrivateHookResponse;
import com.huaweicloud.sdk.aos.v1.model.DeletePrivateHookVersionRequest;
import com.huaweicloud.sdk.aos.v1.model.DeletePrivateHookVersionResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackEnhancedRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackEnhancedResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackInstanceDeprecatedRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackInstanceDeprecatedResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackInstanceRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackInstanceResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackSetRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteStackSetResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.aos.v1.model.DeleteTemplateVersionRequest;
import com.huaweicloud.sdk.aos.v1.model.DeleteTemplateVersionResponse;
import com.huaweicloud.sdk.aos.v1.model.DeployStackRequest;
import com.huaweicloud.sdk.aos.v1.model.DeployStackResponse;
import com.huaweicloud.sdk.aos.v1.model.DeployStackSetRequest;
import com.huaweicloud.sdk.aos.v1.model.DeployStackSetResponse;
import com.huaweicloud.sdk.aos.v1.model.EstimateExecutionPlanPriceRequest;
import com.huaweicloud.sdk.aos.v1.model.EstimateExecutionPlanPriceResponse;
import com.huaweicloud.sdk.aos.v1.model.GetExecutionPlanMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.GetExecutionPlanMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.GetExecutionPlanRequest;
import com.huaweicloud.sdk.aos.v1.model.GetExecutionPlanResponse;
import com.huaweicloud.sdk.aos.v1.model.GetStackMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.GetStackMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.GetStackTemplateRequest;
import com.huaweicloud.sdk.aos.v1.model.GetStackTemplateResponse;
import com.huaweicloud.sdk.aos.v1.model.ListExecutionPlansRequest;
import com.huaweicloud.sdk.aos.v1.model.ListExecutionPlansResponse;
import com.huaweicloud.sdk.aos.v1.model.ListPrivateHooksRequest;
import com.huaweicloud.sdk.aos.v1.model.ListPrivateHooksResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStackEventsRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStackEventsResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStackInstancesRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStackInstancesResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStackOutputsRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStackOutputsResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStackResourcesRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStackResourcesResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStackSetOperationsRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStackSetOperationsResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStackSetsRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStackSetsResponse;
import com.huaweicloud.sdk.aos.v1.model.ListStacksRequest;
import com.huaweicloud.sdk.aos.v1.model.ListStacksResponse;
import com.huaweicloud.sdk.aos.v1.model.ListTemplateVersionsRequest;
import com.huaweicloud.sdk.aos.v1.model.ListTemplateVersionsResponse;
import com.huaweicloud.sdk.aos.v1.model.ListTemplatesRequest;
import com.huaweicloud.sdk.aos.v1.model.ListTemplatesResponse;
import com.huaweicloud.sdk.aos.v1.model.ParseTemplateVariablesRequest;
import com.huaweicloud.sdk.aos.v1.model.ParseTemplateVariablesResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowPrivateHookMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowPrivateHookMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowPrivateHookVersionMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowPrivateHookVersionMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowPrivateHookVersionPolicyRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowPrivateHookVersionPolicyResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowStackInstanceRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowStackInstanceResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowStackSetMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowStackSetMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowStackSetOperationMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowStackSetOperationMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowStackSetTemplateRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowStackSetTemplateResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowTemplateMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowTemplateMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowTemplateVersionContentRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowTemplateVersionContentResponse;
import com.huaweicloud.sdk.aos.v1.model.ShowTemplateVersionMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.ShowTemplateVersionMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.UpdatePrivateHookMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.UpdatePrivateHookMetadataResponse;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackInstancesRequest;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackInstancesResponse;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackRequest;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackResponse;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackSetRequest;
import com.huaweicloud.sdk.aos.v1.model.UpdateStackSetResponse;
import com.huaweicloud.sdk.aos.v1.model.UpdateTemplateMetadataRequest;
import com.huaweicloud.sdk.aos.v1.model.UpdateTemplateMetadataResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AosAsyncClient {

    protected HcClient hcClient;

    public AosAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AosAsyncClient> newBuilder() {
        ClientBuilder<AosAsyncClient> clientBuilder = new ClientBuilder<>(AosAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建私有provider
     *
     * 创建私有provider（CreatePrivateProvider）
     * 
     * 创建一个私有的空provider。如果用户给予了provider_version和function_graph_urn，则在创建私有provider的同时，还会在私有provider下创建一个私有provider版本。
     *   * 私有provider允许用户将自定义的provider注册到RFS中，并仅提供给当前用户使用。
     *   * 如果同名私有provider在当前账户中已经存在，则会返回409。
     *   * 版本号遵循语义化版本号（Semantic Version），为用户自定义。
     *   * 在本API中，provider_version和function_graph_urn需要搭配使用，如果只指定其中一个参数，则会返回400。
     *   * 资源编排服务只会对function_graph_urn进行浅校验，如是否符合正则，是否仅指定为当前region等。并不会深度校验，即用户是否存在权限调用，是否真实存在等。
     *   * 该API会返回provider_source字段，该字段按照“huawei.com/private-provider/{provider_name}”的形式拼接。关于provider_name和provider_source字段在模板中的使用细节，详见下方描述中。
     *   * 如果用户期望使用名称中不含有大写英文的provider，可以按照如下展示将provider_source字段指定为模板中定义的required_providers中的source参数。
     *   * 如果用户期望使用名称含有大写英文的provider，需要将provider_name完全转化为小写英文创建。同时用户既可以在模板中使用API返回的provider_source参数，也可以在模板中以 “huawei.com/private-provider”为固定前缀，按照原含大写英文的provider_name，拼写provider_source参数。
     * 
     * 以HCL格式的模板为例，模板中引用私有provider的语法如下：
     * &#x60;&#x60;&#x60;
     * Provider \&quot;{provider_name}\&quot; {
     *   source &#x3D; \&quot;{provider_source}\&quot;
     *   version &#x3D; \&quot;{provider_version}\&quot;
     * }
     * &#x60;&#x60;&#x60;
     * 
     * 以JSON格式的模板为例，模板中引用私有provider的语法如下：
     * &#x60;&#x60;&#x60;
     * {
     *   \&quot;terraform\&quot;:{
     *     \&quot;required_providers\&quot;:[
     *       {
     *         \&quot;{provider_name}\&quot;:{
     *           \&quot;source\&quot;:\&quot;{provider_source}\&quot;,
     *           \&quot;version\&quot;:\&quot;{provider_version}\&quot;
     *         }
     *       }
     *     ]
     *   }
     * }
     * &#x60;&#x60;&#x60;
     * 
     * RFS在支持用户使用FunctionGraph(以下简称：FG)的HTTP函数运行私有Provider时，定义了一套详细的对接规则，以实现RFS与私有Provider之间的成功交互。
     * 其中关于FG的HTTP函数使用，请参考官网文档： https://support.huaweicloud.com/productdesc-functiongraph/functiongraph_02_1002.html。
     * 用户需要在提供的FG的HTTP函数方法中，按照如下规则实现一系列对应方法：
     *   1. 用户需要首先在FG中启动一个HTTP Server，用于接受来自RFS的HTTP请求，请求的Path固定为\&quot;/provider\&quot;，请求方法为\&quot;POST\&quot;。RFS规定了发送给FG的HTTP请求体，请求体格式如下所示：
     *     &#x60;&#x60;&#x60;
     *     {
     *       \&quot;method_name\&quot;: String,
     *       \&quot;request_data\&quot;: String,
     *       \&quot;context\&quot;:{
     *         \&quot;session_id\&quot;: String,
     *         \&quot;config_data\&quot;: String
     *       }
     *     }
     *     &#x60;&#x60;&#x60;
     *      用户提供的FG的HTTP函数需要能够接收如上请求。否则会调用私有Provider失败，导致资源编排失败。
     *   2. 下面对FG中如何使用请求体中的各个参数，以实现FG与RFS的成功交互做详细解释：
     *      \&quot;method_name\&quot;：RFS期望FG的HTTP函数中调用的私有provider的gRPC方法名。RFS会在请求体中，根据实际业务场景，每次从如下方法中选择一个进行传递。其中每个方法名需要与provider中原生的gRPC方法一一对应。在收到携带有某个方法名的请求后，FG的HTTP函数内能够调用对应的私有provider的原生gRPC方法，实现具体资源的处理逻辑。
     *      provider内提供的原生gRPC协议请参考：tfplugin5.proto和grpc_controller.proto。方法名列表如下：
     *         &#x60;&#x60;&#x60;
     *         tfplugin5.proto：
     *           \&quot;/tfplugin5.Provider/GetSchema\&quot;
     *           \&quot;/tfplugin5.Provider/PrepareProviderConfig\&quot;
     *           \&quot;/tfplugin5.Provider/ValidateResourceTypeConfig\&quot;
     *           \&quot;/tfplugin5.Provider/ValidateDataSourceConfig\&quot;
     *           \&quot;/tfplugin5.Provider/UpgradeResourceState\&quot;
     *           \&quot;/tfplugin5.Provider/Configure\&quot;
     *           \&quot;/tfplugin5.Provider/ReadResource\&quot;
     *           \&quot;/tfplugin5.Provider/PlanResourceChange\&quot;
     *           \&quot;/tfplugin5.Provider/ApplyResourceChange\&quot;
     *           \&quot;/tfplugin5.Provider/ImportResourceState\&quot;
     *           \&quot;/tfplugin5.Provider/ReadDataSource\&quot;
     *           \&quot;/tfplugin5.Provider/Stop\&quot;
     *         grpc_controller.proto：
     *           \&quot;/plugin.GRPCController/Shutdown\&quot;
     *         &#x60;&#x60;&#x60;
     *      \&quot;request_data\&quot;：RFS传递给FG的HTTP函数中每个方法的请求内容。在每个方法的处理逻辑中，需要先将request_data中的数据使用base64解码，然后作为私有provider的gRPC方法的数据传入。
     *      \&quot;config_data\&quot;：用于自定义provider处理实际请求前的初始化，如果context中config_data非空，FG的HTTP函数需要先将config_data作为输入调用/tfplugin5.Provider/Configure方法，进行初始化，再根据method_name调用对应的方法获取响应。
     *      \&quot;session_id\&quot;：表示请求是否来自同一个模板中的同一批编排任务。session_id相同，表示请求来自同一个模板中的同一批编排任务。
     *      注意：用户启动的同一个provider进程不能接受多个来自RFS的请求。RFS推荐用户处理请求时，每次都启动新的进程处理相关请求。
     *   3. 在FG的HTTP函数中实现的请求响应按照固定格式进行返回，响应体的格式如下，成功响应码固定为200，任何其他响应码均视为失败请求，会导致资源编排失败。
     *     &#x60;&#x60;&#x60;
     *     {
     *       \&quot;response_data\&quot;: String,
     *       \&quot;error\&quot;: String
     *     }
     *     &#x60;&#x60;&#x60;
     *     \&quot;response_data\&quot;：调用私有provider的gRPC方法返回的内容。在FG的HTTP函数中，需要将gRPC方法返回的响应序列化后使用base64编码返回。
     *     \&quot;error\&quot;：调用gRPC方法返回的错误信息。
     * 
     * **约束与限制：**
     *   1. 私有provider为用户自行定义，提供给RFS的provider插件，RFS不负责校验其内部逻辑是否正确。
     *   2. RFS不负责维护私有provider的生命周期。用户使用私有provider部署的资源栈，由于私有provider缺失或问题，导致资源栈无法继续部署管理的，RFS不负责提供解决方案。
     *   3. RFS不负责保障私有provider的信息安全。用户使用私有provider部署的资源栈，由于模板中存在敏感数据，进而导致敏感信息泄露给第三方相关资源的，RFS不承担其相关责任。
     *   4. 当前调用私有provider过程中增加了网络因素，因此使用私有provider部署的失败概率会增加。如果出现因网络原因导致的部署失败，可以增加重试操作。
     *   5. 当前RFS会同步调用用户在FG中定义的一系列方法，单次方法需要确保运行时间不超过30s，否则会极大增加失败概率。
     *   6. 当前仅支持在模板中固定私有provider版本，不支持&gt;,&gt;&#x3D;,&lt;,&lt;&#x3D;,~&gt;等定义宽松版本的表达式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateProviderRequest 请求对象
     * @return CompletableFuture<CreatePrivateProviderResponse>
     */
    public CompletableFuture<CreatePrivateProviderResponse> createPrivateProviderAsync(
        CreatePrivateProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.createPrivateProvider);
    }

    /**
     * 创建私有provider
     *
     * 创建私有provider（CreatePrivateProvider）
     * 
     * 创建一个私有的空provider。如果用户给予了provider_version和function_graph_urn，则在创建私有provider的同时，还会在私有provider下创建一个私有provider版本。
     *   * 私有provider允许用户将自定义的provider注册到RFS中，并仅提供给当前用户使用。
     *   * 如果同名私有provider在当前账户中已经存在，则会返回409。
     *   * 版本号遵循语义化版本号（Semantic Version），为用户自定义。
     *   * 在本API中，provider_version和function_graph_urn需要搭配使用，如果只指定其中一个参数，则会返回400。
     *   * 资源编排服务只会对function_graph_urn进行浅校验，如是否符合正则，是否仅指定为当前region等。并不会深度校验，即用户是否存在权限调用，是否真实存在等。
     *   * 该API会返回provider_source字段，该字段按照“huawei.com/private-provider/{provider_name}”的形式拼接。关于provider_name和provider_source字段在模板中的使用细节，详见下方描述中。
     *   * 如果用户期望使用名称中不含有大写英文的provider，可以按照如下展示将provider_source字段指定为模板中定义的required_providers中的source参数。
     *   * 如果用户期望使用名称含有大写英文的provider，需要将provider_name完全转化为小写英文创建。同时用户既可以在模板中使用API返回的provider_source参数，也可以在模板中以 “huawei.com/private-provider”为固定前缀，按照原含大写英文的provider_name，拼写provider_source参数。
     * 
     * 以HCL格式的模板为例，模板中引用私有provider的语法如下：
     * &#x60;&#x60;&#x60;
     * Provider \&quot;{provider_name}\&quot; {
     *   source &#x3D; \&quot;{provider_source}\&quot;
     *   version &#x3D; \&quot;{provider_version}\&quot;
     * }
     * &#x60;&#x60;&#x60;
     * 
     * 以JSON格式的模板为例，模板中引用私有provider的语法如下：
     * &#x60;&#x60;&#x60;
     * {
     *   \&quot;terraform\&quot;:{
     *     \&quot;required_providers\&quot;:[
     *       {
     *         \&quot;{provider_name}\&quot;:{
     *           \&quot;source\&quot;:\&quot;{provider_source}\&quot;,
     *           \&quot;version\&quot;:\&quot;{provider_version}\&quot;
     *         }
     *       }
     *     ]
     *   }
     * }
     * &#x60;&#x60;&#x60;
     * 
     * RFS在支持用户使用FunctionGraph(以下简称：FG)的HTTP函数运行私有Provider时，定义了一套详细的对接规则，以实现RFS与私有Provider之间的成功交互。
     * 其中关于FG的HTTP函数使用，请参考官网文档： https://support.huaweicloud.com/productdesc-functiongraph/functiongraph_02_1002.html。
     * 用户需要在提供的FG的HTTP函数方法中，按照如下规则实现一系列对应方法：
     *   1. 用户需要首先在FG中启动一个HTTP Server，用于接受来自RFS的HTTP请求，请求的Path固定为\&quot;/provider\&quot;，请求方法为\&quot;POST\&quot;。RFS规定了发送给FG的HTTP请求体，请求体格式如下所示：
     *     &#x60;&#x60;&#x60;
     *     {
     *       \&quot;method_name\&quot;: String,
     *       \&quot;request_data\&quot;: String,
     *       \&quot;context\&quot;:{
     *         \&quot;session_id\&quot;: String,
     *         \&quot;config_data\&quot;: String
     *       }
     *     }
     *     &#x60;&#x60;&#x60;
     *      用户提供的FG的HTTP函数需要能够接收如上请求。否则会调用私有Provider失败，导致资源编排失败。
     *   2. 下面对FG中如何使用请求体中的各个参数，以实现FG与RFS的成功交互做详细解释：
     *      \&quot;method_name\&quot;：RFS期望FG的HTTP函数中调用的私有provider的gRPC方法名。RFS会在请求体中，根据实际业务场景，每次从如下方法中选择一个进行传递。其中每个方法名需要与provider中原生的gRPC方法一一对应。在收到携带有某个方法名的请求后，FG的HTTP函数内能够调用对应的私有provider的原生gRPC方法，实现具体资源的处理逻辑。
     *      provider内提供的原生gRPC协议请参考：tfplugin5.proto和grpc_controller.proto。方法名列表如下：
     *         &#x60;&#x60;&#x60;
     *         tfplugin5.proto：
     *           \&quot;/tfplugin5.Provider/GetSchema\&quot;
     *           \&quot;/tfplugin5.Provider/PrepareProviderConfig\&quot;
     *           \&quot;/tfplugin5.Provider/ValidateResourceTypeConfig\&quot;
     *           \&quot;/tfplugin5.Provider/ValidateDataSourceConfig\&quot;
     *           \&quot;/tfplugin5.Provider/UpgradeResourceState\&quot;
     *           \&quot;/tfplugin5.Provider/Configure\&quot;
     *           \&quot;/tfplugin5.Provider/ReadResource\&quot;
     *           \&quot;/tfplugin5.Provider/PlanResourceChange\&quot;
     *           \&quot;/tfplugin5.Provider/ApplyResourceChange\&quot;
     *           \&quot;/tfplugin5.Provider/ImportResourceState\&quot;
     *           \&quot;/tfplugin5.Provider/ReadDataSource\&quot;
     *           \&quot;/tfplugin5.Provider/Stop\&quot;
     *         grpc_controller.proto：
     *           \&quot;/plugin.GRPCController/Shutdown\&quot;
     *         &#x60;&#x60;&#x60;
     *      \&quot;request_data\&quot;：RFS传递给FG的HTTP函数中每个方法的请求内容。在每个方法的处理逻辑中，需要先将request_data中的数据使用base64解码，然后作为私有provider的gRPC方法的数据传入。
     *      \&quot;config_data\&quot;：用于自定义provider处理实际请求前的初始化，如果context中config_data非空，FG的HTTP函数需要先将config_data作为输入调用/tfplugin5.Provider/Configure方法，进行初始化，再根据method_name调用对应的方法获取响应。
     *      \&quot;session_id\&quot;：表示请求是否来自同一个模板中的同一批编排任务。session_id相同，表示请求来自同一个模板中的同一批编排任务。
     *      注意：用户启动的同一个provider进程不能接受多个来自RFS的请求。RFS推荐用户处理请求时，每次都启动新的进程处理相关请求。
     *   3. 在FG的HTTP函数中实现的请求响应按照固定格式进行返回，响应体的格式如下，成功响应码固定为200，任何其他响应码均视为失败请求，会导致资源编排失败。
     *     &#x60;&#x60;&#x60;
     *     {
     *       \&quot;response_data\&quot;: String,
     *       \&quot;error\&quot;: String
     *     }
     *     &#x60;&#x60;&#x60;
     *     \&quot;response_data\&quot;：调用私有provider的gRPC方法返回的内容。在FG的HTTP函数中，需要将gRPC方法返回的响应序列化后使用base64编码返回。
     *     \&quot;error\&quot;：调用gRPC方法返回的错误信息。
     * 
     * **约束与限制：**
     *   1. 私有provider为用户自行定义，提供给RFS的provider插件，RFS不负责校验其内部逻辑是否正确。
     *   2. RFS不负责维护私有provider的生命周期。用户使用私有provider部署的资源栈，由于私有provider缺失或问题，导致资源栈无法继续部署管理的，RFS不负责提供解决方案。
     *   3. RFS不负责保障私有provider的信息安全。用户使用私有provider部署的资源栈，由于模板中存在敏感数据，进而导致敏感信息泄露给第三方相关资源的，RFS不承担其相关责任。
     *   4. 当前调用私有provider过程中增加了网络因素，因此使用私有provider部署的失败概率会增加。如果出现因网络原因导致的部署失败，可以增加重试操作。
     *   5. 当前RFS会同步调用用户在FG中定义的一系列方法，单次方法需要确保运行时间不超过30s，否则会极大增加失败概率。
     *   6. 当前仅支持在模板中固定私有provider版本，不支持&gt;,&gt;&#x3D;,&lt;,&lt;&#x3D;,~&gt;等定义宽松版本的表达式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateProviderRequest 请求对象
     * @return AsyncInvoker<CreatePrivateProviderRequest, CreatePrivateProviderResponse>
     */
    public AsyncInvoker<CreatePrivateProviderRequest, CreatePrivateProviderResponse> createPrivateProviderAsyncInvoker(
        CreatePrivateProviderRequest request) {
        return new AsyncInvoker<>(request, AosMeta.createPrivateProvider, hcClient);
    }

    /**
     * 创建私有provider版本
     *
     * 创建私有provider版本（CreatePrivateProviderVersion）
     * 
     *   * provider的版本号需遵循语义化版本号（Semantic Version），为用户自定义。
     *   * 如果provider_name和provider_id同时存在，则资源编排服务会检查是否两个匹配，如果不匹配则会返回400。
     *   * 资源编排服务只会对function_graph_urn进行浅校验，如是否符合正则，是否仅指定为当前region等。并不会深度校验，即用户是否存在权限调用，是否真实存在等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateProviderVersionRequest 请求对象
     * @return CompletableFuture<CreatePrivateProviderVersionResponse>
     */
    public CompletableFuture<CreatePrivateProviderVersionResponse> createPrivateProviderVersionAsync(
        CreatePrivateProviderVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.createPrivateProviderVersion);
    }

    /**
     * 创建私有provider版本
     *
     * 创建私有provider版本（CreatePrivateProviderVersion）
     * 
     *   * provider的版本号需遵循语义化版本号（Semantic Version），为用户自定义。
     *   * 如果provider_name和provider_id同时存在，则资源编排服务会检查是否两个匹配，如果不匹配则会返回400。
     *   * 资源编排服务只会对function_graph_urn进行浅校验，如是否符合正则，是否仅指定为当前region等。并不会深度校验，即用户是否存在权限调用，是否真实存在等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateProviderVersionRequest 请求对象
     * @return AsyncInvoker<CreatePrivateProviderVersionRequest, CreatePrivateProviderVersionResponse>
     */
    public AsyncInvoker<CreatePrivateProviderVersionRequest, CreatePrivateProviderVersionResponse> createPrivateProviderVersionAsyncInvoker(
        CreatePrivateProviderVersionRequest request) {
        return new AsyncInvoker<>(request, AosMeta.createPrivateProviderVersion, hcClient);
    }

    /**
     * 执行执行计划
     *
     * 执行执行计划（ApplyExecutionPlan）
     * 
     * 此API用于执行一个执行计划
     * 
     * * 当执行请求接受后，执行计划状态将变为&#x60;APPLY_IN_PROGRESS&#x60;，后台会进行异步处理。
     * * 当执行结束后，执行计划状态将变为&#x60;APPLIED&#x60;。
     * * 用户可以调用GetStackMetadata查询资源栈的状态（status）来跟踪资源栈部署情况以及确认本次执行结果是否成功。
     * 
     * 如果不希望通过执行计划进行部署操作，也可以选择调用DeployStack进行直接部署
     * 
     * 关于执行计划的过期失效：
     *   1. 如果指定资源栈下有多个执行计划，则在执行某个执行计划后（无论结果是否成功），剩余所有的执行计划将过期失效；
     *   2. 如果调用ApplyExecutionPlan时，指定的执行计划已经过期失效，则返回403
     * 
     * 如果资源栈状态处于非终态（即以&#x60;IN_PROGRESS&#x60;结尾，详细见下方）状态时，则不允许执行执行计划，并返回403。非终态状态包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyExecutionPlanRequest 请求对象
     * @return CompletableFuture<ApplyExecutionPlanResponse>
     */
    public CompletableFuture<ApplyExecutionPlanResponse> applyExecutionPlanAsync(ApplyExecutionPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.applyExecutionPlan);
    }

    /**
     * 执行执行计划
     *
     * 执行执行计划（ApplyExecutionPlan）
     * 
     * 此API用于执行一个执行计划
     * 
     * * 当执行请求接受后，执行计划状态将变为&#x60;APPLY_IN_PROGRESS&#x60;，后台会进行异步处理。
     * * 当执行结束后，执行计划状态将变为&#x60;APPLIED&#x60;。
     * * 用户可以调用GetStackMetadata查询资源栈的状态（status）来跟踪资源栈部署情况以及确认本次执行结果是否成功。
     * 
     * 如果不希望通过执行计划进行部署操作，也可以选择调用DeployStack进行直接部署
     * 
     * 关于执行计划的过期失效：
     *   1. 如果指定资源栈下有多个执行计划，则在执行某个执行计划后（无论结果是否成功），剩余所有的执行计划将过期失效；
     *   2. 如果调用ApplyExecutionPlan时，指定的执行计划已经过期失效，则返回403
     * 
     * 如果资源栈状态处于非终态（即以&#x60;IN_PROGRESS&#x60;结尾，详细见下方）状态时，则不允许执行执行计划，并返回403。非终态状态包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyExecutionPlanRequest 请求对象
     * @return AsyncInvoker<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse>
     */
    public AsyncInvoker<ApplyExecutionPlanRequest, ApplyExecutionPlanResponse> applyExecutionPlanAsyncInvoker(
        ApplyExecutionPlanRequest request) {
        return new AsyncInvoker<>(request, AosMeta.applyExecutionPlan, hcClient);
    }

    /**
     * 创建执行计划
     *
     * 创建执行计划（CreateExecutionPlan）
     * 
     * 此API用于在指定的资源栈下生成一个执行计划，执行计划描述了当前资源栈中记录的资源状态和模板描述的目的资源状态之间的区别（如，资源A将以以下配置文件生成，资源B将以下参数从XXX修改成YYY）
     * 
     * 调用此API触发创建执行计划之后，可以通过GetExecutionPlanMetadata来跟踪执行计划的状态
     * 当执行计划状态为&#x60;AVAILABLE&#x60;时，可以通过GetExecutionPlan获取本次执行计划的结果
     * 
     * 执行计划不会做过多深层的检查和校验，如用户是否有权限生成、修改资源等
     * 
     * **注意：**
     *   * 创建执行计划时，指定的资源栈必须存在。如果指定的资源栈不存在，则返回404，用户可通过调用创建资源栈（CreateStack）API来创建资源栈。
     *   * 如果请求中不含有template_body和template_uri，则返回400
     *   * 如果资源栈进行了某次部署操作，则在该次部署操作前生成的执行计划将全部失效
     *   * 执行计划只代表生成时刻的结果，如果执行计划生成后，用户手动修改资源状态，则执行计划不会自动更新
     *   * 如果资源栈状态处于&#x60;DEPLOYMENT_IN_PROGRESS&#x60;、&#x60;ROLLBACK_IN_PROGRESS&#x60;、&#x60;DELETION_IN_PROGRESS&#x60;等状态时，则不允许创建执行计划，并返回403
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExecutionPlanRequest 请求对象
     * @return CompletableFuture<CreateExecutionPlanResponse>
     */
    public CompletableFuture<CreateExecutionPlanResponse> createExecutionPlanAsync(CreateExecutionPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.createExecutionPlan);
    }

    /**
     * 创建执行计划
     *
     * 创建执行计划（CreateExecutionPlan）
     * 
     * 此API用于在指定的资源栈下生成一个执行计划，执行计划描述了当前资源栈中记录的资源状态和模板描述的目的资源状态之间的区别（如，资源A将以以下配置文件生成，资源B将以下参数从XXX修改成YYY）
     * 
     * 调用此API触发创建执行计划之后，可以通过GetExecutionPlanMetadata来跟踪执行计划的状态
     * 当执行计划状态为&#x60;AVAILABLE&#x60;时，可以通过GetExecutionPlan获取本次执行计划的结果
     * 
     * 执行计划不会做过多深层的检查和校验，如用户是否有权限生成、修改资源等
     * 
     * **注意：**
     *   * 创建执行计划时，指定的资源栈必须存在。如果指定的资源栈不存在，则返回404，用户可通过调用创建资源栈（CreateStack）API来创建资源栈。
     *   * 如果请求中不含有template_body和template_uri，则返回400
     *   * 如果资源栈进行了某次部署操作，则在该次部署操作前生成的执行计划将全部失效
     *   * 执行计划只代表生成时刻的结果，如果执行计划生成后，用户手动修改资源状态，则执行计划不会自动更新
     *   * 如果资源栈状态处于&#x60;DEPLOYMENT_IN_PROGRESS&#x60;、&#x60;ROLLBACK_IN_PROGRESS&#x60;、&#x60;DELETION_IN_PROGRESS&#x60;等状态时，则不允许创建执行计划，并返回403
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExecutionPlanRequest 请求对象
     * @return AsyncInvoker<CreateExecutionPlanRequest, CreateExecutionPlanResponse>
     */
    public AsyncInvoker<CreateExecutionPlanRequest, CreateExecutionPlanResponse> createExecutionPlanAsyncInvoker(
        CreateExecutionPlanRequest request) {
        return new AsyncInvoker<>(request, AosMeta.createExecutionPlan, hcClient);
    }

    /**
     * 删除执行计划
     *
     * 删除执行计划（DeleteExecutionPlan）
     * 
     * 删除指定的执行计划
     * 
     * 如果执行计划状态处于&#x60;CREATION_IN_PROGRESS&#x60;、&#x60;APPLY_IN_PROGRESS&#x60;状态时，则不允许删除并返回403
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExecutionPlanRequest 请求对象
     * @return CompletableFuture<DeleteExecutionPlanResponse>
     */
    public CompletableFuture<DeleteExecutionPlanResponse> deleteExecutionPlanAsync(DeleteExecutionPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deleteExecutionPlan);
    }

    /**
     * 删除执行计划
     *
     * 删除执行计划（DeleteExecutionPlan）
     * 
     * 删除指定的执行计划
     * 
     * 如果执行计划状态处于&#x60;CREATION_IN_PROGRESS&#x60;、&#x60;APPLY_IN_PROGRESS&#x60;状态时，则不允许删除并返回403
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExecutionPlanRequest 请求对象
     * @return AsyncInvoker<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse>
     */
    public AsyncInvoker<DeleteExecutionPlanRequest, DeleteExecutionPlanResponse> deleteExecutionPlanAsyncInvoker(
        DeleteExecutionPlanRequest request) {
        return new AsyncInvoker<>(request, AosMeta.deleteExecutionPlan, hcClient);
    }

    /**
     * 预估执行计划价格
     *
     * 预估执行计划价格（EstimateExecutionPlanPrice）
     * 
     * 此API可以基于一份已有的执行计划中增量的资源进行询价，当前支持询价的计费模式有包周期计费、按需计费、免费，暂不支持其他形式的计费模式，例如竞价计费模式等。
     * 
     * 注：
     *   * 由于某些资源的属性值含有默认值，且该属性和询价参数相关。如果用户的模板中描述的资源没有声明这些属性，则询价结果可能存在偏差。
     *   * 询价结果仅为预估结果，具体请以实际为准。
     *   * 如果用户在模板中使用了depends_on参数，如A资源询价必要字段依赖于B资源的创建，则A资源不支持询价。
     *   * 暂不支持传入data sources的flavor.id的场景的询价。
     *   * 暂不支持镜像询价。
     *   * 如果A资源的询价必要字段设置了sensitive &#x3D; true，则A资源不支持询价。
     *   * 模板中询价的资源的个数是有限制的。当前一个模板中最多支持12个包周期计费资源和24个按需计费资源。
     *   * 支持询价的资源列表和询价必要参数
     *       * huaweicloud_cce_cluster: 
     *           * 支持的计费模式：包周期、按需
     *       * huaweicloud_css_cluster:
     *           * 支持的计费模式：按需
     *       * huaweicloud_evs_volume: 
     *           * 支持的计费模式：包周期、按需
     *           * 询价必要参数：size（磁盘规格）
     *       * huaweicloud_compute_instance: 
     *           * 支持的计费模式：包周期、按需
     *           * 询价必要参数：flavor_id（规格ID）、flavor_name（规格名称，flavor_id和flavor_name至少给出一个）、system_disk_size（系统磁盘大小）
     *       * huaweicloud_vpc_bandwidth:
     *           * 支持的计费模式：按需
     *           * 询价必要参数：charge_mode仅支持bandwidth
     *       * huaweicloud_vpc_eip: 
     *           * 支持的计费模式：包周期、按需
     *           * 询价必要参数：bandwidth.size（带宽大小）
     *       * huaweicloud_gaussdb_redis_instance: 
     *           * 支持的计费模式：包周期、按需
     *       * huaweicloud_nat_gateway: 
     *           * 支持的计费模式：按需
     *       * huaweicloud_rds_instance: 
     *           * 支持的计费模式：包周期、按需
     *           * 支持的数据库类型：MySQL、PostgreSQL、Microsoft SQL Server      
     *       * huaweicloud_sfs_turbo: 
     *           * 支持的计费模式：按需
     *           * 询价必要参数：share_type（文件系统类型）
     *       * huaweicloud_dms_kafka_instance: 
     *           * 支持的计费模式：按需
     *           * 询价必要参数：flavor_id（规格ID）、product_id（产品ID。flavor_id和product_id至少给出一个。）、storage_space（存储容量）
     *       * huaweicloud_dcs_instance: 
     *           * 支持的计费模式：包周期、按需
     *       * huaweicloud_gaussdb_mysql_instance: 
     *           * 支持的计费模式：包周期、按需
     *           * 询价必要参数：proxy_node_number（代理节点数量）、volume_size（挂载卷的存储空间）
     *       * huaweicloud_vpc: 
     *           * 支持的计费模式：免费
     *       * huaweicloud_drs_job: 
     *           * 支持的计费模式：按需
     *       * huaweicloud_apig_instance: 
     *           * 支持的计费模式：按需
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateExecutionPlanPriceRequest 请求对象
     * @return CompletableFuture<EstimateExecutionPlanPriceResponse>
     */
    public CompletableFuture<EstimateExecutionPlanPriceResponse> estimateExecutionPlanPriceAsync(
        EstimateExecutionPlanPriceRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.estimateExecutionPlanPrice);
    }

    /**
     * 预估执行计划价格
     *
     * 预估执行计划价格（EstimateExecutionPlanPrice）
     * 
     * 此API可以基于一份已有的执行计划中增量的资源进行询价，当前支持询价的计费模式有包周期计费、按需计费、免费，暂不支持其他形式的计费模式，例如竞价计费模式等。
     * 
     * 注：
     *   * 由于某些资源的属性值含有默认值，且该属性和询价参数相关。如果用户的模板中描述的资源没有声明这些属性，则询价结果可能存在偏差。
     *   * 询价结果仅为预估结果，具体请以实际为准。
     *   * 如果用户在模板中使用了depends_on参数，如A资源询价必要字段依赖于B资源的创建，则A资源不支持询价。
     *   * 暂不支持传入data sources的flavor.id的场景的询价。
     *   * 暂不支持镜像询价。
     *   * 如果A资源的询价必要字段设置了sensitive &#x3D; true，则A资源不支持询价。
     *   * 模板中询价的资源的个数是有限制的。当前一个模板中最多支持12个包周期计费资源和24个按需计费资源。
     *   * 支持询价的资源列表和询价必要参数
     *       * huaweicloud_cce_cluster: 
     *           * 支持的计费模式：包周期、按需
     *       * huaweicloud_css_cluster:
     *           * 支持的计费模式：按需
     *       * huaweicloud_evs_volume: 
     *           * 支持的计费模式：包周期、按需
     *           * 询价必要参数：size（磁盘规格）
     *       * huaweicloud_compute_instance: 
     *           * 支持的计费模式：包周期、按需
     *           * 询价必要参数：flavor_id（规格ID）、flavor_name（规格名称，flavor_id和flavor_name至少给出一个）、system_disk_size（系统磁盘大小）
     *       * huaweicloud_vpc_bandwidth:
     *           * 支持的计费模式：按需
     *           * 询价必要参数：charge_mode仅支持bandwidth
     *       * huaweicloud_vpc_eip: 
     *           * 支持的计费模式：包周期、按需
     *           * 询价必要参数：bandwidth.size（带宽大小）
     *       * huaweicloud_gaussdb_redis_instance: 
     *           * 支持的计费模式：包周期、按需
     *       * huaweicloud_nat_gateway: 
     *           * 支持的计费模式：按需
     *       * huaweicloud_rds_instance: 
     *           * 支持的计费模式：包周期、按需
     *           * 支持的数据库类型：MySQL、PostgreSQL、Microsoft SQL Server      
     *       * huaweicloud_sfs_turbo: 
     *           * 支持的计费模式：按需
     *           * 询价必要参数：share_type（文件系统类型）
     *       * huaweicloud_dms_kafka_instance: 
     *           * 支持的计费模式：按需
     *           * 询价必要参数：flavor_id（规格ID）、product_id（产品ID。flavor_id和product_id至少给出一个。）、storage_space（存储容量）
     *       * huaweicloud_dcs_instance: 
     *           * 支持的计费模式：包周期、按需
     *       * huaweicloud_gaussdb_mysql_instance: 
     *           * 支持的计费模式：包周期、按需
     *           * 询价必要参数：proxy_node_number（代理节点数量）、volume_size（挂载卷的存储空间）
     *       * huaweicloud_vpc: 
     *           * 支持的计费模式：免费
     *       * huaweicloud_drs_job: 
     *           * 支持的计费模式：按需
     *       * huaweicloud_apig_instance: 
     *           * 支持的计费模式：按需
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EstimateExecutionPlanPriceRequest 请求对象
     * @return AsyncInvoker<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse>
     */
    public AsyncInvoker<EstimateExecutionPlanPriceRequest, EstimateExecutionPlanPriceResponse> estimateExecutionPlanPriceAsyncInvoker(
        EstimateExecutionPlanPriceRequest request) {
        return new AsyncInvoker<>(request, AosMeta.estimateExecutionPlanPrice, hcClient);
    }

    /**
     * 获取执行计划
     *
     * 获取执行计划（GetExecutionPlan）
     * 
     * 此API用于获取指定执行计划的详细内容（即执行计划项目），用户可通过此API得知指定执行计划在执行后，资源栈中的资源会发生何种变化
     * 
     * 如果执行计划状态为&#x60;CREATION_IN_PROGRESS&#x60;或&#x60;CREATION_FAILED&#x60;，则不返回执行计划项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetExecutionPlanRequest 请求对象
     * @return CompletableFuture<GetExecutionPlanResponse>
     */
    public CompletableFuture<GetExecutionPlanResponse> getExecutionPlanAsync(GetExecutionPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.getExecutionPlan);
    }

    /**
     * 获取执行计划
     *
     * 获取执行计划（GetExecutionPlan）
     * 
     * 此API用于获取指定执行计划的详细内容（即执行计划项目），用户可通过此API得知指定执行计划在执行后，资源栈中的资源会发生何种变化
     * 
     * 如果执行计划状态为&#x60;CREATION_IN_PROGRESS&#x60;或&#x60;CREATION_FAILED&#x60;，则不返回执行计划项目列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetExecutionPlanRequest 请求对象
     * @return AsyncInvoker<GetExecutionPlanRequest, GetExecutionPlanResponse>
     */
    public AsyncInvoker<GetExecutionPlanRequest, GetExecutionPlanResponse> getExecutionPlanAsyncInvoker(
        GetExecutionPlanRequest request) {
        return new AsyncInvoker<>(request, AosMeta.getExecutionPlan, hcClient);
    }

    /**
     * 获取执行计划元数据
     *
     * 获取执行计划元数据（GetExecutionPlanMetadata）
     * 
     * 该API可以获取指定执行计划的元数据，包括资源栈ID、资源栈名称、执行计划ID、执行计划名称、执行计划描述、执行计划的创建时间和执行时间、执行计划状态等信息。
     * 
     * 具体信息见GetExecutionPlanMetadataResponseBody。
     * 
     * 如果需要获取执行计划的具体内容，请调用GetExecutionPlan。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetExecutionPlanMetadataRequest 请求对象
     * @return CompletableFuture<GetExecutionPlanMetadataResponse>
     */
    public CompletableFuture<GetExecutionPlanMetadataResponse> getExecutionPlanMetadataAsync(
        GetExecutionPlanMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.getExecutionPlanMetadata);
    }

    /**
     * 获取执行计划元数据
     *
     * 获取执行计划元数据（GetExecutionPlanMetadata）
     * 
     * 该API可以获取指定执行计划的元数据，包括资源栈ID、资源栈名称、执行计划ID、执行计划名称、执行计划描述、执行计划的创建时间和执行时间、执行计划状态等信息。
     * 
     * 具体信息见GetExecutionPlanMetadataResponseBody。
     * 
     * 如果需要获取执行计划的具体内容，请调用GetExecutionPlan。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetExecutionPlanMetadataRequest 请求对象
     * @return AsyncInvoker<GetExecutionPlanMetadataRequest, GetExecutionPlanMetadataResponse>
     */
    public AsyncInvoker<GetExecutionPlanMetadataRequest, GetExecutionPlanMetadataResponse> getExecutionPlanMetadataAsyncInvoker(
        GetExecutionPlanMetadataRequest request) {
        return new AsyncInvoker<>(request, AosMeta.getExecutionPlanMetadata, hcClient);
    }

    /**
     * 列举执行计划
     *
     * 列举执行计划（ListExecutionPlans）
     * 
     * 列举当前局点下用户指定资源栈下所有的执行计划
     * 
     *   * 默认按照生成时间降序排序，最新生成的在最前
     *   * 注意：目前暂时返回全量执行计划信息，即不支持分页
     *   * 如果指定的资源栈下没有任何执行计划，则返回空list
     *   * 如果指定的资源栈不存在，则返回404
     * 
     * ListExecutionPlans返回的只有摘要信息（具体摘要信息见ListExecutionPlansResponseBody），如果用户需要详细的执行计划元数据请调用GetExecutionPlanMetadata
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionPlansRequest 请求对象
     * @return CompletableFuture<ListExecutionPlansResponse>
     */
    public CompletableFuture<ListExecutionPlansResponse> listExecutionPlansAsync(ListExecutionPlansRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listExecutionPlans);
    }

    /**
     * 列举执行计划
     *
     * 列举执行计划（ListExecutionPlans）
     * 
     * 列举当前局点下用户指定资源栈下所有的执行计划
     * 
     *   * 默认按照生成时间降序排序，最新生成的在最前
     *   * 注意：目前暂时返回全量执行计划信息，即不支持分页
     *   * 如果指定的资源栈下没有任何执行计划，则返回空list
     *   * 如果指定的资源栈不存在，则返回404
     * 
     * ListExecutionPlans返回的只有摘要信息（具体摘要信息见ListExecutionPlansResponseBody），如果用户需要详细的执行计划元数据请调用GetExecutionPlanMetadata
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExecutionPlansRequest 请求对象
     * @return AsyncInvoker<ListExecutionPlansRequest, ListExecutionPlansResponse>
     */
    public AsyncInvoker<ListExecutionPlansRequest, ListExecutionPlansResponse> listExecutionPlansAsyncInvoker(
        ListExecutionPlansRequest request) {
        return new AsyncInvoker<>(request, AosMeta.listExecutionPlans, hcClient);
    }

    /**
     * 创建私有hook
     *
     * 创建私有hook（CreatePrivateHook）
     * 
     * 创建一个带有初始默认版本的私有hook，创建私有hook的时候需要同时创建一个初始化的默认版本，不允许空私有hook的创建。
     * 设置配置(Configuration)后的私有hook才会在触发资源栈部署时生效，资源栈使用私有hook的默认版本。若创建私有hook时未指定配置项，则该私有hook在资源栈部署时不生效，后续可通过UpdatePrivateHook API更新配置。
     * 
     *   * 支持hook策略模板检验的资源栈服务API：
     *       CreateExecutionPlan
     *       ApplyExecutionPlan
     *       CreateStack
     *       DeployStack
     *       ContinueDeployStack
     *       DeleteStack
     *       DeleteStackEnhanced
     *   * 创建私有hook时指定的版本为初始默认版本。
     *   * 如果同名的私有hook在当前domain_id+region下已经存在，则会返回409。
     *   * 私有hook版本号遵循语义化版本号（Semantic Version），为用户自定义。
     *   * 资源编排服务会对私有hook进行校验，如文件大小，策略文件语法校验等。若存在错误，则会创建失败。
     *   * 当前仅支持部署资源前的检测，不支持部署资源过程中的检测。如果通过了部署资源前的检测，资源栈则会继续部署资源。反之会停止部署资源，并记录资源栈事件（stack events）。
     *   * 仅支持OPA开源引擎识别的，以Rego（https://www.openpolicyagent.org/docs/latest/policy-language/）语言编写的策略模板(用户可以通过policy_uri或policy_body给予策略文件内容)。
     *   * 策略模板中的决策结果使用object类型的hook_result，hook_result所在包的包名必须使用policy。hook_result格式如下：
     *       &#x60;&#x60;&#x60;
     *       hook_result :&#x3D; {
     *         \&quot;is_passed\&quot;: Bool,
     *         \&quot;err_msg\&quot;: String,
     *       }
     *       &#x60;&#x60;&#x60;
     *     其中is_passed必选，err_msg可选。RFS通过查询policy.hook_result[is_passed]判断是否通过策略校验。
     *     * 如果policy.hook_result[is_passed]的结果是true，则表示通过策略校验，资源编排服务会继续部署资源。
     *     * 如果policy.hook_result[is_passed]的结果是false，则表示没有通过策略校验，资源编排服务会停止部署资源。并记录资源栈事件信息，信息的内容为policy.hook_result[err_msg]。如果没有设置err_msg，则资源栈事件信息内容为默认错误信息（校验私有hook失败）。
     *     * 如果没有使用policy.hook_result，则该策略不会生效，资源编排服务会继续部署资源。
     *   * 策略模板中不支持调用其他服务API等方式获取数据、不支持任何形式的网络访问、不支持以任何形式的自定义函数或者方法等、不支持读取本地文件以及系统操作。
     * 
     * 私有hook的策略模板语法如下：
     * &#x60;&#x60;&#x60;
     * package policy
     * 
     * import rego.v1
     * 
     * hook_result :&#x3D; {
     *   \&quot;is_passed\&quot;: input.message &#x3D;&#x3D; \&quot;world\&quot;,
     *   \&quot;err_msg\&quot;: \&quot;The error msg when private hook is not passed the validation\&quot;,
     * }
     * &#x60;&#x60;&#x60;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateHookRequest 请求对象
     * @return CompletableFuture<CreatePrivateHookResponse>
     */
    public CompletableFuture<CreatePrivateHookResponse> createPrivateHookAsync(CreatePrivateHookRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.createPrivateHook);
    }

    /**
     * 创建私有hook
     *
     * 创建私有hook（CreatePrivateHook）
     * 
     * 创建一个带有初始默认版本的私有hook，创建私有hook的时候需要同时创建一个初始化的默认版本，不允许空私有hook的创建。
     * 设置配置(Configuration)后的私有hook才会在触发资源栈部署时生效，资源栈使用私有hook的默认版本。若创建私有hook时未指定配置项，则该私有hook在资源栈部署时不生效，后续可通过UpdatePrivateHook API更新配置。
     * 
     *   * 支持hook策略模板检验的资源栈服务API：
     *       CreateExecutionPlan
     *       ApplyExecutionPlan
     *       CreateStack
     *       DeployStack
     *       ContinueDeployStack
     *       DeleteStack
     *       DeleteStackEnhanced
     *   * 创建私有hook时指定的版本为初始默认版本。
     *   * 如果同名的私有hook在当前domain_id+region下已经存在，则会返回409。
     *   * 私有hook版本号遵循语义化版本号（Semantic Version），为用户自定义。
     *   * 资源编排服务会对私有hook进行校验，如文件大小，策略文件语法校验等。若存在错误，则会创建失败。
     *   * 当前仅支持部署资源前的检测，不支持部署资源过程中的检测。如果通过了部署资源前的检测，资源栈则会继续部署资源。反之会停止部署资源，并记录资源栈事件（stack events）。
     *   * 仅支持OPA开源引擎识别的，以Rego（https://www.openpolicyagent.org/docs/latest/policy-language/）语言编写的策略模板(用户可以通过policy_uri或policy_body给予策略文件内容)。
     *   * 策略模板中的决策结果使用object类型的hook_result，hook_result所在包的包名必须使用policy。hook_result格式如下：
     *       &#x60;&#x60;&#x60;
     *       hook_result :&#x3D; {
     *         \&quot;is_passed\&quot;: Bool,
     *         \&quot;err_msg\&quot;: String,
     *       }
     *       &#x60;&#x60;&#x60;
     *     其中is_passed必选，err_msg可选。RFS通过查询policy.hook_result[is_passed]判断是否通过策略校验。
     *     * 如果policy.hook_result[is_passed]的结果是true，则表示通过策略校验，资源编排服务会继续部署资源。
     *     * 如果policy.hook_result[is_passed]的结果是false，则表示没有通过策略校验，资源编排服务会停止部署资源。并记录资源栈事件信息，信息的内容为policy.hook_result[err_msg]。如果没有设置err_msg，则资源栈事件信息内容为默认错误信息（校验私有hook失败）。
     *     * 如果没有使用policy.hook_result，则该策略不会生效，资源编排服务会继续部署资源。
     *   * 策略模板中不支持调用其他服务API等方式获取数据、不支持任何形式的网络访问、不支持以任何形式的自定义函数或者方法等、不支持读取本地文件以及系统操作。
     * 
     * 私有hook的策略模板语法如下：
     * &#x60;&#x60;&#x60;
     * package policy
     * 
     * import rego.v1
     * 
     * hook_result :&#x3D; {
     *   \&quot;is_passed\&quot;: input.message &#x3D;&#x3D; \&quot;world\&quot;,
     *   \&quot;err_msg\&quot;: \&quot;The error msg when private hook is not passed the validation\&quot;,
     * }
     * &#x60;&#x60;&#x60;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateHookRequest 请求对象
     * @return AsyncInvoker<CreatePrivateHookRequest, CreatePrivateHookResponse>
     */
    public AsyncInvoker<CreatePrivateHookRequest, CreatePrivateHookResponse> createPrivateHookAsyncInvoker(
        CreatePrivateHookRequest request) {
        return new AsyncInvoker<>(request, AosMeta.createPrivateHook, hcClient);
    }

    /**
     * 创建私有hook版本
     *
     * 创建私有hook版本（CreatePrivateHookVersion）
     * 
     * 创建私有hook版本，创建私有hook版本后需要调用UpdatePrivateHook API设置为默认版本才能生效。
     * 
     *   * 版本号遵循语义化版本号（Semantic Version），为用户自定义。
     *   * 若hook_name和hook_id同时存在，则资源编排服务会检查是否两个匹配，如果不匹配则会返回400。
     *   * 资源编排服务会对私有hook进行校验，如文件大小，策略文件语法校验等。若存在错误，则会创建失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateHookVersionRequest 请求对象
     * @return CompletableFuture<CreatePrivateHookVersionResponse>
     */
    public CompletableFuture<CreatePrivateHookVersionResponse> createPrivateHookVersionAsync(
        CreatePrivateHookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.createPrivateHookVersion);
    }

    /**
     * 创建私有hook版本
     *
     * 创建私有hook版本（CreatePrivateHookVersion）
     * 
     * 创建私有hook版本，创建私有hook版本后需要调用UpdatePrivateHook API设置为默认版本才能生效。
     * 
     *   * 版本号遵循语义化版本号（Semantic Version），为用户自定义。
     *   * 若hook_name和hook_id同时存在，则资源编排服务会检查是否两个匹配，如果不匹配则会返回400。
     *   * 资源编排服务会对私有hook进行校验，如文件大小，策略文件语法校验等。若存在错误，则会创建失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateHookVersionRequest 请求对象
     * @return AsyncInvoker<CreatePrivateHookVersionRequest, CreatePrivateHookVersionResponse>
     */
    public AsyncInvoker<CreatePrivateHookVersionRequest, CreatePrivateHookVersionResponse> createPrivateHookVersionAsyncInvoker(
        CreatePrivateHookVersionRequest request) {
        return new AsyncInvoker<>(request, AosMeta.createPrivateHookVersion, hcClient);
    }

    /**
     * 删除私有hook
     *
     * 删除私有hook（DeletePrivateHook）
     * 
     * 删除某个私有hook以及私有hook下的全部hook版本
     * 
     *   * 默认版本只能调用本API删除，除默认版本外的其它版本可以调用DeletePrivateHookVersion API删除。
     *   * 若hook_name和hook_id同时存在，则资源编排服务会检查是否两个匹配，如果不匹配则会返回400。
     * 
     * **请谨慎操作，删除私有hook将会删除该私有hook和该私有hook下的所有私有hook版本。**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivateHookRequest 请求对象
     * @return CompletableFuture<DeletePrivateHookResponse>
     */
    public CompletableFuture<DeletePrivateHookResponse> deletePrivateHookAsync(DeletePrivateHookRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deletePrivateHook);
    }

    /**
     * 删除私有hook
     *
     * 删除私有hook（DeletePrivateHook）
     * 
     * 删除某个私有hook以及私有hook下的全部hook版本
     * 
     *   * 默认版本只能调用本API删除，除默认版本外的其它版本可以调用DeletePrivateHookVersion API删除。
     *   * 若hook_name和hook_id同时存在，则资源编排服务会检查是否两个匹配，如果不匹配则会返回400。
     * 
     * **请谨慎操作，删除私有hook将会删除该私有hook和该私有hook下的所有私有hook版本。**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivateHookRequest 请求对象
     * @return AsyncInvoker<DeletePrivateHookRequest, DeletePrivateHookResponse>
     */
    public AsyncInvoker<DeletePrivateHookRequest, DeletePrivateHookResponse> deletePrivateHookAsyncInvoker(
        DeletePrivateHookRequest request) {
        return new AsyncInvoker<>(request, AosMeta.deletePrivateHook, hcClient);
    }

    /**
     * 删除私有hook版本
     *
     * 删除私有hook版本（DeletePrivateHookVersion）
     * 
     * 删除某个私有hook版本
     * 
     *   * 默认版本只能调用DeletePrivateHook API删除，除默认版本外的其它版本都可以调用本API删除。
     *   * 若hook_name和hook_id同时存在，则资源编排服务会检查是否两个匹配，如果不匹配则会返回400。
     * 
     * **请谨慎操作**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivateHookVersionRequest 请求对象
     * @return CompletableFuture<DeletePrivateHookVersionResponse>
     */
    public CompletableFuture<DeletePrivateHookVersionResponse> deletePrivateHookVersionAsync(
        DeletePrivateHookVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deletePrivateHookVersion);
    }

    /**
     * 删除私有hook版本
     *
     * 删除私有hook版本（DeletePrivateHookVersion）
     * 
     * 删除某个私有hook版本
     * 
     *   * 默认版本只能调用DeletePrivateHook API删除，除默认版本外的其它版本都可以调用本API删除。
     *   * 若hook_name和hook_id同时存在，则资源编排服务会检查是否两个匹配，如果不匹配则会返回400。
     * 
     * **请谨慎操作**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivateHookVersionRequest 请求对象
     * @return AsyncInvoker<DeletePrivateHookVersionRequest, DeletePrivateHookVersionResponse>
     */
    public AsyncInvoker<DeletePrivateHookVersionRequest, DeletePrivateHookVersionResponse> deletePrivateHookVersionAsyncInvoker(
        DeletePrivateHookVersionRequest request) {
        return new AsyncInvoker<>(request, AosMeta.deletePrivateHookVersion, hcClient);
    }

    /**
     * 列举私有hook
     *
     * 列举私有hook（ListPrivateHooks）
     * 
     * 列举当前局点下用户所有的私有hook。
     * 
     *   * 可以使用sort_key和sort_dir两个关键字对返回结果按创建时间（create_time）进行排序。给予的sort_key和sort_dir的数量须一致，否则返回400。若未给予sort_key和sort_dir，则默认按照创建时间降序排序。
     *   * 注意：目前暂时返回全量hook的信息，即不支持分页。
     *   * 若当前用户没有任何私有hook，则返回空list。
     *   * 具体返回的信息见ListPrivateHooksResponseBody。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivateHooksRequest 请求对象
     * @return CompletableFuture<ListPrivateHooksResponse>
     */
    public CompletableFuture<ListPrivateHooksResponse> listPrivateHooksAsync(ListPrivateHooksRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listPrivateHooks);
    }

    /**
     * 列举私有hook
     *
     * 列举私有hook（ListPrivateHooks）
     * 
     * 列举当前局点下用户所有的私有hook。
     * 
     *   * 可以使用sort_key和sort_dir两个关键字对返回结果按创建时间（create_time）进行排序。给予的sort_key和sort_dir的数量须一致，否则返回400。若未给予sort_key和sort_dir，则默认按照创建时间降序排序。
     *   * 注意：目前暂时返回全量hook的信息，即不支持分页。
     *   * 若当前用户没有任何私有hook，则返回空list。
     *   * 具体返回的信息见ListPrivateHooksResponseBody。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivateHooksRequest 请求对象
     * @return AsyncInvoker<ListPrivateHooksRequest, ListPrivateHooksResponse>
     */
    public AsyncInvoker<ListPrivateHooksRequest, ListPrivateHooksResponse> listPrivateHooksAsyncInvoker(
        ListPrivateHooksRequest request) {
        return new AsyncInvoker<>(request, AosMeta.listPrivateHooks, hcClient);
    }

    /**
     * 获取私有hook元数据
     *
     * 获取私有hook元数据（ShowPrivateHookMetadata）
     * 
     * 获取某个私有hook的元数据信息
     * 
     *   * 具体返回的信息见ShowPrivateHookMetadataResponseBody，若想查看私有hook下全部版本，请调用ListPrivateHookVersions。
     *   * 若hook_name和hook_id同时存在，则资源编排服务会检查两个是否匹配，如果不匹配则会返回400。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateHookMetadataRequest 请求对象
     * @return CompletableFuture<ShowPrivateHookMetadataResponse>
     */
    public CompletableFuture<ShowPrivateHookMetadataResponse> showPrivateHookMetadataAsync(
        ShowPrivateHookMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.showPrivateHookMetadata);
    }

    /**
     * 获取私有hook元数据
     *
     * 获取私有hook元数据（ShowPrivateHookMetadata）
     * 
     * 获取某个私有hook的元数据信息
     * 
     *   * 具体返回的信息见ShowPrivateHookMetadataResponseBody，若想查看私有hook下全部版本，请调用ListPrivateHookVersions。
     *   * 若hook_name和hook_id同时存在，则资源编排服务会检查两个是否匹配，如果不匹配则会返回400。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateHookMetadataRequest 请求对象
     * @return AsyncInvoker<ShowPrivateHookMetadataRequest, ShowPrivateHookMetadataResponse>
     */
    public AsyncInvoker<ShowPrivateHookMetadataRequest, ShowPrivateHookMetadataResponse> showPrivateHookMetadataAsyncInvoker(
        ShowPrivateHookMetadataRequest request) {
        return new AsyncInvoker<>(request, AosMeta.showPrivateHookMetadata, hcClient);
    }

    /**
     * 获取私有hook版本的元数据
     *
     * 获取私有hook版本的元数据（ShowPrivateHookVersionMetadata）
     * 
     * 获取当前私有hook对应版本的元数据信息
     * 
     *   * 具体返回的信息见ShowPrivateHookVersionMetadataResponseBody。
     *   * 如果hook_name和hook_id同时存在，则资源编排服务会检查是否两个匹配，如果不匹配则会返回400。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateHookVersionMetadataRequest 请求对象
     * @return CompletableFuture<ShowPrivateHookVersionMetadataResponse>
     */
    public CompletableFuture<ShowPrivateHookVersionMetadataResponse> showPrivateHookVersionMetadataAsync(
        ShowPrivateHookVersionMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.showPrivateHookVersionMetadata);
    }

    /**
     * 获取私有hook版本的元数据
     *
     * 获取私有hook版本的元数据（ShowPrivateHookVersionMetadata）
     * 
     * 获取当前私有hook对应版本的元数据信息
     * 
     *   * 具体返回的信息见ShowPrivateHookVersionMetadataResponseBody。
     *   * 如果hook_name和hook_id同时存在，则资源编排服务会检查是否两个匹配，如果不匹配则会返回400。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateHookVersionMetadataRequest 请求对象
     * @return AsyncInvoker<ShowPrivateHookVersionMetadataRequest, ShowPrivateHookVersionMetadataResponse>
     */
    public AsyncInvoker<ShowPrivateHookVersionMetadataRequest, ShowPrivateHookVersionMetadataResponse> showPrivateHookVersionMetadataAsyncInvoker(
        ShowPrivateHookVersionMetadataRequest request) {
        return new AsyncInvoker<>(request, AosMeta.showPrivateHookVersionMetadata, hcClient);
    }

    /**
     * 获取私有hook版本策略
     *
     * 获取私有hook版本策略（ShowPrivateHookVersionPolicy）
     * 
     * 获取指定私有hook对应版本的策略。
     * 
     *   * 如果获取成功，则以临时重定向形式返回私有hook版本策略下载链接（OBS Pre Signed地址，有效期为5分钟），大多数的客户端会进行自动重定向并下载私有hook版本策略。
     *   * 如果未进行自动重定向，请参考HTTP的重定向规则获取私有hook版本策略下载链接，手动下载私有hook版本策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateHookVersionPolicyRequest 请求对象
     * @return CompletableFuture<ShowPrivateHookVersionPolicyResponse>
     */
    public CompletableFuture<ShowPrivateHookVersionPolicyResponse> showPrivateHookVersionPolicyAsync(
        ShowPrivateHookVersionPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.showPrivateHookVersionPolicy);
    }

    /**
     * 获取私有hook版本策略
     *
     * 获取私有hook版本策略（ShowPrivateHookVersionPolicy）
     * 
     * 获取指定私有hook对应版本的策略。
     * 
     *   * 如果获取成功，则以临时重定向形式返回私有hook版本策略下载链接（OBS Pre Signed地址，有效期为5分钟），大多数的客户端会进行自动重定向并下载私有hook版本策略。
     *   * 如果未进行自动重定向，请参考HTTP的重定向规则获取私有hook版本策略下载链接，手动下载私有hook版本策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateHookVersionPolicyRequest 请求对象
     * @return AsyncInvoker<ShowPrivateHookVersionPolicyRequest, ShowPrivateHookVersionPolicyResponse>
     */
    public AsyncInvoker<ShowPrivateHookVersionPolicyRequest, ShowPrivateHookVersionPolicyResponse> showPrivateHookVersionPolicyAsyncInvoker(
        ShowPrivateHookVersionPolicyRequest request) {
        return new AsyncInvoker<>(request, AosMeta.showPrivateHookVersionPolicy, hcClient);
    }

    /**
     * 更新私有hook元数据
     *
     * 更新私有hook元数据（UpdatePrivateHookMetadata）
     * 
     * 更新当前私有hook的元数据信息
     * 
     *   * 目前支持更新私有hook的描述、默认版本、配置。
     *   * 如果需要创建新的版本，请调用CreatePrivateHookVersion。
     *   * 更新为增量更新，即如果某个参数不提供，则保持原始值。
     *   * 如果请求中没有需要被更新的参数（如请求中没有任何内容，或仅有hook_id），则返回400。注意：即使更新原始值和目标值一致也被认为是有效更新
     *   * 更新后私有hook的更新时间（update_time）也会被更新
     *   * 若hook_name和hook_id同时存在，则资源编排服务会检查是否两个匹配，如果不匹配则会返回400。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateHookMetadataRequest 请求对象
     * @return CompletableFuture<UpdatePrivateHookMetadataResponse>
     */
    public CompletableFuture<UpdatePrivateHookMetadataResponse> updatePrivateHookMetadataAsync(
        UpdatePrivateHookMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.updatePrivateHookMetadata);
    }

    /**
     * 更新私有hook元数据
     *
     * 更新私有hook元数据（UpdatePrivateHookMetadata）
     * 
     * 更新当前私有hook的元数据信息
     * 
     *   * 目前支持更新私有hook的描述、默认版本、配置。
     *   * 如果需要创建新的版本，请调用CreatePrivateHookVersion。
     *   * 更新为增量更新，即如果某个参数不提供，则保持原始值。
     *   * 如果请求中没有需要被更新的参数（如请求中没有任何内容，或仅有hook_id），则返回400。注意：即使更新原始值和目标值一致也被认为是有效更新
     *   * 更新后私有hook的更新时间（update_time）也会被更新
     *   * 若hook_name和hook_id同时存在，则资源编排服务会检查是否两个匹配，如果不匹配则会返回400。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateHookMetadataRequest 请求对象
     * @return AsyncInvoker<UpdatePrivateHookMetadataRequest, UpdatePrivateHookMetadataResponse>
     */
    public AsyncInvoker<UpdatePrivateHookMetadataRequest, UpdatePrivateHookMetadataResponse> updatePrivateHookMetadataAsyncInvoker(
        UpdatePrivateHookMetadataRequest request) {
        return new AsyncInvoker<>(request, AosMeta.updatePrivateHookMetadata, hcClient);
    }

    /**
     * 继续部署资源栈
     *
     * 继续部署资源栈（ContinueDeployStack）
     * 
     * 此API用于继续部署一个已有的资源栈
     * 
     * * 如果资源栈当前可以继续部署，即处于&#x60;DEPLOYMENT_FAILED&#x60;，则返回202与对应生成的deploymentId，否则将不允许继续部署并返回相应的错误码
     * 
     * * 继续部署操作依然有可能部署失败，用户可以从ListStackEvents获取对应的log，解决后可再次调用此API触发继续部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ContinueDeployStackRequest 请求对象
     * @return CompletableFuture<ContinueDeployStackResponse>
     */
    public CompletableFuture<ContinueDeployStackResponse> continueDeployStackAsync(ContinueDeployStackRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.continueDeployStack);
    }

    /**
     * 继续部署资源栈
     *
     * 继续部署资源栈（ContinueDeployStack）
     * 
     * 此API用于继续部署一个已有的资源栈
     * 
     * * 如果资源栈当前可以继续部署，即处于&#x60;DEPLOYMENT_FAILED&#x60;，则返回202与对应生成的deploymentId，否则将不允许继续部署并返回相应的错误码
     * 
     * * 继续部署操作依然有可能部署失败，用户可以从ListStackEvents获取对应的log，解决后可再次调用此API触发继续部署
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ContinueDeployStackRequest 请求对象
     * @return AsyncInvoker<ContinueDeployStackRequest, ContinueDeployStackResponse>
     */
    public AsyncInvoker<ContinueDeployStackRequest, ContinueDeployStackResponse> continueDeployStackAsyncInvoker(
        ContinueDeployStackRequest request) {
        return new AsyncInvoker<>(request, AosMeta.continueDeployStack, hcClient);
    }

    /**
     * 继续回滚资源栈
     *
     * 继续回滚资源栈（ContinueRollbackStack）
     * 
     * 此API用于继续回滚一个已有的资源栈
     * 
     * 如果资源栈开启了自动回滚，在部署失败的时候则会自动回滚。但是自动回滚依然有可能失败，用户可以根据错误信息修复后，调用ContinueRollbackStack触发继续回滚，即重试回滚
     * 
     * * 如果资源栈当前可以回滚，即处于&#x60;ROLLBACK_FAILED&#x60;，则返回202与对应生成的deploymentId，否则将不允许回滚并返回响应的错误码
     * * 继续回滚也有可能会回滚失败。如果失败，用户可以从ListStackEvents获取对应的log，解决后可再次调用ContinueRollbackStack去继续触发回滚
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ContinueRollbackStackRequest 请求对象
     * @return CompletableFuture<ContinueRollbackStackResponse>
     */
    public CompletableFuture<ContinueRollbackStackResponse> continueRollbackStackAsync(
        ContinueRollbackStackRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.continueRollbackStack);
    }

    /**
     * 继续回滚资源栈
     *
     * 继续回滚资源栈（ContinueRollbackStack）
     * 
     * 此API用于继续回滚一个已有的资源栈
     * 
     * 如果资源栈开启了自动回滚，在部署失败的时候则会自动回滚。但是自动回滚依然有可能失败，用户可以根据错误信息修复后，调用ContinueRollbackStack触发继续回滚，即重试回滚
     * 
     * * 如果资源栈当前可以回滚，即处于&#x60;ROLLBACK_FAILED&#x60;，则返回202与对应生成的deploymentId，否则将不允许回滚并返回响应的错误码
     * * 继续回滚也有可能会回滚失败。如果失败，用户可以从ListStackEvents获取对应的log，解决后可再次调用ContinueRollbackStack去继续触发回滚
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ContinueRollbackStackRequest 请求对象
     * @return AsyncInvoker<ContinueRollbackStackRequest, ContinueRollbackStackResponse>
     */
    public AsyncInvoker<ContinueRollbackStackRequest, ContinueRollbackStackResponse> continueRollbackStackAsyncInvoker(
        ContinueRollbackStackRequest request) {
        return new AsyncInvoker<>(request, AosMeta.continueRollbackStack, hcClient);
    }

    /**
     * 创建资源栈
     *
     * CreateStack用于生成一个资源栈
     * 
     * * 当请求中不含有模板（template）、参数（vars）等信息，将生成一个无任何资源的空资源栈，返回资源栈ID（stack_id）
     * * 当请求中携带了模板（template）、参数（vars）等信息，则会同时创建并部署资源栈，返回资源栈ID（stack_id）和部署ID（deployment_id）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStackRequest 请求对象
     * @return CompletableFuture<CreateStackResponse>
     */
    public CompletableFuture<CreateStackResponse> createStackAsync(CreateStackRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.createStack);
    }

    /**
     * 创建资源栈
     *
     * CreateStack用于生成一个资源栈
     * 
     * * 当请求中不含有模板（template）、参数（vars）等信息，将生成一个无任何资源的空资源栈，返回资源栈ID（stack_id）
     * * 当请求中携带了模板（template）、参数（vars）等信息，则会同时创建并部署资源栈，返回资源栈ID（stack_id）和部署ID（deployment_id）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStackRequest 请求对象
     * @return AsyncInvoker<CreateStackRequest, CreateStackResponse>
     */
    public AsyncInvoker<CreateStackRequest, CreateStackResponse> createStackAsyncInvoker(CreateStackRequest request) {
        return new AsyncInvoker<>(request, AosMeta.createStack, hcClient);
    }

    /**
     * 删除资源栈
     *
     * 删除资源栈（DeleteStack）
     * 
     * 此API用于删除某个资源栈
     * **请谨慎操作，删除资源栈将会删除与该资源栈相关的所有数据和资源，如：执行计划、资源栈事件、资源栈输出、资源等。**
     * 
     * * 此API会触发删除资源栈，并以最终一致性删除所有数据，用户可以调用GetStackMetadata或ListStacks跟踪资源栈删除情况
     * * 如果资源栈状态处于非终态（状态以&#x60;IN_PROGRESS&#x60;结尾）状态时，则不允许删除。包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     * * 如果资源栈开启了删除保护，则不允许删除。用户可调用GetStackMetadata，查看返回中的&#x60;enable_deletion_protection&#x60;字段判断删除保护是否开启。用户可通过调用UpdateStack关闭删除保护。
     * * 如果资源栈删除失败，可以根据StackEvents提示信息修复当前模板中的错误后，部署成功后再次删除资源栈。有以下两种方式触发部署：
     *   * 调用CreateExecutionPlan创建执行计划，执行计划创建成功后调用ApplyExecutionPlan部署资源栈。
     *   * 调用DeployStack部署资源栈
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStackRequest 请求对象
     * @return CompletableFuture<DeleteStackResponse>
     */
    public CompletableFuture<DeleteStackResponse> deleteStackAsync(DeleteStackRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deleteStack);
    }

    /**
     * 删除资源栈
     *
     * 删除资源栈（DeleteStack）
     * 
     * 此API用于删除某个资源栈
     * **请谨慎操作，删除资源栈将会删除与该资源栈相关的所有数据和资源，如：执行计划、资源栈事件、资源栈输出、资源等。**
     * 
     * * 此API会触发删除资源栈，并以最终一致性删除所有数据，用户可以调用GetStackMetadata或ListStacks跟踪资源栈删除情况
     * * 如果资源栈状态处于非终态（状态以&#x60;IN_PROGRESS&#x60;结尾）状态时，则不允许删除。包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     * * 如果资源栈开启了删除保护，则不允许删除。用户可调用GetStackMetadata，查看返回中的&#x60;enable_deletion_protection&#x60;字段判断删除保护是否开启。用户可通过调用UpdateStack关闭删除保护。
     * * 如果资源栈删除失败，可以根据StackEvents提示信息修复当前模板中的错误后，部署成功后再次删除资源栈。有以下两种方式触发部署：
     *   * 调用CreateExecutionPlan创建执行计划，执行计划创建成功后调用ApplyExecutionPlan部署资源栈。
     *   * 调用DeployStack部署资源栈
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStackRequest 请求对象
     * @return AsyncInvoker<DeleteStackRequest, DeleteStackResponse>
     */
    public AsyncInvoker<DeleteStackRequest, DeleteStackResponse> deleteStackAsyncInvoker(DeleteStackRequest request) {
        return new AsyncInvoker<>(request, AosMeta.deleteStack, hcClient);
    }

    /**
     * 条件删除资源栈
     *
     * 条件删除资源栈（DeleteStackEnhanced）
     * 
     * 此API用于删除某个资源栈，可以选择是否保留资源。
     * **请谨慎操作，删除资源栈将默认删除与该资源栈相关的所有数据，如：执行计划、资源栈事件、资源栈输出、资源等。**
     * **如果希望删除资源栈保留资源，可以在请求中设置&#x60;retain_all_resources&#x60;对资源进行保留。
     * 
     * * 此API会触发删除资源栈，并以最终一致性删除数据，用户可以调用GetStackMetadata或ListStacks跟踪资源栈删除情况。当删除完成后，被删除资源栈将不会在上述API中返回。
     * * 如果资源栈状态处于非终态（状态以&#x60;IN_PROGRESS&#x60;结尾）状态时，则不允许删除。包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     * 
     * * 如果资源栈开启了删除保护，则不允许删除。用户可调用GetStackMetadata，查看返回中的&#x60;enable_deletion_protection&#x60;字段判断删除保护是否开启。用户可通过调用UpdateStack关闭删除保护。
     * * 如果资源栈删除失败，可以根据StackEvents提示信息修复当前模板中的错误后，部署成功后再次删除资源栈。有以下两种方式触发部署：
     *   * 调用CreateExecutionPlan创建执行计划，执行计划创建成功后调用ApplyExecutionPlan部署资源栈。
     *   * 调用DeployStack部署资源栈。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStackEnhancedRequest 请求对象
     * @return CompletableFuture<DeleteStackEnhancedResponse>
     */
    public CompletableFuture<DeleteStackEnhancedResponse> deleteStackEnhancedAsync(DeleteStackEnhancedRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deleteStackEnhanced);
    }

    /**
     * 条件删除资源栈
     *
     * 条件删除资源栈（DeleteStackEnhanced）
     * 
     * 此API用于删除某个资源栈，可以选择是否保留资源。
     * **请谨慎操作，删除资源栈将默认删除与该资源栈相关的所有数据，如：执行计划、资源栈事件、资源栈输出、资源等。**
     * **如果希望删除资源栈保留资源，可以在请求中设置&#x60;retain_all_resources&#x60;对资源进行保留。
     * 
     * * 此API会触发删除资源栈，并以最终一致性删除数据，用户可以调用GetStackMetadata或ListStacks跟踪资源栈删除情况。当删除完成后，被删除资源栈将不会在上述API中返回。
     * * 如果资源栈状态处于非终态（状态以&#x60;IN_PROGRESS&#x60;结尾）状态时，则不允许删除。包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     * 
     * * 如果资源栈开启了删除保护，则不允许删除。用户可调用GetStackMetadata，查看返回中的&#x60;enable_deletion_protection&#x60;字段判断删除保护是否开启。用户可通过调用UpdateStack关闭删除保护。
     * * 如果资源栈删除失败，可以根据StackEvents提示信息修复当前模板中的错误后，部署成功后再次删除资源栈。有以下两种方式触发部署：
     *   * 调用CreateExecutionPlan创建执行计划，执行计划创建成功后调用ApplyExecutionPlan部署资源栈。
     *   * 调用DeployStack部署资源栈。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStackEnhancedRequest 请求对象
     * @return AsyncInvoker<DeleteStackEnhancedRequest, DeleteStackEnhancedResponse>
     */
    public AsyncInvoker<DeleteStackEnhancedRequest, DeleteStackEnhancedResponse> deleteStackEnhancedAsyncInvoker(
        DeleteStackEnhancedRequest request) {
        return new AsyncInvoker<>(request, AosMeta.deleteStackEnhanced, hcClient);
    }

    /**
     * 部署资源栈
     *
     * 部署资源栈（DeployStack）
     * 
     * 此API用于部署一个已有的资源栈
     * 
     * * 用户可以使用此API更新模板、参数等并触发一个新的部署
     * 
     * * 此API会直接触发部署，如果用户希望先确认部署会发生的时间，请使用执行计划，即使用CreateExecutionPlan以创建执行计划、使用GetExecutionPlan以获取执行计划
     * 
     * * 此API为全量API，即用户每次部署都需要给予所想要使用的template、vars的全量
     * 
     * * 当触发的部署失败时，如果资源栈开启了自动回滚，会触发自动回滚的流程，否则就会停留在部署失败时的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployStackRequest 请求对象
     * @return CompletableFuture<DeployStackResponse>
     */
    public CompletableFuture<DeployStackResponse> deployStackAsync(DeployStackRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deployStack);
    }

    /**
     * 部署资源栈
     *
     * 部署资源栈（DeployStack）
     * 
     * 此API用于部署一个已有的资源栈
     * 
     * * 用户可以使用此API更新模板、参数等并触发一个新的部署
     * 
     * * 此API会直接触发部署，如果用户希望先确认部署会发生的时间，请使用执行计划，即使用CreateExecutionPlan以创建执行计划、使用GetExecutionPlan以获取执行计划
     * 
     * * 此API为全量API，即用户每次部署都需要给予所想要使用的template、vars的全量
     * 
     * * 当触发的部署失败时，如果资源栈开启了自动回滚，会触发自动回滚的流程，否则就会停留在部署失败时的状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployStackRequest 请求对象
     * @return AsyncInvoker<DeployStackRequest, DeployStackResponse>
     */
    public AsyncInvoker<DeployStackRequest, DeployStackResponse> deployStackAsyncInvoker(DeployStackRequest request) {
        return new AsyncInvoker<>(request, AosMeta.deployStack, hcClient);
    }

    /**
     * 获取资源栈元数据
     *
     * 获取资源栈元数据（GetStackMetadata）
     * 
     * 此API用于获取指定资源栈的元数据，包括资源栈ID、资源栈名称、资源栈描述、创建时间、更新时间、资源栈状态、委托授权等信息。
     * 
     * 具体信息见GetStackMetadataResponseBody。
     * 
     * 注：
     * 当资源栈状态处于非终态（即以&#x60;IN_PROGRESS&#x60;结尾，详细见下方）状态时，资源栈的元数据信息处于转变阶段，可能为部署前的状态，也可能为部署后的状态。
     * 只有当资源栈状态处于终态（即以&#x60;COMPLETE&#x60;或&#x60;FAILED&#x60;结尾，详细见下方）时，资源栈的元数据信息才是部署后的状态
     * 
     * 非终态状态包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     * 
     * 终态状态包括但不限于以下状态：
     *   * 生成空资源栈完成（CREATION_COMPLETE）
     *   * 部署失败（DEPLOYMENT_FAILED）
     *   * 部署完成（DEPLOYMENT_COMPLETE）
     *   * 回滚失败（ROLLBACK_FAILED）
     *   * 回滚完成（ROLLBACK_COMPLETE）
     *   * 删除失败（DELETION_FAILED）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetStackMetadataRequest 请求对象
     * @return CompletableFuture<GetStackMetadataResponse>
     */
    public CompletableFuture<GetStackMetadataResponse> getStackMetadataAsync(GetStackMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.getStackMetadata);
    }

    /**
     * 获取资源栈元数据
     *
     * 获取资源栈元数据（GetStackMetadata）
     * 
     * 此API用于获取指定资源栈的元数据，包括资源栈ID、资源栈名称、资源栈描述、创建时间、更新时间、资源栈状态、委托授权等信息。
     * 
     * 具体信息见GetStackMetadataResponseBody。
     * 
     * 注：
     * 当资源栈状态处于非终态（即以&#x60;IN_PROGRESS&#x60;结尾，详细见下方）状态时，资源栈的元数据信息处于转变阶段，可能为部署前的状态，也可能为部署后的状态。
     * 只有当资源栈状态处于终态（即以&#x60;COMPLETE&#x60;或&#x60;FAILED&#x60;结尾，详细见下方）时，资源栈的元数据信息才是部署后的状态
     * 
     * 非终态状态包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     * 
     * 终态状态包括但不限于以下状态：
     *   * 生成空资源栈完成（CREATION_COMPLETE）
     *   * 部署失败（DEPLOYMENT_FAILED）
     *   * 部署完成（DEPLOYMENT_COMPLETE）
     *   * 回滚失败（ROLLBACK_FAILED）
     *   * 回滚完成（ROLLBACK_COMPLETE）
     *   * 删除失败（DELETION_FAILED）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetStackMetadataRequest 请求对象
     * @return AsyncInvoker<GetStackMetadataRequest, GetStackMetadataResponse>
     */
    public AsyncInvoker<GetStackMetadataRequest, GetStackMetadataResponse> getStackMetadataAsyncInvoker(
        GetStackMetadataRequest request) {
        return new AsyncInvoker<>(request, AosMeta.getStackMetadata, hcClient);
    }

    /**
     * 获取资源栈模板
     *
     * 获取资源栈模板（GetStackTemplate）
     * 
     * 此API用于获取资源栈最近一次部署终态使用的模板。
     * 
     * 注：
     * 当资源栈状态处于非终态（即以&#x60;IN_PROGRESS&#x60;结尾，详细见下方）状态时，资源栈处于转变阶段，此API获取资源栈上一次部署使用的模板。
     * 只有当资源栈状态处于终态（即以&#x60;COMPLETE&#x60;或&#x60;FAILED&#x60;结尾，详细见下方）时，此API获取当前最新一次部署使用的模板。CREATION_COMPLETE除外，此时资源栈没有模板，返回404，并提示模板不存在
     * 
     * 非终态状态包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     * 
     * 终态状态包括但不限于以下状态：
     *   * 生成空资源栈完成（CREATION_COMPLETE）
     *   * 部署失败（DEPLOYMENT_FAILED）
     *   * 部署完成（DEPLOYMENT_COMPLETE）
     *   * 回滚失败（ROLLBACK_FAILED）
     *   * 回滚完成（ROLLBACK_COMPLETE）
     *   * 删除失败（DELETION_FAILED）
     * 
     * 如果获取成功，则以临时重定向形式返回模板下载链接（OBS Pre Signed地址，有效期为5分钟），大多数的客户端会进行自动重定向并下载模板；
     * 如果未进行自动重定向，请参考HTTP的重定向规则获取模板下载链接，手动下载模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetStackTemplateRequest 请求对象
     * @return CompletableFuture<GetStackTemplateResponse>
     */
    public CompletableFuture<GetStackTemplateResponse> getStackTemplateAsync(GetStackTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.getStackTemplate);
    }

    /**
     * 获取资源栈模板
     *
     * 获取资源栈模板（GetStackTemplate）
     * 
     * 此API用于获取资源栈最近一次部署终态使用的模板。
     * 
     * 注：
     * 当资源栈状态处于非终态（即以&#x60;IN_PROGRESS&#x60;结尾，详细见下方）状态时，资源栈处于转变阶段，此API获取资源栈上一次部署使用的模板。
     * 只有当资源栈状态处于终态（即以&#x60;COMPLETE&#x60;或&#x60;FAILED&#x60;结尾，详细见下方）时，此API获取当前最新一次部署使用的模板。CREATION_COMPLETE除外，此时资源栈没有模板，返回404，并提示模板不存在
     * 
     * 非终态状态包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     * 
     * 终态状态包括但不限于以下状态：
     *   * 生成空资源栈完成（CREATION_COMPLETE）
     *   * 部署失败（DEPLOYMENT_FAILED）
     *   * 部署完成（DEPLOYMENT_COMPLETE）
     *   * 回滚失败（ROLLBACK_FAILED）
     *   * 回滚完成（ROLLBACK_COMPLETE）
     *   * 删除失败（DELETION_FAILED）
     * 
     * 如果获取成功，则以临时重定向形式返回模板下载链接（OBS Pre Signed地址，有效期为5分钟），大多数的客户端会进行自动重定向并下载模板；
     * 如果未进行自动重定向，请参考HTTP的重定向规则获取模板下载链接，手动下载模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetStackTemplateRequest 请求对象
     * @return AsyncInvoker<GetStackTemplateRequest, GetStackTemplateResponse>
     */
    public AsyncInvoker<GetStackTemplateRequest, GetStackTemplateResponse> getStackTemplateAsyncInvoker(
        GetStackTemplateRequest request) {
        return new AsyncInvoker<>(request, AosMeta.getStackTemplate, hcClient);
    }

    /**
     * 列举资源栈事件
     *
     * 列举资源栈事件（ListStackEvents）
     * 
     * 此API用于列举资源栈某一次或全部的部署事件
     * 
     * * 如果给予deployment_id，则会将deployment_id作为查询条件，返回对应某一次部署的资源栈事件；如果不给予deployment_id，则返回全量的资源栈事件
     * * 如果给定的deployment_id对应的部署不存在，则返回404
     * * 可以使用filter作为过滤器，过滤出指定事件类型（event_type）、资源类型（resource_type）、资源名称（resource_name）的资源栈事件
     * * 可以使用field选择数据应返回的属性，属性事件类型（event_type）不可配置，一定会返回，可选择的属性有逝去时间（elapsed_seconds）、事件消息（event_message）、 资源ID键（resource_id_key）、资源ID值（resource_id_value）、资源键（resource_key）、资源类型（resource_type）、资源名称（resource_name）和时间戳（timestamp）
     * * 事件返回将以时间降序排列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStackEventsRequest 请求对象
     * @return CompletableFuture<ListStackEventsResponse>
     */
    public CompletableFuture<ListStackEventsResponse> listStackEventsAsync(ListStackEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listStackEvents);
    }

    /**
     * 列举资源栈事件
     *
     * 列举资源栈事件（ListStackEvents）
     * 
     * 此API用于列举资源栈某一次或全部的部署事件
     * 
     * * 如果给予deployment_id，则会将deployment_id作为查询条件，返回对应某一次部署的资源栈事件；如果不给予deployment_id，则返回全量的资源栈事件
     * * 如果给定的deployment_id对应的部署不存在，则返回404
     * * 可以使用filter作为过滤器，过滤出指定事件类型（event_type）、资源类型（resource_type）、资源名称（resource_name）的资源栈事件
     * * 可以使用field选择数据应返回的属性，属性事件类型（event_type）不可配置，一定会返回，可选择的属性有逝去时间（elapsed_seconds）、事件消息（event_message）、 资源ID键（resource_id_key）、资源ID值（resource_id_value）、资源键（resource_key）、资源类型（resource_type）、资源名称（resource_name）和时间戳（timestamp）
     * * 事件返回将以时间降序排列
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStackEventsRequest 请求对象
     * @return AsyncInvoker<ListStackEventsRequest, ListStackEventsResponse>
     */
    public AsyncInvoker<ListStackEventsRequest, ListStackEventsResponse> listStackEventsAsyncInvoker(
        ListStackEventsRequest request) {
        return new AsyncInvoker<>(request, AosMeta.listStackEvents, hcClient);
    }

    /**
     * 列举资源栈输出
     *
     * 列举资源栈输出（ListStackOutputs）
     * 
     * 此API用于列举该资源栈的所有输出
     * 
     * 资源栈输出为用户在模板中定义的 output 语句块在部署结束后所产生的返回信息，用户可在部署结束后，调用此API获取其具体的输出信息
     * 
     * 当资源栈状态处于非终态（状态以&#x60;IN_PROGRESS&#x60;结尾）状态时，此API将返回空。非终态包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     * 
     * output为HCL官方定义的语法，其返回信息类似于常见编程语言中的返回值，详细定义请参考HCL官方的说明
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStackOutputsRequest 请求对象
     * @return CompletableFuture<ListStackOutputsResponse>
     */
    public CompletableFuture<ListStackOutputsResponse> listStackOutputsAsync(ListStackOutputsRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listStackOutputs);
    }

    /**
     * 列举资源栈输出
     *
     * 列举资源栈输出（ListStackOutputs）
     * 
     * 此API用于列举该资源栈的所有输出
     * 
     * 资源栈输出为用户在模板中定义的 output 语句块在部署结束后所产生的返回信息，用户可在部署结束后，调用此API获取其具体的输出信息
     * 
     * 当资源栈状态处于非终态（状态以&#x60;IN_PROGRESS&#x60;结尾）状态时，此API将返回空。非终态包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     * 
     * output为HCL官方定义的语法，其返回信息类似于常见编程语言中的返回值，详细定义请参考HCL官方的说明
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStackOutputsRequest 请求对象
     * @return AsyncInvoker<ListStackOutputsRequest, ListStackOutputsResponse>
     */
    public AsyncInvoker<ListStackOutputsRequest, ListStackOutputsResponse> listStackOutputsAsyncInvoker(
        ListStackOutputsRequest request) {
        return new AsyncInvoker<>(request, AosMeta.listStackOutputs, hcClient);
    }

    /**
     * 列举资源栈资源
     *
     * 列举资源栈资源（ListStackResources）
     * 
     * 此API用于列举资源栈中当前管理的所有资源的信息
     * 
     * 当资源栈处于非终态时，仅输出资源栈下资源的简要信息，包含逻辑资源名称（logical_resource_name），逻辑资源类型（logical_resource_type），物理资源id（physical_resource_id），物理资源名称（physical_resource_name），资源状态（status）等信息；当资源栈处于终态时，将额外输出具体信息，如资源属性（resource_attributes）
     * 
     * 非终态包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStackResourcesRequest 请求对象
     * @return CompletableFuture<ListStackResourcesResponse>
     */
    public CompletableFuture<ListStackResourcesResponse> listStackResourcesAsync(ListStackResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listStackResources);
    }

    /**
     * 列举资源栈资源
     *
     * 列举资源栈资源（ListStackResources）
     * 
     * 此API用于列举资源栈中当前管理的所有资源的信息
     * 
     * 当资源栈处于非终态时，仅输出资源栈下资源的简要信息，包含逻辑资源名称（logical_resource_name），逻辑资源类型（logical_resource_type），物理资源id（physical_resource_id），物理资源名称（physical_resource_name），资源状态（status）等信息；当资源栈处于终态时，将额外输出具体信息，如资源属性（resource_attributes）
     * 
     * 非终态包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStackResourcesRequest 请求对象
     * @return AsyncInvoker<ListStackResourcesRequest, ListStackResourcesResponse>
     */
    public AsyncInvoker<ListStackResourcesRequest, ListStackResourcesResponse> listStackResourcesAsyncInvoker(
        ListStackResourcesRequest request) {
        return new AsyncInvoker<>(request, AosMeta.listStackResources, hcClient);
    }

    /**
     * 列举资源栈
     *
     * 列举资源栈（ListStacks）
     * 
     * 此API用于列举当前局点下用户所有的资源栈
     * 
     *   * 默认按照生成时间降序排序，最新生成的在最前
     *   * 注意：目前暂时返回全量资源栈信息，即不支持分页
     *   * 如果没有任何资源栈，则返回空list
     * 
     * ListStacks返回的只有摘要信息（具体摘要信息见ListStacksResponseBody），如果用户需要详细的资源栈元数据请调用GetStackMetadata
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStacksRequest 请求对象
     * @return CompletableFuture<ListStacksResponse>
     */
    public CompletableFuture<ListStacksResponse> listStacksAsync(ListStacksRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listStacks);
    }

    /**
     * 列举资源栈
     *
     * 列举资源栈（ListStacks）
     * 
     * 此API用于列举当前局点下用户所有的资源栈
     * 
     *   * 默认按照生成时间降序排序，最新生成的在最前
     *   * 注意：目前暂时返回全量资源栈信息，即不支持分页
     *   * 如果没有任何资源栈，则返回空list
     * 
     * ListStacks返回的只有摘要信息（具体摘要信息见ListStacksResponseBody），如果用户需要详细的资源栈元数据请调用GetStackMetadata
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStacksRequest 请求对象
     * @return AsyncInvoker<ListStacksRequest, ListStacksResponse>
     */
    public AsyncInvoker<ListStacksRequest, ListStacksResponse> listStacksAsyncInvoker(ListStacksRequest request) {
        return new AsyncInvoker<>(request, AosMeta.listStacks, hcClient);
    }

    /**
     * 更新资源栈
     *
     * 更新资源栈（UpdateStack）
     * 
     * 更新资源栈的属性，该API可以根据用户给予的信息对资源栈的属性进行更新，可以更新资源栈的“description”、“enable_deletion_protection”、\&quot;enable_auto_rollback\&quot;、\&quot;agencies\&quot;四个属性中的一个或多个
     * 
     * 该API只会更新用户给予的信息中所涉及的字段；如果某字段未给予，则不会对该资源栈属性进行更新
     * 
     * 注：所有属性的更新都是覆盖式更新。即，所给予的参数将被完全覆盖至资源栈已有的属性上
     * 
     * 例如，如果要新增agencies，请通过GetStackMetadata获取该资源栈原有的agencies信息，将新旧agencies信息进行整合后再调用UpdateStack
     * 
     * * 如果资源栈状态处于非终态（状态以&#x60;IN_PROGRESS&#x60;结尾）状态时，则不允许更新。包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     * 
     * * 对于“enable_auto_rollback”属性从false到true的更新操作，资源栈状态判定将更加严格，在失败（状态以&#x60;_FAILED&#x60;结尾）状态时也不允许更新，包括但不限于以下状态：
     *   * 部署失败（DEPLOYMENT_FAILED）
     *   * 回滚失败（ROLLBACK_FAILED）
     *   * 删除失败（DELETION_FAILED）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStackRequest 请求对象
     * @return CompletableFuture<UpdateStackResponse>
     */
    public CompletableFuture<UpdateStackResponse> updateStackAsync(UpdateStackRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.updateStack);
    }

    /**
     * 更新资源栈
     *
     * 更新资源栈（UpdateStack）
     * 
     * 更新资源栈的属性，该API可以根据用户给予的信息对资源栈的属性进行更新，可以更新资源栈的“description”、“enable_deletion_protection”、\&quot;enable_auto_rollback\&quot;、\&quot;agencies\&quot;四个属性中的一个或多个
     * 
     * 该API只会更新用户给予的信息中所涉及的字段；如果某字段未给予，则不会对该资源栈属性进行更新
     * 
     * 注：所有属性的更新都是覆盖式更新。即，所给予的参数将被完全覆盖至资源栈已有的属性上
     * 
     * 例如，如果要新增agencies，请通过GetStackMetadata获取该资源栈原有的agencies信息，将新旧agencies信息进行整合后再调用UpdateStack
     * 
     * * 如果资源栈状态处于非终态（状态以&#x60;IN_PROGRESS&#x60;结尾）状态时，则不允许更新。包括但不限于以下状态：
     *   * 正在部署（DEPLOYMENT_IN_PROGRESS）
     *   * 正在删除（DELETION_IN_PROGRESS）
     *   * 正在回滚（ROLLBACK_IN_PROGRESS）
     * 
     * * 对于“enable_auto_rollback”属性从false到true的更新操作，资源栈状态判定将更加严格，在失败（状态以&#x60;_FAILED&#x60;结尾）状态时也不允许更新，包括但不限于以下状态：
     *   * 部署失败（DEPLOYMENT_FAILED）
     *   * 回滚失败（ROLLBACK_FAILED）
     *   * 删除失败（DELETION_FAILED）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStackRequest 请求对象
     * @return AsyncInvoker<UpdateStackRequest, UpdateStackResponse>
     */
    public AsyncInvoker<UpdateStackRequest, UpdateStackResponse> updateStackAsyncInvoker(UpdateStackRequest request) {
        return new AsyncInvoker<>(request, AosMeta.updateStack, hcClient);
    }

    /**
     * 创建资源栈实例
     *
     * 创建资源栈实例（CreateStackInstance）
     * 
     * 此API用于在指定资源栈集下生成多个资源栈实例，并返回资源栈集操作ID（stack_set_operation_id）
     * 
     * 此API可以通过var_overrides参数，指定创建资源栈实例的参数值，进行参数覆盖。如果var_overrides参数未给予，则默认使用当前资源栈集中记录的参数进行部署，详见：var_overrides参数描述。
     * 
     * 通过DeployStackSet API更新资源栈集参数后，资源栈实例中已经被覆盖的参数不会被更新，仍然保留覆盖值。
     * 
     * 用户只能覆盖已经在资源栈集中记录的参数，如果用户想要增加可以覆盖的参数，需要先通过DeployStackSet API更新资源栈集记录的参数集合。
     * 
     * * 用户可以根据资源栈集操作ID（stack_set_operation_id），通过ShowStackSetOperationMetadata API获取资源栈集操作状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStackInstanceRequest 请求对象
     * @return CompletableFuture<CreateStackInstanceResponse>
     */
    public CompletableFuture<CreateStackInstanceResponse> createStackInstanceAsync(CreateStackInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.createStackInstance);
    }

    /**
     * 创建资源栈实例
     *
     * 创建资源栈实例（CreateStackInstance）
     * 
     * 此API用于在指定资源栈集下生成多个资源栈实例，并返回资源栈集操作ID（stack_set_operation_id）
     * 
     * 此API可以通过var_overrides参数，指定创建资源栈实例的参数值，进行参数覆盖。如果var_overrides参数未给予，则默认使用当前资源栈集中记录的参数进行部署，详见：var_overrides参数描述。
     * 
     * 通过DeployStackSet API更新资源栈集参数后，资源栈实例中已经被覆盖的参数不会被更新，仍然保留覆盖值。
     * 
     * 用户只能覆盖已经在资源栈集中记录的参数，如果用户想要增加可以覆盖的参数，需要先通过DeployStackSet API更新资源栈集记录的参数集合。
     * 
     * * 用户可以根据资源栈集操作ID（stack_set_operation_id），通过ShowStackSetOperationMetadata API获取资源栈集操作状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStackInstanceRequest 请求对象
     * @return AsyncInvoker<CreateStackInstanceRequest, CreateStackInstanceResponse>
     */
    public AsyncInvoker<CreateStackInstanceRequest, CreateStackInstanceResponse> createStackInstanceAsyncInvoker(
        CreateStackInstanceRequest request) {
        return new AsyncInvoker<>(request, AosMeta.createStackInstance, hcClient);
    }

    /**
     * 创建资源栈集
     *
     * 创建资源栈集（CreateStackSet）
     * 
     * 此API为同步API，用于生成一个空资源栈集，即不包含任何一个资源栈实例，并返回资源栈集ID（stack_set_id）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStackSetRequest 请求对象
     * @return CompletableFuture<CreateStackSetResponse>
     */
    public CompletableFuture<CreateStackSetResponse> createStackSetAsync(CreateStackSetRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.createStackSet);
    }

    /**
     * 创建资源栈集
     *
     * 创建资源栈集（CreateStackSet）
     * 
     * 此API为同步API，用于生成一个空资源栈集，即不包含任何一个资源栈实例，并返回资源栈集ID（stack_set_id）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStackSetRequest 请求对象
     * @return AsyncInvoker<CreateStackSetRequest, CreateStackSetResponse>
     */
    public AsyncInvoker<CreateStackSetRequest, CreateStackSetResponse> createStackSetAsyncInvoker(
        CreateStackSetRequest request) {
        return new AsyncInvoker<>(request, AosMeta.createStackSet, hcClient);
    }

    /**
     * 删除资源栈实例
     *
     * 删除资源栈实例（DeleteStackInstance）
     * 
     * 此API用于删除指定资源栈集下指定局点（region）或指定成员账户（domain_id）的资源栈实例，并返回资源栈集操作ID（stack_set_operation_id）
     * 
     * **请谨慎操作，删除资源栈实例将会删除与该资源栈实例相关的堆栈以及堆栈所管理的一切资源。**
     * 
     * * 用户可以根据资源栈集操作ID（stack_set_operation_id），通过ShowStackSetOperationMetadata API获取资源栈集操作状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStackInstanceRequest 请求对象
     * @return CompletableFuture<DeleteStackInstanceResponse>
     */
    public CompletableFuture<DeleteStackInstanceResponse> deleteStackInstanceAsync(DeleteStackInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deleteStackInstance);
    }

    /**
     * 删除资源栈实例
     *
     * 删除资源栈实例（DeleteStackInstance）
     * 
     * 此API用于删除指定资源栈集下指定局点（region）或指定成员账户（domain_id）的资源栈实例，并返回资源栈集操作ID（stack_set_operation_id）
     * 
     * **请谨慎操作，删除资源栈实例将会删除与该资源栈实例相关的堆栈以及堆栈所管理的一切资源。**
     * 
     * * 用户可以根据资源栈集操作ID（stack_set_operation_id），通过ShowStackSetOperationMetadata API获取资源栈集操作状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStackInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteStackInstanceRequest, DeleteStackInstanceResponse>
     */
    public AsyncInvoker<DeleteStackInstanceRequest, DeleteStackInstanceResponse> deleteStackInstanceAsyncInvoker(
        DeleteStackInstanceRequest request) {
        return new AsyncInvoker<>(request, AosMeta.deleteStackInstance, hcClient);
    }

    /**
     * 删除资源栈实例-已废弃
     *
     * 删除资源栈实例-被废弃（DeleteStackInstanceDeprecated）
     * 
     * 此API用于删除指定资源栈集下指定局点（region）或指定成员账户（domain_id）的资源栈实例，并返回资源栈集操作ID（stack_set_operation_id）
     * 
     * **请谨慎操作，删除资源栈实例将会删除与该资源栈实例相关的堆栈以及堆栈所管理的一切资源。**
     * 
     * * 用户可以根据资源栈集操作ID（stack_set_operation_id），通过ShowStackSetOperationMetadata API获取资源栈集操作状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStackInstanceDeprecatedRequest 请求对象
     * @return CompletableFuture<DeleteStackInstanceDeprecatedResponse>
     */
    public CompletableFuture<DeleteStackInstanceDeprecatedResponse> deleteStackInstanceDeprecatedAsync(
        DeleteStackInstanceDeprecatedRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deleteStackInstanceDeprecated);
    }

    /**
     * 删除资源栈实例-已废弃
     *
     * 删除资源栈实例-被废弃（DeleteStackInstanceDeprecated）
     * 
     * 此API用于删除指定资源栈集下指定局点（region）或指定成员账户（domain_id）的资源栈实例，并返回资源栈集操作ID（stack_set_operation_id）
     * 
     * **请谨慎操作，删除资源栈实例将会删除与该资源栈实例相关的堆栈以及堆栈所管理的一切资源。**
     * 
     * * 用户可以根据资源栈集操作ID（stack_set_operation_id），通过ShowStackSetOperationMetadata API获取资源栈集操作状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStackInstanceDeprecatedRequest 请求对象
     * @return AsyncInvoker<DeleteStackInstanceDeprecatedRequest, DeleteStackInstanceDeprecatedResponse>
     */
    public AsyncInvoker<DeleteStackInstanceDeprecatedRequest, DeleteStackInstanceDeprecatedResponse> deleteStackInstanceDeprecatedAsyncInvoker(
        DeleteStackInstanceDeprecatedRequest request) {
        return new AsyncInvoker<>(request, AosMeta.deleteStackInstanceDeprecated, hcClient);
    }

    /**
     * 删除资源栈集
     *
     * 删除资源栈集（DeleteStackSet）
     * 
     * **请谨慎操作，删除资源栈集将会删除与该资源栈集相关的所有数据，如：资源栈集操作、资源栈集操作事件等。**
     * 
     * 当且仅当指定的资源栈集满足以下所有条件时，资源栈集才能被成功删除，否则会报错：
     *   * 资源栈集下没有资源栈实例
     *   * 资源栈集状态处于空闲（&#x60;IDLE&#x60;）状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStackSetRequest 请求对象
     * @return CompletableFuture<DeleteStackSetResponse>
     */
    public CompletableFuture<DeleteStackSetResponse> deleteStackSetAsync(DeleteStackSetRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deleteStackSet);
    }

    /**
     * 删除资源栈集
     *
     * 删除资源栈集（DeleteStackSet）
     * 
     * **请谨慎操作，删除资源栈集将会删除与该资源栈集相关的所有数据，如：资源栈集操作、资源栈集操作事件等。**
     * 
     * 当且仅当指定的资源栈集满足以下所有条件时，资源栈集才能被成功删除，否则会报错：
     *   * 资源栈集下没有资源栈实例
     *   * 资源栈集状态处于空闲（&#x60;IDLE&#x60;）状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStackSetRequest 请求对象
     * @return AsyncInvoker<DeleteStackSetRequest, DeleteStackSetResponse>
     */
    public AsyncInvoker<DeleteStackSetRequest, DeleteStackSetResponse> deleteStackSetAsyncInvoker(
        DeleteStackSetRequest request) {
        return new AsyncInvoker<>(request, AosMeta.deleteStackSet, hcClient);
    }

    /**
     * 部署资源栈集
     *
     * 部署资源栈集（DeployStackSet）
     * 
     * 此API用于部署一个已有的资源栈集，并返回资源栈集操作ID（stack_set_operation_id）
     * 
     * * 用户可以使用此API更新资源栈集的模板、参数并进行部署。
     * 
     * * 此API会直接触发资源栈实例部署。用户既可以部署资源栈集下所有的资源栈实例，也可以部署指定资源栈实例。
     * 
     * * 此API为全量API，即用户每次部署都需要给予所想要使用的template、vars的全量
     * 
     * * 当触发的部署失败时，资源栈集不会自动回滚模板和参数，但部署失败的资源栈会根据资源栈的回滚配置决定是否进行回滚，已经部署成功的资源栈不会触发回滚。
     * 
     * * 用户可以根据资源栈集操作ID（stack_set_operation_id），通过ShowStackSetOperationMetadata API获取资源栈集操作状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployStackSetRequest 请求对象
     * @return CompletableFuture<DeployStackSetResponse>
     */
    public CompletableFuture<DeployStackSetResponse> deployStackSetAsync(DeployStackSetRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deployStackSet);
    }

    /**
     * 部署资源栈集
     *
     * 部署资源栈集（DeployStackSet）
     * 
     * 此API用于部署一个已有的资源栈集，并返回资源栈集操作ID（stack_set_operation_id）
     * 
     * * 用户可以使用此API更新资源栈集的模板、参数并进行部署。
     * 
     * * 此API会直接触发资源栈实例部署。用户既可以部署资源栈集下所有的资源栈实例，也可以部署指定资源栈实例。
     * 
     * * 此API为全量API，即用户每次部署都需要给予所想要使用的template、vars的全量
     * 
     * * 当触发的部署失败时，资源栈集不会自动回滚模板和参数，但部署失败的资源栈会根据资源栈的回滚配置决定是否进行回滚，已经部署成功的资源栈不会触发回滚。
     * 
     * * 用户可以根据资源栈集操作ID（stack_set_operation_id），通过ShowStackSetOperationMetadata API获取资源栈集操作状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployStackSetRequest 请求对象
     * @return AsyncInvoker<DeployStackSetRequest, DeployStackSetResponse>
     */
    public AsyncInvoker<DeployStackSetRequest, DeployStackSetResponse> deployStackSetAsyncInvoker(
        DeployStackSetRequest request) {
        return new AsyncInvoker<>(request, AosMeta.deployStackSet, hcClient);
    }

    /**
     * 列举资源栈实例
     *
     * 列举资源栈实例（ListStackInstances）
     * 
     * 此API用于列举指定资源栈集下指定局点（region）或指定成员账户（stack_domain_id）或全部资源栈实例
     * 
     * * 可以使用filter作为过滤器，过滤出指定局点（region）或指定成员账户（stack_domain_id）下的资源栈实例
     * * 可以使用sort_key和sort_dir两个关键字对返回结果按创建时间（create_time）进行排序。给予的sort_key和sort_dir数量须一致，否则返回400。如果未给予sort_key和sort_dir，则默认按照创建时间降序排序。
     * * 如果指定资源栈集下没有任何资源栈实例，则返回空list
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStackInstancesRequest 请求对象
     * @return CompletableFuture<ListStackInstancesResponse>
     */
    public CompletableFuture<ListStackInstancesResponse> listStackInstancesAsync(ListStackInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listStackInstances);
    }

    /**
     * 列举资源栈实例
     *
     * 列举资源栈实例（ListStackInstances）
     * 
     * 此API用于列举指定资源栈集下指定局点（region）或指定成员账户（stack_domain_id）或全部资源栈实例
     * 
     * * 可以使用filter作为过滤器，过滤出指定局点（region）或指定成员账户（stack_domain_id）下的资源栈实例
     * * 可以使用sort_key和sort_dir两个关键字对返回结果按创建时间（create_time）进行排序。给予的sort_key和sort_dir数量须一致，否则返回400。如果未给予sort_key和sort_dir，则默认按照创建时间降序排序。
     * * 如果指定资源栈集下没有任何资源栈实例，则返回空list
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStackInstancesRequest 请求对象
     * @return AsyncInvoker<ListStackInstancesRequest, ListStackInstancesResponse>
     */
    public AsyncInvoker<ListStackInstancesRequest, ListStackInstancesResponse> listStackInstancesAsyncInvoker(
        ListStackInstancesRequest request) {
        return new AsyncInvoker<>(request, AosMeta.listStackInstances, hcClient);
    }

    /**
     * 列举资源栈集操作
     *
     * 列举资源栈集操作（ListStackSetOperations）
     * 
     * 列举指定资源栈集下所有的资源栈集的操作。
     * 
     * 可以使用filter作为过滤器，过滤出指定操作状态（status）或操作类型（action）下的资源栈集操作。
     * 可以使用sort_key和sort_dir两个关键字对返回结果按创建时间（create_time）进行排序。给予的sort_key和sort_dir数量须一致，否则返回400。如果未给予sort_key和sort_dir，则默认按照创建时间降序排序。
     * 如果指定资源栈集下没有任何资源栈集操作，则返回空list。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStackSetOperationsRequest 请求对象
     * @return CompletableFuture<ListStackSetOperationsResponse>
     */
    public CompletableFuture<ListStackSetOperationsResponse> listStackSetOperationsAsync(
        ListStackSetOperationsRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listStackSetOperations);
    }

    /**
     * 列举资源栈集操作
     *
     * 列举资源栈集操作（ListStackSetOperations）
     * 
     * 列举指定资源栈集下所有的资源栈集的操作。
     * 
     * 可以使用filter作为过滤器，过滤出指定操作状态（status）或操作类型（action）下的资源栈集操作。
     * 可以使用sort_key和sort_dir两个关键字对返回结果按创建时间（create_time）进行排序。给予的sort_key和sort_dir数量须一致，否则返回400。如果未给予sort_key和sort_dir，则默认按照创建时间降序排序。
     * 如果指定资源栈集下没有任何资源栈集操作，则返回空list。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStackSetOperationsRequest 请求对象
     * @return AsyncInvoker<ListStackSetOperationsRequest, ListStackSetOperationsResponse>
     */
    public AsyncInvoker<ListStackSetOperationsRequest, ListStackSetOperationsResponse> listStackSetOperationsAsyncInvoker(
        ListStackSetOperationsRequest request) {
        return new AsyncInvoker<>(request, AosMeta.listStackSetOperations, hcClient);
    }

    /**
     * 列举资源栈集
     *
     * 列举资源栈集（ListStackSets）
     * 
     * 此API用于列举当前用户（domain）当前局点（region）下全部资源栈集。
     * 
     * * 可以使用filter作为过滤器，过滤出指定权限模型（permission_model）下的资源栈集。
     * * 可以使用sort_key和sort_dir两个关键字对返回结果按创建时间（create_time）进行排序。给予的sort_key和sort_dir数量须一致，否则返回400。如果未给予sort_key和sort_dir，则默认按照创建时间降序排序。
     * * 注意：目前暂时返回全量资源栈集信息，即不支持分页
     * * 如果没有任何资源栈集，则返回空list
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStackSetsRequest 请求对象
     * @return CompletableFuture<ListStackSetsResponse>
     */
    public CompletableFuture<ListStackSetsResponse> listStackSetsAsync(ListStackSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listStackSets);
    }

    /**
     * 列举资源栈集
     *
     * 列举资源栈集（ListStackSets）
     * 
     * 此API用于列举当前用户（domain）当前局点（region）下全部资源栈集。
     * 
     * * 可以使用filter作为过滤器，过滤出指定权限模型（permission_model）下的资源栈集。
     * * 可以使用sort_key和sort_dir两个关键字对返回结果按创建时间（create_time）进行排序。给予的sort_key和sort_dir数量须一致，否则返回400。如果未给予sort_key和sort_dir，则默认按照创建时间降序排序。
     * * 注意：目前暂时返回全量资源栈集信息，即不支持分页
     * * 如果没有任何资源栈集，则返回空list
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStackSetsRequest 请求对象
     * @return AsyncInvoker<ListStackSetsRequest, ListStackSetsResponse>
     */
    public AsyncInvoker<ListStackSetsRequest, ListStackSetsResponse> listStackSetsAsyncInvoker(
        ListStackSetsRequest request) {
        return new AsyncInvoker<>(request, AosMeta.listStackSets, hcClient);
    }

    /**
     * 获取资源栈实例
     *
     * 获取资源栈实例（ShowStackInstance）
     * 
     * 用户可以使用此API获取资源栈实例的详细信息，包括关联资源栈名称与id，创建时间，参数覆盖等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStackInstanceRequest 请求对象
     * @return CompletableFuture<ShowStackInstanceResponse>
     */
    public CompletableFuture<ShowStackInstanceResponse> showStackInstanceAsync(ShowStackInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.showStackInstance);
    }

    /**
     * 获取资源栈实例
     *
     * 获取资源栈实例（ShowStackInstance）
     * 
     * 用户可以使用此API获取资源栈实例的详细信息，包括关联资源栈名称与id，创建时间，参数覆盖等
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStackInstanceRequest 请求对象
     * @return AsyncInvoker<ShowStackInstanceRequest, ShowStackInstanceResponse>
     */
    public AsyncInvoker<ShowStackInstanceRequest, ShowStackInstanceResponse> showStackInstanceAsyncInvoker(
        ShowStackInstanceRequest request) {
        return new AsyncInvoker<>(request, AosMeta.showStackInstance, hcClient);
    }

    /**
     * 获取资源栈集元数据
     *
     * 获取资源栈集元数据（ShowStackSetMetadata）
     * 
     * * 用户可以使用此API获取资源栈集的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStackSetMetadataRequest 请求对象
     * @return CompletableFuture<ShowStackSetMetadataResponse>
     */
    public CompletableFuture<ShowStackSetMetadataResponse> showStackSetMetadataAsync(
        ShowStackSetMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.showStackSetMetadata);
    }

    /**
     * 获取资源栈集元数据
     *
     * 获取资源栈集元数据（ShowStackSetMetadata）
     * 
     * * 用户可以使用此API获取资源栈集的元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStackSetMetadataRequest 请求对象
     * @return AsyncInvoker<ShowStackSetMetadataRequest, ShowStackSetMetadataResponse>
     */
    public AsyncInvoker<ShowStackSetMetadataRequest, ShowStackSetMetadataResponse> showStackSetMetadataAsyncInvoker(
        ShowStackSetMetadataRequest request) {
        return new AsyncInvoker<>(request, AosMeta.showStackSetMetadata, hcClient);
    }

    /**
     * 获取资源栈集操作的元数据
     *
     * 获取资源栈集操作元数据（ShowStackSetOperationMetadata）
     * 
     * 此API用于获取指定资源栈集操作的元数据，包括资源栈集操作ID、资源栈集ID、资源栈集名称、资源栈集操作状态、创建时间、更新时间、部署目标等信息。
     * 
     * 具体信息见ShowStackSetOperationMetadataResponseBody。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStackSetOperationMetadataRequest 请求对象
     * @return CompletableFuture<ShowStackSetOperationMetadataResponse>
     */
    public CompletableFuture<ShowStackSetOperationMetadataResponse> showStackSetOperationMetadataAsync(
        ShowStackSetOperationMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.showStackSetOperationMetadata);
    }

    /**
     * 获取资源栈集操作的元数据
     *
     * 获取资源栈集操作元数据（ShowStackSetOperationMetadata）
     * 
     * 此API用于获取指定资源栈集操作的元数据，包括资源栈集操作ID、资源栈集ID、资源栈集名称、资源栈集操作状态、创建时间、更新时间、部署目标等信息。
     * 
     * 具体信息见ShowStackSetOperationMetadataResponseBody。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStackSetOperationMetadataRequest 请求对象
     * @return AsyncInvoker<ShowStackSetOperationMetadataRequest, ShowStackSetOperationMetadataResponse>
     */
    public AsyncInvoker<ShowStackSetOperationMetadataRequest, ShowStackSetOperationMetadataResponse> showStackSetOperationMetadataAsyncInvoker(
        ShowStackSetOperationMetadataRequest request) {
        return new AsyncInvoker<>(request, AosMeta.showStackSetOperationMetadata, hcClient);
    }

    /**
     * 获取资源栈集模板
     *
     * 获取资源栈集模板（ShowStackSetTemplate）
     * 
     * 此API用于获取指定资源栈集的模板。
     * 
     * 如果获取成功，则以临时重定向形式返回模板下载链接（OBS Pre Signed地址，有效期为5分钟），大多数的客户端会进行自动重定向并下载模板；
     * 如果未进行自动重定向，请参考HTTP的重定向规则获取模板下载链接，手动下载模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStackSetTemplateRequest 请求对象
     * @return CompletableFuture<ShowStackSetTemplateResponse>
     */
    public CompletableFuture<ShowStackSetTemplateResponse> showStackSetTemplateAsync(
        ShowStackSetTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.showStackSetTemplate);
    }

    /**
     * 获取资源栈集模板
     *
     * 获取资源栈集模板（ShowStackSetTemplate）
     * 
     * 此API用于获取指定资源栈集的模板。
     * 
     * 如果获取成功，则以临时重定向形式返回模板下载链接（OBS Pre Signed地址，有效期为5分钟），大多数的客户端会进行自动重定向并下载模板；
     * 如果未进行自动重定向，请参考HTTP的重定向规则获取模板下载链接，手动下载模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStackSetTemplateRequest 请求对象
     * @return AsyncInvoker<ShowStackSetTemplateRequest, ShowStackSetTemplateResponse>
     */
    public AsyncInvoker<ShowStackSetTemplateRequest, ShowStackSetTemplateResponse> showStackSetTemplateAsyncInvoker(
        ShowStackSetTemplateRequest request) {
        return new AsyncInvoker<>(request, AosMeta.showStackSetTemplate, hcClient);
    }

    /**
     * 更新资源栈实例
     *
     * 更新资源栈实例（UpdateStackInstances）
     * 
     * 此API用于更新并部署指定资源栈实例集合，并返回资源栈集操作ID（stack_set_operation_id）
     * 
     * 此API可以通过var_overrides参数，更新指定资源栈实例的参数值，进行参数覆盖。如果var_overrides参数未给予，则默认使用当前资源栈集中记录的参数进行部署，详见：var_overrides参数描述。用户只可以更新已经存在的资源栈实例，如果用户想要增加额外的资源栈实例，请使用CreateStackInstances API。
     * 
     * 通过DeployStackSet API更新资源栈集参数后，资源栈实例中已经被覆盖的参数不会被更新，仍然保留覆盖值。
     * 
     * 用户只能覆盖已经在资源栈集中记录的参数，如果用户想要增加可以覆盖的参数，需要先通过DeployStackSet API更新资源栈集记录的参数集合。
     * 
     * * 当触发的部署失败时，资源栈实例不会自动回滚参数覆盖，但部署失败的资源栈会默认自动回滚，已经部署成功的资源栈不会触发回滚。
     * 
     * * 用户可以根据资源栈集操作ID（stack_set_operation_id），通过ShowStackSetOperationMetadata API获取资源栈集操作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStackInstancesRequest 请求对象
     * @return CompletableFuture<UpdateStackInstancesResponse>
     */
    public CompletableFuture<UpdateStackInstancesResponse> updateStackInstancesAsync(
        UpdateStackInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.updateStackInstances);
    }

    /**
     * 更新资源栈实例
     *
     * 更新资源栈实例（UpdateStackInstances）
     * 
     * 此API用于更新并部署指定资源栈实例集合，并返回资源栈集操作ID（stack_set_operation_id）
     * 
     * 此API可以通过var_overrides参数，更新指定资源栈实例的参数值，进行参数覆盖。如果var_overrides参数未给予，则默认使用当前资源栈集中记录的参数进行部署，详见：var_overrides参数描述。用户只可以更新已经存在的资源栈实例，如果用户想要增加额外的资源栈实例，请使用CreateStackInstances API。
     * 
     * 通过DeployStackSet API更新资源栈集参数后，资源栈实例中已经被覆盖的参数不会被更新，仍然保留覆盖值。
     * 
     * 用户只能覆盖已经在资源栈集中记录的参数，如果用户想要增加可以覆盖的参数，需要先通过DeployStackSet API更新资源栈集记录的参数集合。
     * 
     * * 当触发的部署失败时，资源栈实例不会自动回滚参数覆盖，但部署失败的资源栈会默认自动回滚，已经部署成功的资源栈不会触发回滚。
     * 
     * * 用户可以根据资源栈集操作ID（stack_set_operation_id），通过ShowStackSetOperationMetadata API获取资源栈集操作状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStackInstancesRequest 请求对象
     * @return AsyncInvoker<UpdateStackInstancesRequest, UpdateStackInstancesResponse>
     */
    public AsyncInvoker<UpdateStackInstancesRequest, UpdateStackInstancesResponse> updateStackInstancesAsyncInvoker(
        UpdateStackInstancesRequest request) {
        return new AsyncInvoker<>(request, AosMeta.updateStackInstances, hcClient);
    }

    /**
     * 更新资源栈集
     *
     * 更新资源栈集（UpdateStackSet）
     * 
     * 该API可以根据用户给予的信息对资源栈集的属性进行更新，可以更新资源栈集的“stack_set_description”、\&quot;initial_stack_description\&quot;、\&quot;permission_model\&quot;、“administration_agency_name”、\&quot;managed_agency_name\&quot;、“administration_agency_urn”六个属性中的一个或多个。
     * 
     * 该API只会更新用户给予的信息中所涉及的字段；如果某字段未给予，则不会对该资源栈集属性进行更新。
     * 
     * 注：
     *   * 所有属性的更新都是覆盖式更新。即，所给予的参数将被完全覆盖至资源栈已有的属性上。
     *   * 只有在permission_model&#x3D;SELF_MANAGED时，才可更新administration_agency_name、managed_agency_name和administration_agency_urn。
     *   * permission_model目前只支持更新SELF_MANAGED
     *   * 如果资源栈集的状态是OPERATION_IN_PROGRESS，不允许更新资源栈集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStackSetRequest 请求对象
     * @return CompletableFuture<UpdateStackSetResponse>
     */
    public CompletableFuture<UpdateStackSetResponse> updateStackSetAsync(UpdateStackSetRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.updateStackSet);
    }

    /**
     * 更新资源栈集
     *
     * 更新资源栈集（UpdateStackSet）
     * 
     * 该API可以根据用户给予的信息对资源栈集的属性进行更新，可以更新资源栈集的“stack_set_description”、\&quot;initial_stack_description\&quot;、\&quot;permission_model\&quot;、“administration_agency_name”、\&quot;managed_agency_name\&quot;、“administration_agency_urn”六个属性中的一个或多个。
     * 
     * 该API只会更新用户给予的信息中所涉及的字段；如果某字段未给予，则不会对该资源栈集属性进行更新。
     * 
     * 注：
     *   * 所有属性的更新都是覆盖式更新。即，所给予的参数将被完全覆盖至资源栈已有的属性上。
     *   * 只有在permission_model&#x3D;SELF_MANAGED时，才可更新administration_agency_name、managed_agency_name和administration_agency_urn。
     *   * permission_model目前只支持更新SELF_MANAGED
     *   * 如果资源栈集的状态是OPERATION_IN_PROGRESS，不允许更新资源栈集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStackSetRequest 请求对象
     * @return AsyncInvoker<UpdateStackSetRequest, UpdateStackSetResponse>
     */
    public AsyncInvoker<UpdateStackSetRequest, UpdateStackSetResponse> updateStackSetAsyncInvoker(
        UpdateStackSetRequest request) {
        return new AsyncInvoker<>(request, AosMeta.updateStackSet, hcClient);
    }

    /**
     * 解析模板参数
     *
     * 解析模板参数（ParseTemplateVariables）
     * 
     * 此API用于解析用户输入的模板中的参数（variable），将解析模板中的所有variable块并返回
     * 
     * * 如果用户传入的模板中定义了variable参数，则返回200和所有variable
     * * 如果用户传入的模板中没有定义variable参数，则返回200和空对象
     * * 如果用户请求非法或传入的模板非法，则返回400
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseTemplateVariablesRequest 请求对象
     * @return CompletableFuture<ParseTemplateVariablesResponse>
     */
    public CompletableFuture<ParseTemplateVariablesResponse> parseTemplateVariablesAsync(
        ParseTemplateVariablesRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.parseTemplateVariables);
    }

    /**
     * 解析模板参数
     *
     * 解析模板参数（ParseTemplateVariables）
     * 
     * 此API用于解析用户输入的模板中的参数（variable），将解析模板中的所有variable块并返回
     * 
     * * 如果用户传入的模板中定义了variable参数，则返回200和所有variable
     * * 如果用户传入的模板中没有定义variable参数，则返回200和空对象
     * * 如果用户请求非法或传入的模板非法，则返回400
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseTemplateVariablesRequest 请求对象
     * @return AsyncInvoker<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse>
     */
    public AsyncInvoker<ParseTemplateVariablesRequest, ParseTemplateVariablesResponse> parseTemplateVariablesAsyncInvoker(
        ParseTemplateVariablesRequest request) {
        return new AsyncInvoker<>(request, AosMeta.parseTemplateVariables, hcClient);
    }

    /**
     * 删除模板
     *
     * 删除模板（DeleteTemplate）
     * 
     * 此API用于删除某个模板以及模板下的全部模板版本
     * **请谨慎操作，删除模板将会删除模板下的所有模板版本。**
     * 
     *   * template_id是模板的唯一Id。此Id由资源编排服务在生成模板的时候生成，为UUID。由于模板名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的模板，删除，再重新创建一个同名模板。对于团队并行开发，用户可能希望确保，当前我操作的模板就是我认为的那个，而不是其他队友删除后创建的同名模板。因此，使用ID就可以做到强匹配。资源编排服务保证每次创建的模板所对应的ID都不相同，更新不会影响ID。如果给予的template_id和当前模板管理的ID不一致，则返回400
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTemplateResponse>
     */
    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deleteTemplate);
    }

    /**
     * 删除模板
     *
     * 删除模板（DeleteTemplate）
     * 
     * 此API用于删除某个模板以及模板下的全部模板版本
     * **请谨慎操作，删除模板将会删除模板下的所有模板版本。**
     * 
     *   * template_id是模板的唯一Id。此Id由资源编排服务在生成模板的时候生成，为UUID。由于模板名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的模板，删除，再重新创建一个同名模板。对于团队并行开发，用户可能希望确保，当前我操作的模板就是我认为的那个，而不是其他队友删除后创建的同名模板。因此，使用ID就可以做到强匹配。资源编排服务保证每次创建的模板所对应的ID都不相同，更新不会影响ID。如果给予的template_id和当前模板管理的ID不一致，则返回400
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateAsyncInvoker(
        DeleteTemplateRequest request) {
        return new AsyncInvoker<>(request, AosMeta.deleteTemplate, hcClient);
    }

    /**
     * 删除模板版本
     *
     * 删除模板版本（DeleteTemplateVersion）
     * 
     * 此API用于删除某个模板版本
     * 
     *   * template_id是模板的唯一Id。此Id由资源编排服务在生成模板的时候生成，为UUID。由于模板名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的模板，删除，再重新创建一个同名模板。对于团队并行开发，用户可能希望确保，当前我操作的模板就是我认为的那个，而不是其他队友删除后创建的同名模板。因此，使用ID就可以做到强匹配。资源编排服务保证每次创建的模板所对应的ID都不相同，更新不会影响ID。如果给予的template_id和当前模板管理的ID不一致，则返回400
     *   * 如果模板下只存在唯一模板版本，此模板版本将无法被删除，如果需要删除此模板版本，请调用DeleteTemplate。模板服务不允许存在没有模板版本的模板
     * 
     * **请谨慎操作**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateVersionRequest 请求对象
     * @return CompletableFuture<DeleteTemplateVersionResponse>
     */
    public CompletableFuture<DeleteTemplateVersionResponse> deleteTemplateVersionAsync(
        DeleteTemplateVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.deleteTemplateVersion);
    }

    /**
     * 删除模板版本
     *
     * 删除模板版本（DeleteTemplateVersion）
     * 
     * 此API用于删除某个模板版本
     * 
     *   * template_id是模板的唯一Id。此Id由资源编排服务在生成模板的时候生成，为UUID。由于模板名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的模板，删除，再重新创建一个同名模板。对于团队并行开发，用户可能希望确保，当前我操作的模板就是我认为的那个，而不是其他队友删除后创建的同名模板。因此，使用ID就可以做到强匹配。资源编排服务保证每次创建的模板所对应的ID都不相同，更新不会影响ID。如果给予的template_id和当前模板管理的ID不一致，则返回400
     *   * 如果模板下只存在唯一模板版本，此模板版本将无法被删除，如果需要删除此模板版本，请调用DeleteTemplate。模板服务不允许存在没有模板版本的模板
     * 
     * **请谨慎操作**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTemplateVersionRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateVersionRequest, DeleteTemplateVersionResponse>
     */
    public AsyncInvoker<DeleteTemplateVersionRequest, DeleteTemplateVersionResponse> deleteTemplateVersionAsyncInvoker(
        DeleteTemplateVersionRequest request) {
        return new AsyncInvoker<>(request, AosMeta.deleteTemplateVersion, hcClient);
    }

    /**
     * 列举模板版本
     *
     * 列举模板版本信息（ListTemplateVersions）
     * 
     * 此API用于列举模板下所有的模板版本信息
     * 
     *   * 默认按照生成时间降序排序，最新生成的模板排列在最前面
     *   * 注意：目前返回全量模板版本信息，即不支持分页
     *   * 如果没有任何模板版本，则返回空list
     *   * template_id是模板的唯一Id。此Id由资源编排服务在生成模板的时候生成，为UUID。由于模板名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的模板，删除，再重新创建一个同名模板。对于团队并行开发，用户可能希望确保，当前我操作的模板就是我认为的那个，而不是其他队友删除后创建的同名模板。因此，使用ID就可以做到强匹配。资源编排服务保证每次创建的模板所对应的ID都不相同，更新不会影响ID。如果给予的template_id和当前模板管理的ID不一致，则返回400
     *   * 如果模板不存在则返回404
     * 
     * ListTemplateVersions返回的信息只包含模板版本摘要信息（具体摘要信息见ListTemplateVersionsResponseBody），如果用户需要了解模板版本内容，请调用ShowTemplateVersionContent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateVersionsRequest 请求对象
     * @return CompletableFuture<ListTemplateVersionsResponse>
     */
    public CompletableFuture<ListTemplateVersionsResponse> listTemplateVersionsAsync(
        ListTemplateVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listTemplateVersions);
    }

    /**
     * 列举模板版本
     *
     * 列举模板版本信息（ListTemplateVersions）
     * 
     * 此API用于列举模板下所有的模板版本信息
     * 
     *   * 默认按照生成时间降序排序，最新生成的模板排列在最前面
     *   * 注意：目前返回全量模板版本信息，即不支持分页
     *   * 如果没有任何模板版本，则返回空list
     *   * template_id是模板的唯一Id。此Id由资源编排服务在生成模板的时候生成，为UUID。由于模板名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的模板，删除，再重新创建一个同名模板。对于团队并行开发，用户可能希望确保，当前我操作的模板就是我认为的那个，而不是其他队友删除后创建的同名模板。因此，使用ID就可以做到强匹配。资源编排服务保证每次创建的模板所对应的ID都不相同，更新不会影响ID。如果给予的template_id和当前模板管理的ID不一致，则返回400
     *   * 如果模板不存在则返回404
     * 
     * ListTemplateVersions返回的信息只包含模板版本摘要信息（具体摘要信息见ListTemplateVersionsResponseBody），如果用户需要了解模板版本内容，请调用ShowTemplateVersionContent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateVersionsRequest 请求对象
     * @return AsyncInvoker<ListTemplateVersionsRequest, ListTemplateVersionsResponse>
     */
    public AsyncInvoker<ListTemplateVersionsRequest, ListTemplateVersionsResponse> listTemplateVersionsAsyncInvoker(
        ListTemplateVersionsRequest request) {
        return new AsyncInvoker<>(request, AosMeta.listTemplateVersions, hcClient);
    }

    /**
     * 列举模板
     *
     * 列举模板（ListTemplates）
     * 
     * 此API用于列举当前局点下用户所有的模板
     * 
     *   * 默认按照生成时间降序排序，最新生成的模板排列在最前面
     *   * 注意：目前返回全量模板信息，即不支持分页
     *   * 如果没有任何模板，则返回空list
     *   * 如果用户需要详细的模板版本信息，请调用ListTemplateVersions
     * 
     * ListTemplates返回的信息只包含模板摘要信息（具体摘要信息见ListTemplatesResponseBody），如果用户需要详细的某个模板信息，请调用ShowTemplateMetadata
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return CompletableFuture<ListTemplatesResponse>
     */
    public CompletableFuture<ListTemplatesResponse> listTemplatesAsync(ListTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.listTemplates);
    }

    /**
     * 列举模板
     *
     * 列举模板（ListTemplates）
     * 
     * 此API用于列举当前局点下用户所有的模板
     * 
     *   * 默认按照生成时间降序排序，最新生成的模板排列在最前面
     *   * 注意：目前返回全量模板信息，即不支持分页
     *   * 如果没有任何模板，则返回空list
     *   * 如果用户需要详细的模板版本信息，请调用ListTemplateVersions
     * 
     * ListTemplates返回的信息只包含模板摘要信息（具体摘要信息见ListTemplatesResponseBody），如果用户需要详细的某个模板信息，请调用ShowTemplateMetadata
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplatesRequest 请求对象
     * @return AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse>
     */
    public AsyncInvoker<ListTemplatesRequest, ListTemplatesResponse> listTemplatesAsyncInvoker(
        ListTemplatesRequest request) {
        return new AsyncInvoker<>(request, AosMeta.listTemplates, hcClient);
    }

    /**
     * 获取模板元数据
     *
     * 获取模板元数据（ShowTemplateMetadata）
     * 
     * 此API用于获取当前模板的元数据信息
     * 
     * 具体信息见ShowTemplateMetadataResponseBody，如果想查看模板下全部模板版本，请调用ListTemplateVersions。
     * 
     *   * template_id是模板的唯一Id。此Id由资源编排服务在生成模板的时候生成，为UUID。由于模板名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的模板，删除，再重新创建一个同名模板。对于团队并行开发，用户可能希望确保，当前我操作的模板就是我认为的那个，而不是其他队友删除后创建的同名模板。因此，使用ID就可以做到强匹配。资源编排服务保证每次创建的模板所对应的ID都不相同，更新不会影响ID。如果给予的template_id和当前模板管理的ID不一致，则返回400
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateMetadataRequest 请求对象
     * @return CompletableFuture<ShowTemplateMetadataResponse>
     */
    public CompletableFuture<ShowTemplateMetadataResponse> showTemplateMetadataAsync(
        ShowTemplateMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.showTemplateMetadata);
    }

    /**
     * 获取模板元数据
     *
     * 获取模板元数据（ShowTemplateMetadata）
     * 
     * 此API用于获取当前模板的元数据信息
     * 
     * 具体信息见ShowTemplateMetadataResponseBody，如果想查看模板下全部模板版本，请调用ListTemplateVersions。
     * 
     *   * template_id是模板的唯一Id。此Id由资源编排服务在生成模板的时候生成，为UUID。由于模板名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的模板，删除，再重新创建一个同名模板。对于团队并行开发，用户可能希望确保，当前我操作的模板就是我认为的那个，而不是其他队友删除后创建的同名模板。因此，使用ID就可以做到强匹配。资源编排服务保证每次创建的模板所对应的ID都不相同，更新不会影响ID。如果给予的template_id和当前模板管理的ID不一致，则返回400
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateMetadataRequest 请求对象
     * @return AsyncInvoker<ShowTemplateMetadataRequest, ShowTemplateMetadataResponse>
     */
    public AsyncInvoker<ShowTemplateMetadataRequest, ShowTemplateMetadataResponse> showTemplateMetadataAsyncInvoker(
        ShowTemplateMetadataRequest request) {
        return new AsyncInvoker<>(request, AosMeta.showTemplateMetadata, hcClient);
    }

    /**
     * 获取模板版本内容
     *
     * 获取模板版本内容（ShowTemplateVersionContent）
     * 
     * 此API用于获取用户的模板版本内容
     * 
     *   * template_id是模板的唯一Id。此Id由资源编排服务在生成模板的时候生成，为UUID。由于模板名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的模板，删除，再重新创建一个同名模板。对于团队并行开发，用户可能希望确保，当前我操作的模板就是我认为的那个，而不是其他队友删除后创建的同名模板。因此，使用ID就可以做到强匹配。资源编排服务保证每次创建的模板所对应的ID都不相同，更新不会影响ID。如果给予的template_id和当前模板管理的ID不一致，则返回400
     *   * 此api会以临时重定向形式返回模板内容的下载链接，用户通过下载获取模板版本内容（OBS Pre Signed地址，有效期为5分钟）
     *   * 如果手动访问重定向的obs下载链接，请求时不可以携带任何的Request-Header，否则会导致签名失败
     * 
     * ShowTemplateVersionContent返回的信息只包含模板版本内容，如果想知道模板版本的元数据，请调用ShowTemplateVersionMetadata
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateVersionContentRequest 请求对象
     * @return CompletableFuture<ShowTemplateVersionContentResponse>
     */
    public CompletableFuture<ShowTemplateVersionContentResponse> showTemplateVersionContentAsync(
        ShowTemplateVersionContentRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.showTemplateVersionContent);
    }

    /**
     * 获取模板版本内容
     *
     * 获取模板版本内容（ShowTemplateVersionContent）
     * 
     * 此API用于获取用户的模板版本内容
     * 
     *   * template_id是模板的唯一Id。此Id由资源编排服务在生成模板的时候生成，为UUID。由于模板名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的模板，删除，再重新创建一个同名模板。对于团队并行开发，用户可能希望确保，当前我操作的模板就是我认为的那个，而不是其他队友删除后创建的同名模板。因此，使用ID就可以做到强匹配。资源编排服务保证每次创建的模板所对应的ID都不相同，更新不会影响ID。如果给予的template_id和当前模板管理的ID不一致，则返回400
     *   * 此api会以临时重定向形式返回模板内容的下载链接，用户通过下载获取模板版本内容（OBS Pre Signed地址，有效期为5分钟）
     *   * 如果手动访问重定向的obs下载链接，请求时不可以携带任何的Request-Header，否则会导致签名失败
     * 
     * ShowTemplateVersionContent返回的信息只包含模板版本内容，如果想知道模板版本的元数据，请调用ShowTemplateVersionMetadata
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateVersionContentRequest 请求对象
     * @return AsyncInvoker<ShowTemplateVersionContentRequest, ShowTemplateVersionContentResponse>
     */
    public AsyncInvoker<ShowTemplateVersionContentRequest, ShowTemplateVersionContentResponse> showTemplateVersionContentAsyncInvoker(
        ShowTemplateVersionContentRequest request) {
        return new AsyncInvoker<>(request, AosMeta.showTemplateVersionContent, hcClient);
    }

    /**
     * 获取模板版本元数据
     *
     * 获取模板版本元数据（ShowTemplateVersionMetadata）
     * 
     * 此API用于展示某一版本模板的元数据
     * 
     *   * template_id是模板的唯一Id。此Id由资源编排服务在生成模板的时候生成，为UUID。由于模板名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的模板，删除，再重新创建一个同名模板。对于团队并行开发，用户可能希望确保，当前我操作的模板就是我认为的那个，而不是其他队友删除后创建的同名模板。因此，使用ID就可以做到强匹配。资源编排服务保证每次创建的模板所对应的ID都不相同，更新不会影响ID。如果给予的template_id和当前模板管理的ID不一致，则返回400
     * 
     * ShowTemplateVersionMetadata返回的信息只包含模板版本元数据信息（具体摘要信息见ShowTemplateVersionMetadataResponseBody），如果用户需要了解模板版本内容，请调用ShowTemplateVersionContent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateVersionMetadataRequest 请求对象
     * @return CompletableFuture<ShowTemplateVersionMetadataResponse>
     */
    public CompletableFuture<ShowTemplateVersionMetadataResponse> showTemplateVersionMetadataAsync(
        ShowTemplateVersionMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.showTemplateVersionMetadata);
    }

    /**
     * 获取模板版本元数据
     *
     * 获取模板版本元数据（ShowTemplateVersionMetadata）
     * 
     * 此API用于展示某一版本模板的元数据
     * 
     *   * template_id是模板的唯一Id。此Id由资源编排服务在生成模板的时候生成，为UUID。由于模板名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的模板，删除，再重新创建一个同名模板。对于团队并行开发，用户可能希望确保，当前我操作的模板就是我认为的那个，而不是其他队友删除后创建的同名模板。因此，使用ID就可以做到强匹配。资源编排服务保证每次创建的模板所对应的ID都不相同，更新不会影响ID。如果给予的template_id和当前模板管理的ID不一致，则返回400
     * 
     * ShowTemplateVersionMetadata返回的信息只包含模板版本元数据信息（具体摘要信息见ShowTemplateVersionMetadataResponseBody），如果用户需要了解模板版本内容，请调用ShowTemplateVersionContent
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTemplateVersionMetadataRequest 请求对象
     * @return AsyncInvoker<ShowTemplateVersionMetadataRequest, ShowTemplateVersionMetadataResponse>
     */
    public AsyncInvoker<ShowTemplateVersionMetadataRequest, ShowTemplateVersionMetadataResponse> showTemplateVersionMetadataAsyncInvoker(
        ShowTemplateVersionMetadataRequest request) {
        return new AsyncInvoker<>(request, AosMeta.showTemplateVersionMetadata, hcClient);
    }

    /**
     * 更新模板元数据
     *
     * 更新模板元数据（UpdateTemplateMetadata）
     * 
     * 此API用于更新模板元数据
     * 
     * * 此api只支持更新模板描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateMetadataRequest 请求对象
     * @return CompletableFuture<UpdateTemplateMetadataResponse>
     */
    public CompletableFuture<UpdateTemplateMetadataResponse> updateTemplateMetadataAsync(
        UpdateTemplateMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, AosMeta.updateTemplateMetadata);
    }

    /**
     * 更新模板元数据
     *
     * 更新模板元数据（UpdateTemplateMetadata）
     * 
     * 此API用于更新模板元数据
     * 
     * * 此api只支持更新模板描述
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTemplateMetadataRequest 请求对象
     * @return AsyncInvoker<UpdateTemplateMetadataRequest, UpdateTemplateMetadataResponse>
     */
    public AsyncInvoker<UpdateTemplateMetadataRequest, UpdateTemplateMetadataResponse> updateTemplateMetadataAsyncInvoker(
        UpdateTemplateMetadataRequest request) {
        return new AsyncInvoker<>(request, AosMeta.updateTemplateMetadata, hcClient);
    }

}
