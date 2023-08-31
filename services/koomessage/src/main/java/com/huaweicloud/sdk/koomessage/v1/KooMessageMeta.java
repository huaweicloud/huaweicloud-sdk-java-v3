package com.huaweicloud.sdk.koomessage.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.koomessage.v1.model.AddAimMsgSignatureRequest;
import com.huaweicloud.sdk.koomessage.v1.model.AddAimMsgSignatureResponse;
import com.huaweicloud.sdk.koomessage.v1.model.AddCallBackRequest;
import com.huaweicloud.sdk.koomessage.v1.model.AddCallBackResponse;
import com.huaweicloud.sdk.koomessage.v1.model.AddCallbackRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.AddVmsCallBackRequest;
import com.huaweicloud.sdk.koomessage.v1.model.AddVmsCallBackRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.AddVmsCallBackResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CheckMobileCapabilityRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CheckMobileCapabilityRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.CheckMobileCapabilityResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimMsgTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimMsgTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimPersonalTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimPersonalTemplateRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimPersonalTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimSendTaskRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimSendTaskRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.CreateAimSendTaskResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreatePubInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreatePubInfoRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.CreatePubInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateResolveTaskRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateResolveTaskRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.CreateResolveTaskResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateSmsAppRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateSmsAppResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateVmsSendTaskRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateVmsSendTaskRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.CreateVmsSendTaskResponse;
import com.huaweicloud.sdk.koomessage.v1.model.CreateVmsTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.CreateVmsTemplateRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.CreateVmsTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteAimMsgSignatureRequest;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteAimMsgSignatureResponse;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteAimMsgTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteAimMsgTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteAimPersonalTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteAimPersonalTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.DeletePortInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.DeletePortInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteTemplateMaterialRequest;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteTemplateMaterialRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.DeleteTemplateMaterialResponse;
import com.huaweicloud.sdk.koomessage.v1.model.FreezePubRequest;
import com.huaweicloud.sdk.koomessage.v1.model.FreezePubRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.FreezePubResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimCallbacksRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimCallbacksResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgAppDetailRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgAppDetailResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgAppRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgAppResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgSignatureDetailRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgSignatureDetailResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgSignatureRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgSignatureResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimMsgTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimResolveDetailsRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimResolveDetailsResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendDetailsRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendDetailsResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendReportsRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendReportsRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendReportsResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendTasksRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimSendTasksResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplateMaterialsRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplateMaterialsResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplateReportsRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplateReportsRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplateReportsResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplatesRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListAimTemplatesResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListMenusRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListMenusResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListPortInfosRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListPortInfosResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListPortalInfosRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListPortalInfosResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListPubInfosRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListPubInfosResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListResolveTasksRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListResolveTasksResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListVmsCallbacksRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListVmsCallbacksResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListVmsSendTasksRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListVmsSendTasksResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ListVmsTemplateStatusRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ListVmsTemplateStatusResponse;
import com.huaweicloud.sdk.koomessage.v1.model.LockPortRequest;
import com.huaweicloud.sdk.koomessage.v1.model.LockPortRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.LockPortResponse;
import com.huaweicloud.sdk.koomessage.v1.model.MsgAppRequest;
import com.huaweicloud.sdk.koomessage.v1.model.MsgTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.PushMenuInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.PushMenuInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.PushPortalInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.PushPortalInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.RegisterPortRequest;
import com.huaweicloud.sdk.koomessage.v1.model.RegisterPortRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.RegisterPortResponse;
import com.huaweicloud.sdk.koomessage.v1.model.SendAimBatchDifferentMessagesRequest;
import com.huaweicloud.sdk.koomessage.v1.model.SendAimBatchDifferentMessagesResponse;
import com.huaweicloud.sdk.koomessage.v1.model.SendAimBatchMessagesRequest;
import com.huaweicloud.sdk.koomessage.v1.model.SendAimBatchMessagesResponse;
import com.huaweicloud.sdk.koomessage.v1.model.SetPrimaryVideoThumbnailRequest;
import com.huaweicloud.sdk.koomessage.v1.model.SetPrimaryVideoThumbnailRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.SetPrimaryVideoThumbnailResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ShowAimMsgSignatureFileInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ShowAimMsgSignatureFileInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ShowAimMsgTemplateDetailRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ShowAimMsgTemplateDetailResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ShowAimMsgTemplateVariableRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ShowAimMsgTemplateVariableResponse;
import com.huaweicloud.sdk.koomessage.v1.model.ShowTemplateVideoThumbnailRequest;
import com.huaweicloud.sdk.koomessage.v1.model.ShowTemplateVideoThumbnailResponse;
import com.huaweicloud.sdk.koomessage.v1.model.SignatureRequest;
import com.huaweicloud.sdk.koomessage.v1.model.SmsMultiTemplateTaskRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.SmsTaskReq;
import com.huaweicloud.sdk.koomessage.v1.model.UnfreezePubRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UnfreezePubRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.UnfreezePubResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UnlockPortRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UnlockPortRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.UnlockPortResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateAimMsgAppRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateAimMsgAppResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateAimMsgSignatureRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateAimMsgSignatureResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateAimMsgTemplateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateAimMsgTemplateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateMenuRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateMenuRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.UpdateMenuResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePersonalTemplateStateDataRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePersonalTemplateStateRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePersonalTemplateStateResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePortalInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePortalInfoRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePortalInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePubInfoRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePubInfoRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.UpdatePubInfoResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UploadAimMsgSignatureFileRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UploadAimMsgSignatureFileRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.UploadAimMsgSignatureFileResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UploadAimTemplateMaterialRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UploadAimTemplateMaterialRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.UploadAimTemplateMaterialResponse;
import com.huaweicloud.sdk.koomessage.v1.model.UploadMediaRequest;
import com.huaweicloud.sdk.koomessage.v1.model.UploadMediaRequestBody;
import com.huaweicloud.sdk.koomessage.v1.model.UploadMediaResponse;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unchecked")
public class KooMessageMeta {

    public static final HttpRequestDef<AddCallBackRequest, AddCallBackResponse> addCallBack = genForaddCallBack();

    private static HttpRequestDef<AddCallBackRequest, AddCallBackResponse> genForaddCallBack() {
        // basic
        HttpRequestDef.Builder<AddCallBackRequest, AddCallBackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddCallBackRequest.class, AddCallBackResponse.class)
                .withName("AddCallBack")
                .withUri("/v1/aim/callbacks")
                .withContentType("application/json");

        // requests
        builder.<AddCallbackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddCallbackRequestBody.class),
            f -> f.withMarshaller(AddCallBackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimCallbacksRequest, ListAimCallbacksResponse> listAimCallbacks =
        genForlistAimCallbacks();

    private static HttpRequestDef<ListAimCallbacksRequest, ListAimCallbacksResponse> genForlistAimCallbacks() {
        // basic
        HttpRequestDef.Builder<ListAimCallbacksRequest, ListAimCallbacksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAimCallbacksRequest.class, ListAimCallbacksResponse.class)
                .withName("ListAimCallbacks")
                .withUri("/v1/aim/callbacks")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse> checkMobileCapability =
        genForcheckMobileCapability();

    private static HttpRequestDef<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse> genForcheckMobileCapability() {
        // basic
        HttpRequestDef.Builder<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CheckMobileCapabilityRequest.class, CheckMobileCapabilityResponse.class)
            .withName("CheckMobileCapability")
            .withUri("/v1/aim/mobile-capabilities/check")
            .withContentType("application/json");

        // requests
        builder.<CheckMobileCapabilityRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckMobileCapabilityRequestBody.class),
            f -> f.withMarshaller(CheckMobileCapabilityRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResolveTaskRequest, CreateResolveTaskResponse> createResolveTask =
        genForcreateResolveTask();

    private static HttpRequestDef<CreateResolveTaskRequest, CreateResolveTaskResponse> genForcreateResolveTask() {
        // basic
        HttpRequestDef.Builder<CreateResolveTaskRequest, CreateResolveTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResolveTaskRequest.class, CreateResolveTaskResponse.class)
                .withName("CreateResolveTask")
                .withUri("/v1/aim/resolve-tasks")
                .withContentType("application/json");

        // requests
        builder.<CreateResolveTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResolveTaskRequestBody.class),
            f -> f.withMarshaller(CreateResolveTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse> listAimResolveDetails =
        genForlistAimResolveDetails();

    private static HttpRequestDef<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse> genForlistAimResolveDetails() {
        // basic
        HttpRequestDef.Builder<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAimResolveDetailsRequest.class, ListAimResolveDetailsResponse.class)
            .withName("ListAimResolveDetails")
            .withUri("/v1/aim/resolve-details")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getTplName, (req, v) -> {
                req.setTplName(v);
            }));
        builder.<String>withRequestField("cust_flag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getCustFlag, (req, v) -> {
                req.setCustFlag(v);
            }));
        builder.<String>withRequestField("sms_sign",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getSmsSign, (req, v) -> {
                req.setSmsSign(v);
            }));
        builder.<String>withRequestField("aim_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getAimUrl, (req, v) -> {
                req.setAimUrl(v);
            }));
        builder.<String>withRequestField("resolved_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getResolvedStatus, (req, v) -> {
                req.setResolvedStatus(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResolveTasksRequest, ListResolveTasksResponse> listResolveTasks =
        genForlistResolveTasks();

    private static HttpRequestDef<ListResolveTasksRequest, ListResolveTasksResponse> genForlistResolveTasks() {
        // basic
        HttpRequestDef.Builder<ListResolveTasksRequest, ListResolveTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResolveTasksRequest.class, ListResolveTasksResponse.class)
                .withName("ListResolveTasks")
                .withUri("/v1/aim/resolve-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getTplName, (req, v) -> {
                req.setTplName(v);
            }));
        builder.<String>withRequestField("cust_flag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getCustFlag, (req, v) -> {
                req.setCustFlag(v);
            }));
        builder.<String>withRequestField("aim_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getAimUrl, (req, v) -> {
                req.setAimUrl(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMenusRequest, ListMenusResponse> listMenus = genForlistMenus();

    private static HttpRequestDef<ListMenusRequest, ListMenusResponse> genForlistMenus() {
        // basic
        HttpRequestDef.Builder<ListMenusRequest, ListMenusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMenusRequest.class, ListMenusResponse.class)
                .withName("ListMenus")
                .withUri("/v1/aim-sa/menus")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("menu_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getMenuId, (req, v) -> {
                req.setMenuId(v);
            }));
        builder.<String>withRequestField("pub_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getPubId, (req, v) -> {
                req.setPubId(v);
            }));
        builder.<String>withRequestField("pub_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getPubName, (req, v) -> {
                req.setPubName(v);
            }));
        builder.<String>withRequestField("online_begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getOnlineBeginTime, (req, v) -> {
                req.setOnlineBeginTime(v);
            }));
        builder.<String>withRequestField("online_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getOnlineEndTime, (req, v) -> {
                req.setOnlineEndTime(v);
            }));
        builder.<Integer>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMenusRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("menu_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getMenuName, (req, v) -> {
                req.setMenuName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMenusRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMenusRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMenuRequest, UpdateMenuResponse> updateMenu = genForupdateMenu();

    private static HttpRequestDef<UpdateMenuRequest, UpdateMenuResponse> genForupdateMenu() {
        // basic
        HttpRequestDef.Builder<UpdateMenuRequest, UpdateMenuResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMenuRequest.class, UpdateMenuResponse.class)
                .withName("UpdateMenu")
                .withUri("/v1/aim-sa/menus/{menu_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("menu_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMenuRequest::getMenuId, (req, v) -> {
                req.setMenuId(v);
            }));
        builder.<UpdateMenuRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMenuRequestBody.class),
            f -> f.withMarshaller(UpdateMenuRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePortInfoRequest, DeletePortInfoResponse> deletePortInfo =
        genFordeletePortInfo();

    private static HttpRequestDef<DeletePortInfoRequest, DeletePortInfoResponse> genFordeletePortInfo() {
        // basic
        HttpRequestDef.Builder<DeletePortInfoRequest, DeletePortInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePortInfoRequest.class, DeletePortInfoResponse.class)
                .withName("DeletePortInfo")
                .withUri("/v1/aim-sa/ports/{port_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("port_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePortInfoRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortInfosRequest, ListPortInfosResponse> listPortInfos =
        genForlistPortInfos();

    private static HttpRequestDef<ListPortInfosRequest, ListPortInfosResponse> genForlistPortInfos() {
        // basic
        HttpRequestDef.Builder<ListPortInfosRequest, ListPortInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortInfosRequest.class, ListPortInfosResponse.class)
                .withName("ListPortInfos")
                .withUri("/v1/aim-sa/ports")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortInfosRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortInfosRequest::getPort, (req, v) -> {
                req.setPort(v);
            }));
        builder.<Integer>withRequestField("port_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortInfosRequest::getPortType, (req, v) -> {
                req.setPortType(v);
            }));
        builder.<String>withRequestField("sign_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortInfosRequest::getSignSearch, (req, v) -> {
                req.setSignSearch(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<OffsetDateTime>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPortInfosRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPortInfosRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("pub_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortInfosRequest::getPubName, (req, v) -> {
                req.setPubName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LockPortRequest, LockPortResponse> lockPort = genForlockPort();

    private static HttpRequestDef<LockPortRequest, LockPortResponse> genForlockPort() {
        // basic
        HttpRequestDef.Builder<LockPortRequest, LockPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LockPortRequest.class, LockPortResponse.class)
                .withName("LockPort")
                .withUri("/v1/aim-sa/ports/associate")
                .withContentType("application/json");

        // requests
        builder.<LockPortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(LockPortRequestBody.class),
            f -> f.withMarshaller(LockPortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterPortRequest, RegisterPortResponse> registerPort = genForregisterPort();

    private static HttpRequestDef<RegisterPortRequest, RegisterPortResponse> genForregisterPort() {
        // basic
        HttpRequestDef.Builder<RegisterPortRequest, RegisterPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterPortRequest.class, RegisterPortResponse.class)
                .withName("RegisterPort")
                .withUri("/v1/aim-sa/ports")
                .withContentType("application/json");

        // requests
        builder.<RegisterPortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RegisterPortRequestBody.class),
            f -> f.withMarshaller(RegisterPortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnlockPortRequest, UnlockPortResponse> unlockPort = genForunlockPort();

    private static HttpRequestDef<UnlockPortRequest, UnlockPortResponse> genForunlockPort() {
        // basic
        HttpRequestDef.Builder<UnlockPortRequest, UnlockPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnlockPortRequest.class, UnlockPortResponse.class)
                .withName("UnlockPort")
                .withUri("/v1/aim-sa/ports/disassociate")
                .withContentType("application/json");

        // requests
        builder.<UnlockPortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnlockPortRequestBody.class),
            f -> f.withMarshaller(UnlockPortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortalInfosRequest, ListPortalInfosResponse> listPortalInfos =
        genForlistPortalInfos();

    private static HttpRequestDef<ListPortalInfosRequest, ListPortalInfosResponse> genForlistPortalInfos() {
        // basic
        HttpRequestDef.Builder<ListPortalInfosRequest, ListPortalInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPortalInfosRequest.class, ListPortalInfosResponse.class)
                .withName("ListPortalInfos")
                .withUri("/v1/aim-sa/portals")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pub_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getPubName, (req, v) -> {
                req.setPubName(v);
            }));
        builder.<OffsetDateTime>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePortalInfoRequest, UpdatePortalInfoResponse> updatePortalInfo =
        genForupdatePortalInfo();

    private static HttpRequestDef<UpdatePortalInfoRequest, UpdatePortalInfoResponse> genForupdatePortalInfo() {
        // basic
        HttpRequestDef.Builder<UpdatePortalInfoRequest, UpdatePortalInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePortalInfoRequest.class, UpdatePortalInfoResponse.class)
                .withName("UpdatePortalInfo")
                .withUri("/v1/aim-sa/portals/{portal_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("portal_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePortalInfoRequest::getPortalId, (req, v) -> {
                req.setPortalId(v);
            }));
        builder.<UpdatePortalInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePortalInfoRequestBody.class),
            f -> f.withMarshaller(UpdatePortalInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<FreezePubRequest, FreezePubResponse> freezePub = genForfreezePub();

    private static HttpRequestDef<FreezePubRequest, FreezePubResponse> genForfreezePub() {
        // basic
        HttpRequestDef.Builder<FreezePubRequest, FreezePubResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, FreezePubRequest.class, FreezePubResponse.class)
                .withName("FreezePub")
                .withUri("/v1/aim-sa/pubs/{pub_id}/freeze")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(FreezePubRequest::getPubId, (req, v) -> {
                req.setPubId(v);
            }));
        builder.<FreezePubRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FreezePubRequestBody.class),
            f -> f.withMarshaller(FreezePubRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPubInfosRequest, ListPubInfosResponse> listPubInfos = genForlistPubInfos();

    private static HttpRequestDef<ListPubInfosRequest, ListPubInfosResponse> genForlistPubInfos() {
        // basic
        HttpRequestDef.Builder<ListPubInfosRequest, ListPubInfosResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPubInfosRequest.class, ListPubInfosResponse.class)
                .withName("ListPubInfos")
                .withUri("/v1/aim-sa/pubs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pub_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPubInfosRequest::getPubName, (req, v) -> {
                req.setPubName(v);
            }));
        builder.<Integer>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubInfosRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<OffsetDateTime>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPubInfosRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubInfosRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubInfosRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPubInfosRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("industry",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPubInfosRequest::getIndustry, (req, v) -> {
                req.setIndustry(v);
            }));
        builder.<Integer>withRequestField("approve_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubInfosRequest::getApproveState, (req, v) -> {
                req.setApproveState(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnfreezePubRequest, UnfreezePubResponse> unfreezePub = genForunfreezePub();

    private static HttpRequestDef<UnfreezePubRequest, UnfreezePubResponse> genForunfreezePub() {
        // basic
        HttpRequestDef.Builder<UnfreezePubRequest, UnfreezePubResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnfreezePubRequest.class, UnfreezePubResponse.class)
                .withName("UnfreezePub")
                .withUri("/v1/aim-sa/pubs/{pub_id}/unfreeze")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnfreezePubRequest::getPubId, (req, v) -> {
                req.setPubId(v);
            }));
        builder.<UnfreezePubRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UnfreezePubRequestBody.class),
            f -> f.withMarshaller(UnfreezePubRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePubInfoRequest, UpdatePubInfoResponse> updatePubInfo =
        genForupdatePubInfo();

    private static HttpRequestDef<UpdatePubInfoRequest, UpdatePubInfoResponse> genForupdatePubInfo() {
        // basic
        HttpRequestDef.Builder<UpdatePubInfoRequest, UpdatePubInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdatePubInfoRequest.class, UpdatePubInfoResponse.class)
                .withName("UpdatePubInfo")
                .withUri("/v1/aim-sa/pubs/{pub_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pub_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePubInfoRequest::getPubId, (req, v) -> {
                req.setPubId(v);
            }));
        builder.<UpdatePubInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePubInfoRequestBody.class),
            f -> f.withMarshaller(UpdatePubInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePubInfoRequest, CreatePubInfoResponse> createPubInfo =
        genForcreatePubInfo();

    private static HttpRequestDef<CreatePubInfoRequest, CreatePubInfoResponse> genForcreatePubInfo() {
        // basic
        HttpRequestDef.Builder<CreatePubInfoRequest, CreatePubInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePubInfoRequest.class, CreatePubInfoResponse.class)
                .withName("CreatePubInfo")
                .withUri("/v1/aim-sa/unify/pubs")
                .withContentType("application/json");

        // requests
        builder.<CreatePubInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePubInfoRequestBody.class),
            f -> f.withMarshaller(CreatePubInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushMenuInfoRequest, PushMenuInfoResponse> pushMenuInfo = genForpushMenuInfo();

    private static HttpRequestDef<PushMenuInfoRequest, PushMenuInfoResponse> genForpushMenuInfo() {
        // basic
        HttpRequestDef.Builder<PushMenuInfoRequest, PushMenuInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PushMenuInfoRequest.class, PushMenuInfoResponse.class)
                .withName("PushMenuInfo")
                .withUri("/v1/aim-sa/menus/{menu_id}/push")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("menu_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PushMenuInfoRequest::getMenuId, (req, v) -> {
                req.setMenuId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushPortalInfoRequest, PushPortalInfoResponse> pushPortalInfo =
        genForpushPortalInfo();

    private static HttpRequestDef<PushPortalInfoRequest, PushPortalInfoResponse> genForpushPortalInfo() {
        // basic
        HttpRequestDef.Builder<PushPortalInfoRequest, PushPortalInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, PushPortalInfoRequest.class, PushPortalInfoResponse.class)
                .withName("PushPortalInfo")
                .withUri("/v1/aim-sa/portals/{portal_id}/push")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("portal_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PushPortalInfoRequest::getPortalId, (req, v) -> {
                req.setPortalId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadMediaRequest, UploadMediaResponse> uploadMedia = genForuploadMedia();

    private static HttpRequestDef<UploadMediaRequest, UploadMediaResponse> genForuploadMedia() {
        // basic
        HttpRequestDef.Builder<UploadMediaRequest, UploadMediaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadMediaRequest.class, UploadMediaResponse.class)
                .withName("UploadMedia")
                .withUri("/v1/aim-sa/media/upload")
                .withContentType("multipart/form-data");

        // requests
        builder.<UploadMediaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadMediaRequestBody.class),
            f -> f.withMarshaller(UploadMediaRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAimSendTaskRequest, CreateAimSendTaskResponse> createAimSendTask =
        genForcreateAimSendTask();

    private static HttpRequestDef<CreateAimSendTaskRequest, CreateAimSendTaskResponse> genForcreateAimSendTask() {
        // basic
        HttpRequestDef.Builder<CreateAimSendTaskRequest, CreateAimSendTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAimSendTaskRequest.class, CreateAimSendTaskResponse.class)
                .withName("CreateAimSendTask")
                .withUri("/v1/aim/send-tasks")
                .withContentType("application/json");

        // requests
        builder.<CreateAimSendTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAimSendTaskRequestBody.class),
            f -> f.withMarshaller(CreateAimSendTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimSendDetailsRequest, ListAimSendDetailsResponse> listAimSendDetails =
        genForlistAimSendDetails();

    private static HttpRequestDef<ListAimSendDetailsRequest, ListAimSendDetailsResponse> genForlistAimSendDetails() {
        // basic
        HttpRequestDef.Builder<ListAimSendDetailsRequest, ListAimSendDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAimSendDetailsRequest.class, ListAimSendDetailsResponse.class)
                .withName("ListAimSendDetails")
                .withUri("/v1/aim/send-details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("sms_sign",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getSmsSign, (req, v) -> {
                req.setSmsSign(v);
            }));
        builder.<String>withRequestField("cust_flag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getCustFlag, (req, v) -> {
                req.setCustFlag(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimSendReportsRequest, ListAimSendReportsResponse> listAimSendReports =
        genForlistAimSendReports();

    private static HttpRequestDef<ListAimSendReportsRequest, ListAimSendReportsResponse> genForlistAimSendReports() {
        // basic
        HttpRequestDef.Builder<ListAimSendReportsRequest, ListAimSendReportsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAimSendReportsRequest.class, ListAimSendReportsResponse.class)
                .withName("ListAimSendReports")
                .withUri("/v1/aim/send-reports")
                .withContentType("application/json");

        // requests
        builder.<ListAimSendReportsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAimSendReportsRequestBody.class),
            f -> f.withMarshaller(ListAimSendReportsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimSendTasksRequest, ListAimSendTasksResponse> listAimSendTasks =
        genForlistAimSendTasks();

    private static HttpRequestDef<ListAimSendTasksRequest, ListAimSendTasksResponse> genForlistAimSendTasks() {
        // basic
        HttpRequestDef.Builder<ListAimSendTasksRequest, ListAimSendTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAimSendTasksRequest.class, ListAimSendTasksResponse.class)
                .withName("ListAimSendTasks")
                .withUri("/v1/aim/send-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTplName, (req, v) -> {
                req.setTplName(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTaskStatus, (req, v) -> {
                req.setTaskStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSmsAppRequest, CreateSmsAppResponse> createSmsApp = genForcreateSmsApp();

    private static HttpRequestDef<CreateSmsAppRequest, CreateSmsAppResponse> genForcreateSmsApp() {
        // basic
        HttpRequestDef.Builder<CreateSmsAppRequest, CreateSmsAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSmsAppRequest.class, CreateSmsAppResponse.class)
                .withName("CreateSmsApp")
                .withUri("/v1/sms/apps")
                .withContentType("application/json");

        // requests
        builder.<MsgAppRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MsgAppRequest.class),
            f -> f.withMarshaller(CreateSmsAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimMsgAppRequest, ListAimMsgAppResponse> listAimMsgApp =
        genForlistAimMsgApp();

    private static HttpRequestDef<ListAimMsgAppRequest, ListAimMsgAppResponse> genForlistAimMsgApp() {
        // basic
        HttpRequestDef.Builder<ListAimMsgAppRequest, ListAimMsgAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAimMsgAppRequest.class, ListAimMsgAppResponse.class)
                .withName("ListAimMsgApp")
                .withUri("/v1/sms/apps")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimMsgAppRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimMsgAppRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgAppRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgAppRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgAppRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgAppRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimMsgAppDetailRequest, ListAimMsgAppDetailResponse> listAimMsgAppDetail =
        genForlistAimMsgAppDetail();

    private static HttpRequestDef<ListAimMsgAppDetailRequest, ListAimMsgAppDetailResponse> genForlistAimMsgAppDetail() {
        // basic
        HttpRequestDef.Builder<ListAimMsgAppDetailRequest, ListAimMsgAppDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAimMsgAppDetailRequest.class, ListAimMsgAppDetailResponse.class)
                .withName("ListAimMsgAppDetail")
                .withUri("/v1/sms/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgAppDetailRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAimMsgAppRequest, UpdateAimMsgAppResponse> updateAimMsgApp =
        genForupdateAimMsgApp();

    private static HttpRequestDef<UpdateAimMsgAppRequest, UpdateAimMsgAppResponse> genForupdateAimMsgApp() {
        // basic
        HttpRequestDef.Builder<UpdateAimMsgAppRequest, UpdateAimMsgAppResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAimMsgAppRequest.class, UpdateAimMsgAppResponse.class)
                .withName("UpdateAimMsgApp")
                .withUri("/v1/sms/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAimMsgAppRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<MsgAppRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MsgAppRequest.class),
            f -> f.withMarshaller(UpdateAimMsgAppRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendAimBatchDifferentMessagesRequest, SendAimBatchDifferentMessagesResponse> sendAimBatchDifferentMessages =
        genForsendAimBatchDifferentMessages();

    private static HttpRequestDef<SendAimBatchDifferentMessagesRequest, SendAimBatchDifferentMessagesResponse> genForsendAimBatchDifferentMessages() {
        // basic
        HttpRequestDef.Builder<SendAimBatchDifferentMessagesRequest, SendAimBatchDifferentMessagesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SendAimBatchDifferentMessagesRequest.class,
                    SendAimBatchDifferentMessagesResponse.class)
                .withName("SendAimBatchDifferentMessages")
                .withUri("/v1/aim/sms/diff-messages")
                .withContentType("application/json");

        // requests
        builder.<SmsMultiTemplateTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsMultiTemplateTaskRequestBody.class),
            f -> f.withMarshaller(SendAimBatchDifferentMessagesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendAimBatchMessagesRequest, SendAimBatchMessagesResponse> sendAimBatchMessages =
        genForsendAimBatchMessages();

    private static HttpRequestDef<SendAimBatchMessagesRequest, SendAimBatchMessagesResponse> genForsendAimBatchMessages() {
        // basic
        HttpRequestDef.Builder<SendAimBatchMessagesRequest, SendAimBatchMessagesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SendAimBatchMessagesRequest.class, SendAimBatchMessagesResponse.class)
            .withName("SendAimBatchMessages")
            .withUri("/v1/aim/sms/messages")
            .withContentType("application/json");

        // requests
        builder.<SmsTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SmsTaskReq.class),
            f -> f.withMarshaller(SendAimBatchMessagesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAimMsgSignatureRequest, AddAimMsgSignatureResponse> addAimMsgSignature =
        genForaddAimMsgSignature();

    private static HttpRequestDef<AddAimMsgSignatureRequest, AddAimMsgSignatureResponse> genForaddAimMsgSignature() {
        // basic
        HttpRequestDef.Builder<AddAimMsgSignatureRequest, AddAimMsgSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddAimMsgSignatureRequest.class, AddAimMsgSignatureResponse.class)
                .withName("AddAimMsgSignature")
                .withUri("/v1/sms/signatures")
                .withContentType("application/json");

        // requests
        builder.<SignatureRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SignatureRequest.class),
            f -> f.withMarshaller(AddAimMsgSignatureRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAimMsgSignatureRequest, DeleteAimMsgSignatureResponse> deleteAimMsgSignature =
        genFordeleteAimMsgSignature();

    private static HttpRequestDef<DeleteAimMsgSignatureRequest, DeleteAimMsgSignatureResponse> genFordeleteAimMsgSignature() {
        // basic
        HttpRequestDef.Builder<DeleteAimMsgSignatureRequest, DeleteAimMsgSignatureResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAimMsgSignatureRequest.class, DeleteAimMsgSignatureResponse.class)
            .withName("DeleteAimMsgSignature")
            .withUri("/v1/aim/sms/signatures/{signature_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("signature_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAimMsgSignatureRequest::getSignatureId, (req, v) -> {
                req.setSignatureId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimMsgSignatureRequest, ListAimMsgSignatureResponse> listAimMsgSignature =
        genForlistAimMsgSignature();

    private static HttpRequestDef<ListAimMsgSignatureRequest, ListAimMsgSignatureResponse> genForlistAimMsgSignature() {
        // basic
        HttpRequestDef.Builder<ListAimMsgSignatureRequest, ListAimMsgSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAimMsgSignatureRequest.class, ListAimMsgSignatureResponse.class)
                .withName("ListAimMsgSignature")
                .withUri("/v1/sms/signatures")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("signature_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getSignatureId, (req, v) -> {
                req.setSignatureId(v);
            }));
        builder.<String>withRequestField("signature_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getSignatureName, (req, v) -> {
                req.setSignatureName(v);
            }));
        builder.<String>withRequestField("signature_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getSignatureType, (req, v) -> {
                req.setSignatureType(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimMsgSignatureDetailRequest, ListAimMsgSignatureDetailResponse> listAimMsgSignatureDetail =
        genForlistAimMsgSignatureDetail();

    private static HttpRequestDef<ListAimMsgSignatureDetailRequest, ListAimMsgSignatureDetailResponse> genForlistAimMsgSignatureDetail() {
        // basic
        HttpRequestDef.Builder<ListAimMsgSignatureDetailRequest, ListAimMsgSignatureDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAimMsgSignatureDetailRequest.class,
                    ListAimMsgSignatureDetailResponse.class)
                .withName("ListAimMsgSignatureDetail")
                .withUri("/v1/sms/signatures/{signature_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("signature_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureDetailRequest::getSignatureId, (req, v) -> {
                req.setSignatureId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAimMsgSignatureFileInfoRequest, ShowAimMsgSignatureFileInfoResponse> showAimMsgSignatureFileInfo =
        genForshowAimMsgSignatureFileInfo();

    private static HttpRequestDef<ShowAimMsgSignatureFileInfoRequest, ShowAimMsgSignatureFileInfoResponse> genForshowAimMsgSignatureFileInfo() {
        // basic
        HttpRequestDef.Builder<ShowAimMsgSignatureFileInfoRequest, ShowAimMsgSignatureFileInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAimMsgSignatureFileInfoRequest.class,
                    ShowAimMsgSignatureFileInfoResponse.class)
                .withName("ShowAimMsgSignatureFileInfo")
                .withUri("/v1/sms/signatures/files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("file_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAimMsgSignatureFileInfoRequest::getFileId, (req, v) -> {
                req.setFileId(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAimMsgSignatureFileInfoRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAimMsgSignatureFileInfoRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAimMsgSignatureRequest, UpdateAimMsgSignatureResponse> updateAimMsgSignature =
        genForupdateAimMsgSignature();

    private static HttpRequestDef<UpdateAimMsgSignatureRequest, UpdateAimMsgSignatureResponse> genForupdateAimMsgSignature() {
        // basic
        HttpRequestDef.Builder<UpdateAimMsgSignatureRequest, UpdateAimMsgSignatureResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAimMsgSignatureRequest.class, UpdateAimMsgSignatureResponse.class)
            .withName("UpdateAimMsgSignature")
            .withUri("/v1/sms/signatures/{signature_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("signature_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAimMsgSignatureRequest::getSignatureId, (req, v) -> {
                req.setSignatureId(v);
            }));
        builder.<SignatureRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SignatureRequest.class),
            f -> f.withMarshaller(UpdateAimMsgSignatureRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAimMsgSignatureFileRequest, UploadAimMsgSignatureFileResponse> uploadAimMsgSignatureFile =
        genForuploadAimMsgSignatureFile();

    private static HttpRequestDef<UploadAimMsgSignatureFileRequest, UploadAimMsgSignatureFileResponse> genForuploadAimMsgSignatureFile() {
        // basic
        HttpRequestDef.Builder<UploadAimMsgSignatureFileRequest, UploadAimMsgSignatureFileResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UploadAimMsgSignatureFileRequest.class,
                    UploadAimMsgSignatureFileResponse.class)
                .withName("UploadAimMsgSignatureFile")
                .withUri("/v1/sms/signatures/files")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("file_desc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadAimMsgSignatureFileRequest::getFileDesc, (req, v) -> {
                req.setFileDesc(v);
            }));
        builder.<UploadAimMsgSignatureFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAimMsgSignatureFileRequestBody.class),
            f -> f.withMarshaller(UploadAimMsgSignatureFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAimMsgTemplateRequest, CreateAimMsgTemplateResponse> createAimMsgTemplate =
        genForcreateAimMsgTemplate();

    private static HttpRequestDef<CreateAimMsgTemplateRequest, CreateAimMsgTemplateResponse> genForcreateAimMsgTemplate() {
        // basic
        HttpRequestDef.Builder<CreateAimMsgTemplateRequest, CreateAimMsgTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAimMsgTemplateRequest.class, CreateAimMsgTemplateResponse.class)
            .withName("CreateAimMsgTemplate")
            .withUri("/v1/sms/templates")
            .withContentType("application/json");

        // requests
        builder.<MsgTemplateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MsgTemplateRequest.class),
            f -> f.withMarshaller(CreateAimMsgTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAimMsgTemplateRequest, DeleteAimMsgTemplateResponse> deleteAimMsgTemplate =
        genFordeleteAimMsgTemplate();

    private static HttpRequestDef<DeleteAimMsgTemplateRequest, DeleteAimMsgTemplateResponse> genFordeleteAimMsgTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteAimMsgTemplateRequest, DeleteAimMsgTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAimMsgTemplateRequest.class, DeleteAimMsgTemplateResponse.class)
            .withName("DeleteAimMsgTemplate")
            .withUri("/v1/sms/templates/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAimMsgTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimMsgTemplateRequest, ListAimMsgTemplateResponse> listAimMsgTemplate =
        genForlistAimMsgTemplate();

    private static HttpRequestDef<ListAimMsgTemplateRequest, ListAimMsgTemplateResponse> genForlistAimMsgTemplate() {
        // basic
        HttpRequestDef.Builder<ListAimMsgTemplateRequest, ListAimMsgTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAimMsgTemplateRequest.class, ListAimMsgTemplateResponse.class)
                .withName("ListAimMsgTemplate")
                .withUri("/v1/sms/templates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<ListAimMsgTemplateRequest.FlowStatusEnum>withRequestField("flow_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAimMsgTemplateRequest.FlowStatusEnum.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getFlowStatus, (req, v) -> {
                req.setFlowStatus(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<String>withRequestField("template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getTemplateName, (req, v) -> {
                req.setTemplateName(v);
            }));
        builder.<ListAimMsgTemplateRequest.TemplateTypeEnum>withRequestField("template_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAimMsgTemplateRequest.TemplateTypeEnum.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getTemplateType, (req, v) -> {
                req.setTemplateType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAimMsgTemplateDetailRequest, ShowAimMsgTemplateDetailResponse> showAimMsgTemplateDetail =
        genForshowAimMsgTemplateDetail();

    private static HttpRequestDef<ShowAimMsgTemplateDetailRequest, ShowAimMsgTemplateDetailResponse> genForshowAimMsgTemplateDetail() {
        // basic
        HttpRequestDef.Builder<ShowAimMsgTemplateDetailRequest, ShowAimMsgTemplateDetailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowAimMsgTemplateDetailRequest.class, ShowAimMsgTemplateDetailResponse.class)
                .withName("ShowAimMsgTemplateDetail")
                .withUri("/v1/sms/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAimMsgTemplateDetailRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAimMsgTemplateVariableRequest, ShowAimMsgTemplateVariableResponse> showAimMsgTemplateVariable =
        genForshowAimMsgTemplateVariable();

    private static HttpRequestDef<ShowAimMsgTemplateVariableRequest, ShowAimMsgTemplateVariableResponse> genForshowAimMsgTemplateVariable() {
        // basic
        HttpRequestDef.Builder<ShowAimMsgTemplateVariableRequest, ShowAimMsgTemplateVariableResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAimMsgTemplateVariableRequest.class,
                    ShowAimMsgTemplateVariableResponse.class)
                .withName("ShowAimMsgTemplateVariable")
                .withUri("/v1/sms/templates/{template_id}/variable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAimMsgTemplateVariableRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAimMsgTemplateRequest, UpdateAimMsgTemplateResponse> updateAimMsgTemplate =
        genForupdateAimMsgTemplate();

    private static HttpRequestDef<UpdateAimMsgTemplateRequest, UpdateAimMsgTemplateResponse> genForupdateAimMsgTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateAimMsgTemplateRequest, UpdateAimMsgTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAimMsgTemplateRequest.class, UpdateAimMsgTemplateResponse.class)
            .withName("UpdateAimMsgTemplate")
            .withUri("/v1/sms/templates/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAimMsgTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<MsgTemplateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MsgTemplateRequest.class),
            f -> f.withMarshaller(UpdateAimMsgTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse> createAimPersonalTemplate =
        genForcreateAimPersonalTemplate();

    private static HttpRequestDef<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse> genForcreateAimPersonalTemplate() {
        // basic
        HttpRequestDef.Builder<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateAimPersonalTemplateRequest.class,
                    CreateAimPersonalTemplateResponse.class)
                .withName("CreateAimPersonalTemplate")
                .withUri("/v1/aim/templates")
                .withContentType("application/json");

        // requests
        builder.<CreateAimPersonalTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAimPersonalTemplateRequestBody.class),
            f -> f.withMarshaller(CreateAimPersonalTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse> deleteAimPersonalTemplate =
        genFordeleteAimPersonalTemplate();

    private static HttpRequestDef<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse> genFordeleteAimPersonalTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteAimPersonalTemplateRequest.class,
                    DeleteAimPersonalTemplateResponse.class)
                .withName("DeleteAimPersonalTemplate")
                .withUri("/v1/aim/template/{tpl_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tpl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAimPersonalTemplateRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse> deleteTemplateMaterial =
        genFordeleteTemplateMaterial();

    private static HttpRequestDef<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse> genFordeleteTemplateMaterial() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteTemplateMaterialRequest.class, DeleteTemplateMaterialResponse.class)
            .withName("DeleteTemplateMaterial")
            .withUri("/v1/aim/template-materials/delete")
            .withContentType("application/json");

        // requests
        builder.<DeleteTemplateMaterialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTemplateMaterialRequestBody.class),
            f -> f.withMarshaller(DeleteTemplateMaterialRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse> listAimTemplateMaterials =
        genForlistAimTemplateMaterials();

    private static HttpRequestDef<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse> genForlistAimTemplateMaterials() {
        // basic
        HttpRequestDef.Builder<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAimTemplateMaterialsRequest.class, ListAimTemplateMaterialsResponse.class)
                .withName("ListAimTemplateMaterials")
                .withUri("/v1/aim/template-materials")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getResourceType, (req, v) -> {
                req.setResourceType(v);
            }));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getFileName, (req, v) -> {
                req.setFileName(v);
            }));
        builder.<String>withRequestField("material_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getMaterialId, (req, v) -> {
                req.setMaterialId(v);
            }));
        builder.<String>withRequestField("aim_resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getAimResourceId, (req, v) -> {
                req.setAimResourceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse> listAimTemplateReports =
        genForlistAimTemplateReports();

    private static HttpRequestDef<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse> genForlistAimTemplateReports() {
        // basic
        HttpRequestDef.Builder<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListAimTemplateReportsRequest.class, ListAimTemplateReportsResponse.class)
            .withName("ListAimTemplateReports")
            .withUri("/v1/aim/tempalte-reports/query")
            .withContentType("application/json");

        // requests
        builder.<ListAimTemplateReportsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAimTemplateReportsRequestBody.class),
            f -> f.withMarshaller(ListAimTemplateReportsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimTemplatesRequest, ListAimTemplatesResponse> listAimTemplates =
        genForlistAimTemplates();

    private static HttpRequestDef<ListAimTemplatesRequest, ListAimTemplatesResponse> genForlistAimTemplates() {
        // basic
        HttpRequestDef.Builder<ListAimTemplatesRequest, ListAimTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAimTemplatesRequest.class, ListAimTemplatesResponse.class)
                .withName("ListAimTemplates")
                .withUri("/v1/aim/templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getTplName, (req, v) -> {
                req.setTplName(v);
            }));
        builder.<String>withRequestField("tpl_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getTplType, (req, v) -> {
                req.setTplType(v);
            }));
        builder.<List<String>>withRequestField("factory_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getFactoryType, (req, v) -> {
                req.setFactoryType(v);
            }));
        builder.<Boolean>withRequestField("has_param",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getHasParam, (req, v) -> {
                req.setHasParam(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Boolean>withRequestField("is_only_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getIsOnlyStatus, (req, v) -> {
                req.setIsOnlyStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetPrimaryVideoThumbnailRequest, SetPrimaryVideoThumbnailResponse> setPrimaryVideoThumbnail =
        genForsetPrimaryVideoThumbnail();

    private static HttpRequestDef<SetPrimaryVideoThumbnailRequest, SetPrimaryVideoThumbnailResponse> genForsetPrimaryVideoThumbnail() {
        // basic
        HttpRequestDef.Builder<SetPrimaryVideoThumbnailRequest, SetPrimaryVideoThumbnailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SetPrimaryVideoThumbnailRequest.class, SetPrimaryVideoThumbnailResponse.class)
                .withName("SetPrimaryVideoThumbnail")
                .withUri("/v1/aim/template-material-thumbnails")
                .withContentType("application/json");

        // requests
        builder.<SetPrimaryVideoThumbnailRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetPrimaryVideoThumbnailRequestBody.class),
            f -> f.withMarshaller(SetPrimaryVideoThumbnailRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateVideoThumbnailRequest, ShowTemplateVideoThumbnailResponse> showTemplateVideoThumbnail =
        genForshowTemplateVideoThumbnail();

    private static HttpRequestDef<ShowTemplateVideoThumbnailRequest, ShowTemplateVideoThumbnailResponse> genForshowTemplateVideoThumbnail() {
        // basic
        HttpRequestDef.Builder<ShowTemplateVideoThumbnailRequest, ShowTemplateVideoThumbnailResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowTemplateVideoThumbnailRequest.class,
                    ShowTemplateVideoThumbnailResponse.class)
                .withName("ShowTemplateVideoThumbnail")
                .withUri("/v1/aim/template-material-thumbnails")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("aim_resource_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateVideoThumbnailRequest::getAimResourceId, (req, v) -> {
                req.setAimResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse> updatePersonalTemplateState =
        genForupdatePersonalTemplateState();

    private static HttpRequestDef<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse> genForupdatePersonalTemplateState() {
        // basic
        HttpRequestDef.Builder<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePersonalTemplateStateRequest.class,
                    UpdatePersonalTemplateStateResponse.class)
                .withName("UpdatePersonalTemplateState")
                .withUri("/v1/aim/template-state/{tpl_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tpl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePersonalTemplateStateRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<UpdatePersonalTemplateStateDataRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePersonalTemplateStateDataRequest.class),
            f -> f.withMarshaller(UpdatePersonalTemplateStateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse> uploadAimTemplateMaterial =
        genForuploadAimTemplateMaterial();

    private static HttpRequestDef<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse> genForuploadAimTemplateMaterial() {
        // basic
        HttpRequestDef.Builder<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UploadAimTemplateMaterialRequest.class,
                    UploadAimTemplateMaterialResponse.class)
                .withName("UploadAimTemplateMaterial")
                .withUri("/v1/aim/template-materials")
                .withContentType("application/json");

        // requests
        builder.<UploadAimTemplateMaterialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAimTemplateMaterialRequestBody.class),
            f -> f.withMarshaller(UploadAimTemplateMaterialRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddVmsCallBackRequest, AddVmsCallBackResponse> addVmsCallBack =
        genForaddVmsCallBack();

    private static HttpRequestDef<AddVmsCallBackRequest, AddVmsCallBackResponse> genForaddVmsCallBack() {
        // basic
        HttpRequestDef.Builder<AddVmsCallBackRequest, AddVmsCallBackResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddVmsCallBackRequest.class, AddVmsCallBackResponse.class)
                .withName("AddVmsCallBack")
                .withUri("/v1/aim-basic/callbacks")
                .withContentType("application/json");

        // requests
        builder.<AddVmsCallBackRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddVmsCallBackRequestBody.class),
            f -> f.withMarshaller(AddVmsCallBackRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse> createVmsSendTask =
        genForcreateVmsSendTask();

    private static HttpRequestDef<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse> genForcreateVmsSendTask() {
        // basic
        HttpRequestDef.Builder<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVmsSendTaskRequest.class, CreateVmsSendTaskResponse.class)
                .withName("CreateVmsSendTask")
                .withUri("/v1/aim-basic/send-tasks")
                .withContentType("application/json");

        // requests
        builder.<CreateVmsSendTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVmsSendTaskRequestBody.class),
            f -> f.withMarshaller(CreateVmsSendTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVmsCallbacksRequest, ListVmsCallbacksResponse> listVmsCallbacks =
        genForlistVmsCallbacks();

    private static HttpRequestDef<ListVmsCallbacksRequest, ListVmsCallbacksResponse> genForlistVmsCallbacks() {
        // basic
        HttpRequestDef.Builder<ListVmsCallbacksRequest, ListVmsCallbacksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVmsCallbacksRequest.class, ListVmsCallbacksResponse.class)
                .withName("ListVmsCallbacks")
                .withUri("/v1/aim-basic/callbacks")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVmsSendTasksRequest, ListVmsSendTasksResponse> listVmsSendTasks =
        genForlistVmsSendTasks();

    private static HttpRequestDef<ListVmsSendTasksRequest, ListVmsSendTasksResponse> genForlistVmsSendTasks() {
        // basic
        HttpRequestDef.Builder<ListVmsSendTasksRequest, ListVmsSendTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVmsSendTasksRequest.class, ListVmsSendTasksResponse.class)
                .withName("ListVmsSendTasks")
                .withUri("/v1/aim-basic/send-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTaskName, (req, v) -> {
                req.setTaskName(v);
            }));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTaskId, (req, v) -> {
                req.setTaskId(v);
            }));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTplName, (req, v) -> {
                req.setTplName(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("send_begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getSendBeginTime, (req, v) -> {
                req.setSendBeginTime(v);
            }));
        builder.<String>withRequestField("send_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getSendEndTime, (req, v) -> {
                req.setSendEndTime(v);
            }));
        builder.<String>withRequestField("operator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getOperator, (req, v) -> {
                req.setOperator(v);
            }));
        builder.<String>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTaskStatus, (req, v) -> {
                req.setTaskStatus(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVmsTemplateRequest, CreateVmsTemplateResponse> createVmsTemplate =
        genForcreateVmsTemplate();

    private static HttpRequestDef<CreateVmsTemplateRequest, CreateVmsTemplateResponse> genForcreateVmsTemplate() {
        // basic
        HttpRequestDef.Builder<CreateVmsTemplateRequest, CreateVmsTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVmsTemplateRequest.class, CreateVmsTemplateResponse.class)
                .withName("CreateVmsTemplate")
                .withUri("/v1/aim-basic/templates")
                .withContentType("application/json");

        // requests
        builder.<CreateVmsTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVmsTemplateRequestBody.class),
            f -> f.withMarshaller(CreateVmsTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse> listVmsTemplateStatus =
        genForlistVmsTemplateStatus();

    private static HttpRequestDef<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse> genForlistVmsTemplateStatus() {
        // basic
        HttpRequestDef.Builder<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListVmsTemplateStatusRequest.class, ListVmsTemplateStatusResponse.class)
            .withName("ListVmsTemplateStatus")
            .withUri("/v1/aim-basic/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getTplId, (req, v) -> {
                req.setTplId(v);
            }));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getTplName, (req, v) -> {
                req.setTplName(v);
            }));
        builder.<String>withRequestField("tpl_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getTplType, (req, v) -> {
                req.setTplType(v);
            }));
        builder.<Boolean>withRequestField("has_param",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getHasParam, (req, v) -> {
                req.setHasParam(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

}
