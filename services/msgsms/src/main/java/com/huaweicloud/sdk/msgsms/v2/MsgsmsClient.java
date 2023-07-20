package com.huaweicloud.sdk.msgsms.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.msgsms.v2.model.CreateAppRequest;
import com.huaweicloud.sdk.msgsms.v2.model.CreateAppResponse;
import com.huaweicloud.sdk.msgsms.v2.model.CreateSignatureRequest;
import com.huaweicloud.sdk.msgsms.v2.model.CreateSignatureResponse;
import com.huaweicloud.sdk.msgsms.v2.model.CreateTemplateRequest;
import com.huaweicloud.sdk.msgsms.v2.model.CreateTemplateResponse;
import com.huaweicloud.sdk.msgsms.v2.model.DeleteSignatureRequest;
import com.huaweicloud.sdk.msgsms.v2.model.DeleteSignatureResponse;
import com.huaweicloud.sdk.msgsms.v2.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.msgsms.v2.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.msgsms.v2.model.EnableSignatureRequest;
import com.huaweicloud.sdk.msgsms.v2.model.EnableSignatureResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ListAppDetailsRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ListAppDetailsResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ListSendCountryDetailsRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ListSendCountryDetailsResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ListSignatureDetailsRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ListSignatureDetailsResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ListTemplateDetailsRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ListTemplateDetailsResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ListTemplateVarilableDetailsRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ListTemplateVarilableDetailsResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ShowAppCountRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ShowAppCountResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ShowAppRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ShowAppResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ShowSignatureFileRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ShowSignatureFileResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ShowSignatureRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ShowSignatureResponse;
import com.huaweicloud.sdk.msgsms.v2.model.ShowTemplateRequest;
import com.huaweicloud.sdk.msgsms.v2.model.ShowTemplateResponse;
import com.huaweicloud.sdk.msgsms.v2.model.UpdateAppRequest;
import com.huaweicloud.sdk.msgsms.v2.model.UpdateAppResponse;
import com.huaweicloud.sdk.msgsms.v2.model.UpdateSignatureRequest;
import com.huaweicloud.sdk.msgsms.v2.model.UpdateSignatureResponse;
import com.huaweicloud.sdk.msgsms.v2.model.UpdateTemplateRequest;
import com.huaweicloud.sdk.msgsms.v2.model.UpdateTemplateResponse;
import com.huaweicloud.sdk.msgsms.v2.model.UploadSignatureFileRequest;
import com.huaweicloud.sdk.msgsms.v2.model.UploadSignatureFileResponse;

public class MsgsmsClient {

    protected HcClient hcClient;

    public MsgsmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MsgsmsClient> newBuilder() {
        ClientBuilder<MsgsmsClient> clientBuilder = new ClientBuilder<>(MsgsmsClient::new);
        return clientBuilder;
    }

    /**
     * 创建短信应用
     *
     * 该接口用于用户创建应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.createApp);
    }

    /**
     * 创建短信应用
     *
     * 该接口用于用户创建应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return SyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public SyncInvoker<CreateAppRequest, CreateAppResponse> createAppInvoker(CreateAppRequest request) {
        return new SyncInvoker<CreateAppRequest, CreateAppResponse>(request, MsgsmsMeta.createApp, hcClient);
    }

    /**
     * 查询短信应用
     *
     * 该接口用于用户查询已创建的应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppDetailsRequest 请求对象
     * @return ListAppDetailsResponse
     */
    public ListAppDetailsResponse listAppDetails(ListAppDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.listAppDetails);
    }

    /**
     * 查询短信应用
     *
     * 该接口用于用户查询已创建的应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppDetailsRequest 请求对象
     * @return SyncInvoker<ListAppDetailsRequest, ListAppDetailsResponse>
     */
    public SyncInvoker<ListAppDetailsRequest, ListAppDetailsResponse> listAppDetailsInvoker(
        ListAppDetailsRequest request) {
        return new SyncInvoker<ListAppDetailsRequest, ListAppDetailsResponse>(request, MsgsmsMeta.listAppDetails,
            hcClient);
    }

    /**
     * 获取应用详情
     *
     * 该接口用于用户查询应用详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return ShowAppResponse
     */
    public ShowAppResponse showApp(ShowAppRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.showApp);
    }

    /**
     * 获取应用详情
     *
     * 该接口用于用户查询应用详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return SyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public SyncInvoker<ShowAppRequest, ShowAppResponse> showAppInvoker(ShowAppRequest request) {
        return new SyncInvoker<ShowAppRequest, ShowAppResponse>(request, MsgsmsMeta.showApp, hcClient);
    }

    /**
     * 查询应用数量
     *
     * 该接口用于用户查询应用使用的数量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppCountRequest 请求对象
     * @return ShowAppCountResponse
     */
    public ShowAppCountResponse showAppCount(ShowAppCountRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.showAppCount);
    }

    /**
     * 查询应用数量
     *
     * 该接口用于用户查询应用使用的数量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppCountRequest 请求对象
     * @return SyncInvoker<ShowAppCountRequest, ShowAppCountResponse>
     */
    public SyncInvoker<ShowAppCountRequest, ShowAppCountResponse> showAppCountInvoker(ShowAppCountRequest request) {
        return new SyncInvoker<ShowAppCountRequest, ShowAppCountResponse>(request, MsgsmsMeta.showAppCount, hcClient);
    }

    /**
     * 修改短信应用
     *
     * 该接口用于用户修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return UpdateAppResponse
     */
    public UpdateAppResponse updateApp(UpdateAppRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.updateApp);
    }

    /**
     * 修改短信应用
     *
     * 该接口用于用户修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return SyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public SyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppInvoker(UpdateAppRequest request) {
        return new SyncInvoker<UpdateAppRequest, UpdateAppResponse>(request, MsgsmsMeta.updateApp, hcClient);
    }

    /**
     * 创建短信签名
     *
     * 该接口用于用户创建签名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSignatureRequest 请求对象
     * @return CreateSignatureResponse
     */
    public CreateSignatureResponse createSignature(CreateSignatureRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.createSignature);
    }

    /**
     * 创建短信签名
     *
     * 该接口用于用户创建签名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSignatureRequest 请求对象
     * @return SyncInvoker<CreateSignatureRequest, CreateSignatureResponse>
     */
    public SyncInvoker<CreateSignatureRequest, CreateSignatureResponse> createSignatureInvoker(
        CreateSignatureRequest request) {
        return new SyncInvoker<CreateSignatureRequest, CreateSignatureResponse>(request, MsgsmsMeta.createSignature,
            hcClient);
    }

    /**
     * 删除短信签名
     *
     * 该接口用于用户删除已创建的签名信息息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSignatureRequest 请求对象
     * @return DeleteSignatureResponse
     */
    public DeleteSignatureResponse deleteSignature(DeleteSignatureRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.deleteSignature);
    }

    /**
     * 删除短信签名
     *
     * 该接口用于用户删除已创建的签名信息息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSignatureRequest 请求对象
     * @return SyncInvoker<DeleteSignatureRequest, DeleteSignatureResponse>
     */
    public SyncInvoker<DeleteSignatureRequest, DeleteSignatureResponse> deleteSignatureInvoker(
        DeleteSignatureRequest request) {
        return new SyncInvoker<DeleteSignatureRequest, DeleteSignatureResponse>(request, MsgsmsMeta.deleteSignature,
            hcClient);
    }

    /**
     * 申请激活签名
     *
     * 该接口用于用户申请激活签名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableSignatureRequest 请求对象
     * @return EnableSignatureResponse
     */
    public EnableSignatureResponse enableSignature(EnableSignatureRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.enableSignature);
    }

    /**
     * 申请激活签名
     *
     * 该接口用于用户申请激活签名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableSignatureRequest 请求对象
     * @return SyncInvoker<EnableSignatureRequest, EnableSignatureResponse>
     */
    public SyncInvoker<EnableSignatureRequest, EnableSignatureResponse> enableSignatureInvoker(
        EnableSignatureRequest request) {
        return new SyncInvoker<EnableSignatureRequest, EnableSignatureResponse>(request, MsgsmsMeta.enableSignature,
            hcClient);
    }

    /**
     * 查询签名信息
     *
     * 该接口用于用户查询已创建的短信签名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSignatureDetailsRequest 请求对象
     * @return ListSignatureDetailsResponse
     */
    public ListSignatureDetailsResponse listSignatureDetails(ListSignatureDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.listSignatureDetails);
    }

    /**
     * 查询签名信息
     *
     * 该接口用于用户查询已创建的短信签名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSignatureDetailsRequest 请求对象
     * @return SyncInvoker<ListSignatureDetailsRequest, ListSignatureDetailsResponse>
     */
    public SyncInvoker<ListSignatureDetailsRequest, ListSignatureDetailsResponse> listSignatureDetailsInvoker(
        ListSignatureDetailsRequest request) {
        return new SyncInvoker<ListSignatureDetailsRequest, ListSignatureDetailsResponse>(request,
            MsgsmsMeta.listSignatureDetails, hcClient);
    }

    /**
     * 获取签名详情
     *
     * 该接口用于用户查询签名详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSignatureRequest 请求对象
     * @return ShowSignatureResponse
     */
    public ShowSignatureResponse showSignature(ShowSignatureRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.showSignature);
    }

    /**
     * 获取签名详情
     *
     * 该接口用于用户查询签名详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSignatureRequest 请求对象
     * @return SyncInvoker<ShowSignatureRequest, ShowSignatureResponse>
     */
    public SyncInvoker<ShowSignatureRequest, ShowSignatureResponse> showSignatureInvoker(ShowSignatureRequest request) {
        return new SyncInvoker<ShowSignatureRequest, ShowSignatureResponse>(request, MsgsmsMeta.showSignature,
            hcClient);
    }

    /**
     * 查询申请文件
     *
     * 该接口用于用户查询上传的文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSignatureFileRequest 请求对象
     * @return ShowSignatureFileResponse
     */
    public ShowSignatureFileResponse showSignatureFile(ShowSignatureFileRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.showSignatureFile);
    }

    /**
     * 查询申请文件
     *
     * 该接口用于用户查询上传的文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSignatureFileRequest 请求对象
     * @return SyncInvoker<ShowSignatureFileRequest, ShowSignatureFileResponse>
     */
    public SyncInvoker<ShowSignatureFileRequest, ShowSignatureFileResponse> showSignatureFileInvoker(
        ShowSignatureFileRequest request) {
        return new SyncInvoker<ShowSignatureFileRequest, ShowSignatureFileResponse>(request,
            MsgsmsMeta.showSignatureFile, hcClient);
    }

    /**
     * 修改短信签名
     *
     * 该接口用于用户更新签名信息，目前仅支持审核不通过的短信签名重新修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSignatureRequest 请求对象
     * @return UpdateSignatureResponse
     */
    public UpdateSignatureResponse updateSignature(UpdateSignatureRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.updateSignature);
    }

    /**
     * 修改短信签名
     *
     * 该接口用于用户更新签名信息，目前仅支持审核不通过的短信签名重新修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSignatureRequest 请求对象
     * @return SyncInvoker<UpdateSignatureRequest, UpdateSignatureResponse>
     */
    public SyncInvoker<UpdateSignatureRequest, UpdateSignatureResponse> updateSignatureInvoker(
        UpdateSignatureRequest request) {
        return new SyncInvoker<UpdateSignatureRequest, UpdateSignatureResponse>(request, MsgsmsMeta.updateSignature,
            hcClient);
    }

    /**
     * 上传申请文件
     *
     * 该接口用于用户上传文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadSignatureFileRequest 请求对象
     * @return UploadSignatureFileResponse
     */
    public UploadSignatureFileResponse uploadSignatureFile(UploadSignatureFileRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.uploadSignatureFile);
    }

    /**
     * 上传申请文件
     *
     * 该接口用于用户上传文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadSignatureFileRequest 请求对象
     * @return SyncInvoker<UploadSignatureFileRequest, UploadSignatureFileResponse>
     */
    public SyncInvoker<UploadSignatureFileRequest, UploadSignatureFileResponse> uploadSignatureFileInvoker(
        UploadSignatureFileRequest request) {
        return new SyncInvoker<UploadSignatureFileRequest, UploadSignatureFileResponse>(request,
            MsgsmsMeta.uploadSignatureFile, hcClient);
    }

    /**
     * 创建短信模板
     *
     * 该接口用于用户创建模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateRequest 请求对象
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.createTemplate);
    }

    /**
     * 创建短信模板
     *
     * 该接口用于用户创建模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateRequest 请求对象
     * @return SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public SyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateInvoker(
        CreateTemplateRequest request) {
        return new SyncInvoker<CreateTemplateRequest, CreateTemplateResponse>(request, MsgsmsMeta.createTemplate,
            hcClient);
    }

    /**
     * 删除短信模板
     *
     * 该接口用于用户删除已创建的模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.deleteTemplate);
    }

    /**
     * 删除短信模板
     *
     * 该接口用于用户删除已创建的模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateInvoker(
        DeleteTemplateRequest request) {
        return new SyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, MsgsmsMeta.deleteTemplate,
            hcClient);
    }

    /**
     * 查询发送国家
     *
     * 该接口用于用户查询短信发送的国家信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSendCountryDetailsRequest 请求对象
     * @return ListSendCountryDetailsResponse
     */
    public ListSendCountryDetailsResponse listSendCountryDetails(ListSendCountryDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.listSendCountryDetails);
    }

    /**
     * 查询发送国家
     *
     * 该接口用于用户查询短信发送的国家信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSendCountryDetailsRequest 请求对象
     * @return SyncInvoker<ListSendCountryDetailsRequest, ListSendCountryDetailsResponse>
     */
    public SyncInvoker<ListSendCountryDetailsRequest, ListSendCountryDetailsResponse> listSendCountryDetailsInvoker(
        ListSendCountryDetailsRequest request) {
        return new SyncInvoker<ListSendCountryDetailsRequest, ListSendCountryDetailsResponse>(request,
            MsgsmsMeta.listSendCountryDetails, hcClient);
    }

    /**
     * 查询短信模板
     *
     * 该接口用于用户查询已创建的模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateDetailsRequest 请求对象
     * @return ListTemplateDetailsResponse
     */
    public ListTemplateDetailsResponse listTemplateDetails(ListTemplateDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.listTemplateDetails);
    }

    /**
     * 查询短信模板
     *
     * 该接口用于用户查询已创建的模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateDetailsRequest 请求对象
     * @return SyncInvoker<ListTemplateDetailsRequest, ListTemplateDetailsResponse>
     */
    public SyncInvoker<ListTemplateDetailsRequest, ListTemplateDetailsResponse> listTemplateDetailsInvoker(
        ListTemplateDetailsRequest request) {
        return new SyncInvoker<ListTemplateDetailsRequest, ListTemplateDetailsResponse>(request,
            MsgsmsMeta.listTemplateDetails, hcClient);
    }

    /**
     * 查询模板变量
     *
     * 该接口用于用户查询模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateVarilableDetailsRequest 请求对象
     * @return ListTemplateVarilableDetailsResponse
     */
    public ListTemplateVarilableDetailsResponse listTemplateVarilableDetails(
        ListTemplateVarilableDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.listTemplateVarilableDetails);
    }

    /**
     * 查询模板变量
     *
     * 该接口用于用户查询模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateVarilableDetailsRequest 请求对象
     * @return SyncInvoker<ListTemplateVarilableDetailsRequest, ListTemplateVarilableDetailsResponse>
     */
    public SyncInvoker<ListTemplateVarilableDetailsRequest, ListTemplateVarilableDetailsResponse> listTemplateVarilableDetailsInvoker(
        ListTemplateVarilableDetailsRequest request) {
        return new SyncInvoker<ListTemplateVarilableDetailsRequest, ListTemplateVarilableDetailsResponse>(request,
            MsgsmsMeta.listTemplateVarilableDetails, hcClient);
    }

    /**
     * 获取模板详情
     *
     * 该接口用于用户查询已创建的模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateRequest 请求对象
     * @return ShowTemplateResponse
     */
    public ShowTemplateResponse showTemplate(ShowTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.showTemplate);
    }

    /**
     * 获取模板详情
     *
     * 该接口用于用户查询已创建的模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateRequest 请求对象
     * @return SyncInvoker<ShowTemplateRequest, ShowTemplateResponse>
     */
    public SyncInvoker<ShowTemplateRequest, ShowTemplateResponse> showTemplateInvoker(ShowTemplateRequest request) {
        return new SyncInvoker<ShowTemplateRequest, ShowTemplateResponse>(request, MsgsmsMeta.showTemplate, hcClient);
    }

    /**
     * 修改短信模板
     *
     * 该接口用于用户修改模板信息，目前仅支持审核不通过的短信模板重新修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateRequest 请求对象
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, MsgsmsMeta.updateTemplate);
    }

    /**
     * 修改短信模板
     *
     * 该接口用于用户修改模板信息，目前仅支持审核不通过的短信模板重新修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateRequest 请求对象
     * @return SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>
     */
    public SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplateInvoker(
        UpdateTemplateRequest request) {
        return new SyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>(request, MsgsmsMeta.updateTemplate,
            hcClient);
    }

}
