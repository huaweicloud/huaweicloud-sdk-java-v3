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

    public static final HttpRequestDef<AddCallBackRequest, AddCallBackResponse> addCallBack = genForAddCallBack();

    private static HttpRequestDef<AddCallBackRequest, AddCallBackResponse> genForAddCallBack() {
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
            f -> f.withMarshaller(AddCallBackRequest::getBody, AddCallBackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimCallbacksRequest, ListAimCallbacksResponse> listAimCallbacks =
        genForListAimCallbacks();

    private static HttpRequestDef<ListAimCallbacksRequest, ListAimCallbacksResponse> genForListAimCallbacks() {
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
        genForCheckMobileCapability();

    private static HttpRequestDef<CheckMobileCapabilityRequest, CheckMobileCapabilityResponse> genForCheckMobileCapability() {
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
            f -> f.withMarshaller(CheckMobileCapabilityRequest::getBody, CheckMobileCapabilityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResolveTaskRequest, CreateResolveTaskResponse> createResolveTask =
        genForCreateResolveTask();

    private static HttpRequestDef<CreateResolveTaskRequest, CreateResolveTaskResponse> genForCreateResolveTask() {
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
            f -> f.withMarshaller(CreateResolveTaskRequest::getBody, CreateResolveTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse> listAimResolveDetails =
        genForListAimResolveDetails();

    private static HttpRequestDef<ListAimResolveDetailsRequest, ListAimResolveDetailsResponse> genForListAimResolveDetails() {
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
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getTaskId, ListAimResolveDetailsRequest::setTaskId));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getTaskName,
                ListAimResolveDetailsRequest::setTaskName));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getTplId, ListAimResolveDetailsRequest::setTplId));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getTplName, ListAimResolveDetailsRequest::setTplName));
        builder.<String>withRequestField("cust_flag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getCustFlag,
                ListAimResolveDetailsRequest::setCustFlag));
        builder.<String>withRequestField("sms_sign",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getSmsSign, ListAimResolveDetailsRequest::setSmsSign));
        builder.<String>withRequestField("aim_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getAimUrl, ListAimResolveDetailsRequest::setAimUrl));
        builder.<String>withRequestField("resolved_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getResolvedStatus,
                ListAimResolveDetailsRequest::setResolvedStatus));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getBeginTime,
                ListAimResolveDetailsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getEndTime, ListAimResolveDetailsRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getOffset, ListAimResolveDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimResolveDetailsRequest::getLimit, ListAimResolveDetailsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResolveTasksRequest, ListResolveTasksResponse> listResolveTasks =
        genForListResolveTasks();

    private static HttpRequestDef<ListResolveTasksRequest, ListResolveTasksResponse> genForListResolveTasks() {
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
            f -> f.withMarshaller(ListResolveTasksRequest::getTaskId, ListResolveTasksRequest::setTaskId));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getTaskName, ListResolveTasksRequest::setTaskName));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getTplId, ListResolveTasksRequest::setTplId));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getTplName, ListResolveTasksRequest::setTplName));
        builder.<String>withRequestField("cust_flag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getCustFlag, ListResolveTasksRequest::setCustFlag));
        builder.<String>withRequestField("aim_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getAimUrl, ListResolveTasksRequest::setAimUrl));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getBeginTime, ListResolveTasksRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getEndTime, ListResolveTasksRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getOffset, ListResolveTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResolveTasksRequest::getLimit, ListResolveTasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMenusRequest, ListMenusResponse> listMenus = genForListMenus();

    private static HttpRequestDef<ListMenusRequest, ListMenusResponse> genForListMenus() {
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
            f -> f.withMarshaller(ListMenusRequest::getMenuId, ListMenusRequest::setMenuId));
        builder.<String>withRequestField("pub_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getPubId, ListMenusRequest::setPubId));
        builder.<String>withRequestField("pub_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getPubName, ListMenusRequest::setPubName));
        builder.<String>withRequestField("online_begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getOnlineBeginTime, ListMenusRequest::setOnlineBeginTime));
        builder.<String>withRequestField("online_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getOnlineEndTime, ListMenusRequest::setOnlineEndTime));
        builder.<Integer>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMenusRequest::getState, ListMenusRequest::setState));
        builder.<String>withRequestField("menu_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMenusRequest::getMenuName, ListMenusRequest::setMenuName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMenusRequest::getOffset, ListMenusRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMenusRequest::getLimit, ListMenusRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMenuRequest, UpdateMenuResponse> updateMenu = genForUpdateMenu();

    private static HttpRequestDef<UpdateMenuRequest, UpdateMenuResponse> genForUpdateMenu() {
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
            f -> f.withMarshaller(UpdateMenuRequest::getMenuId, UpdateMenuRequest::setMenuId));
        builder.<UpdateMenuRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMenuRequestBody.class),
            f -> f.withMarshaller(UpdateMenuRequest::getBody, UpdateMenuRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePortInfoRequest, DeletePortInfoResponse> deletePortInfo =
        genForDeletePortInfo();

    private static HttpRequestDef<DeletePortInfoRequest, DeletePortInfoResponse> genForDeletePortInfo() {
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
            f -> f.withMarshaller(DeletePortInfoRequest::getPortId, DeletePortInfoRequest::setPortId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortInfosRequest, ListPortInfosResponse> listPortInfos =
        genForListPortInfos();

    private static HttpRequestDef<ListPortInfosRequest, ListPortInfosResponse> genForListPortInfos() {
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
            f -> f.withMarshaller(ListPortInfosRequest::getType, ListPortInfosRequest::setType));
        builder.<String>withRequestField("port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortInfosRequest::getPort, ListPortInfosRequest::setPort));
        builder.<Integer>withRequestField("port_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortInfosRequest::getPortType, ListPortInfosRequest::setPortType));
        builder.<String>withRequestField("sign_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortInfosRequest::getSignSearch, ListPortInfosRequest::setSignSearch));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortInfosRequest::getOffset, ListPortInfosRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortInfosRequest::getLimit, ListPortInfosRequest::setLimit));
        builder.<OffsetDateTime>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPortInfosRequest::getStartTime, ListPortInfosRequest::setStartTime));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPortInfosRequest::getEndTime, ListPortInfosRequest::setEndTime));
        builder.<String>withRequestField("pub_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPortInfosRequest::getPubName, ListPortInfosRequest::setPubName));
        builder.<Integer>withRequestField("is_bind",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortInfosRequest::getIsBind, ListPortInfosRequest::setIsBind));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LockPortRequest, LockPortResponse> lockPort = genForLockPort();

    private static HttpRequestDef<LockPortRequest, LockPortResponse> genForLockPort() {
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
            f -> f.withMarshaller(LockPortRequest::getBody, LockPortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterPortRequest, RegisterPortResponse> registerPort = genForRegisterPort();

    private static HttpRequestDef<RegisterPortRequest, RegisterPortResponse> genForRegisterPort() {
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
            f -> f.withMarshaller(RegisterPortRequest::getBody, RegisterPortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnlockPortRequest, UnlockPortResponse> unlockPort = genForUnlockPort();

    private static HttpRequestDef<UnlockPortRequest, UnlockPortResponse> genForUnlockPort() {
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
            f -> f.withMarshaller(UnlockPortRequest::getBody, UnlockPortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPortalInfosRequest, ListPortalInfosResponse> listPortalInfos =
        genForListPortalInfos();

    private static HttpRequestDef<ListPortalInfosRequest, ListPortalInfosResponse> genForListPortalInfos() {
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
            f -> f.withMarshaller(ListPortalInfosRequest::getPubName, ListPortalInfosRequest::setPubName));
        builder.<OffsetDateTime>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getBeginTime, ListPortalInfosRequest::setBeginTime));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getEndTime, ListPortalInfosRequest::setEndTime));
        builder.<Integer>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getState, ListPortalInfosRequest::setState));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getLimit, ListPortalInfosRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPortalInfosRequest::getOffset, ListPortalInfosRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePortalInfoRequest, UpdatePortalInfoResponse> updatePortalInfo =
        genForUpdatePortalInfo();

    private static HttpRequestDef<UpdatePortalInfoRequest, UpdatePortalInfoResponse> genForUpdatePortalInfo() {
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
            f -> f.withMarshaller(UpdatePortalInfoRequest::getPortalId, UpdatePortalInfoRequest::setPortalId));
        builder.<UpdatePortalInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePortalInfoRequestBody.class),
            f -> f.withMarshaller(UpdatePortalInfoRequest::getBody, UpdatePortalInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<FreezePubRequest, FreezePubResponse> freezePub = genForFreezePub();

    private static HttpRequestDef<FreezePubRequest, FreezePubResponse> genForFreezePub() {
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
            f -> f.withMarshaller(FreezePubRequest::getPubId, FreezePubRequest::setPubId));
        builder.<FreezePubRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FreezePubRequestBody.class),
            f -> f.withMarshaller(FreezePubRequest::getBody, FreezePubRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPubInfosRequest, ListPubInfosResponse> listPubInfos = genForListPubInfos();

    private static HttpRequestDef<ListPubInfosRequest, ListPubInfosResponse> genForListPubInfos() {
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
            f -> f.withMarshaller(ListPubInfosRequest::getPubName, ListPubInfosRequest::setPubName));
        builder.<Integer>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubInfosRequest::getState, ListPubInfosRequest::setState));
        builder.<OffsetDateTime>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPubInfosRequest::getStartTime, ListPubInfosRequest::setStartTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubInfosRequest::getOffset, ListPubInfosRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubInfosRequest::getLimit, ListPubInfosRequest::setLimit));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPubInfosRequest::getEndTime, ListPubInfosRequest::setEndTime));
        builder.<String>withRequestField("industry",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPubInfosRequest::getIndustry, ListPubInfosRequest::setIndustry));
        builder.<Integer>withRequestField("approve_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPubInfosRequest::getApproveState, ListPubInfosRequest::setApproveState));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnfreezePubRequest, UnfreezePubResponse> unfreezePub = genForUnfreezePub();

    private static HttpRequestDef<UnfreezePubRequest, UnfreezePubResponse> genForUnfreezePub() {
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
            f -> f.withMarshaller(UnfreezePubRequest::getPubId, UnfreezePubRequest::setPubId));
        builder.<UnfreezePubRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UnfreezePubRequestBody.class),
            f -> f.withMarshaller(UnfreezePubRequest::getBody, UnfreezePubRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePubInfoRequest, UpdatePubInfoResponse> updatePubInfo =
        genForUpdatePubInfo();

    private static HttpRequestDef<UpdatePubInfoRequest, UpdatePubInfoResponse> genForUpdatePubInfo() {
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
            f -> f.withMarshaller(UpdatePubInfoRequest::getPubId, UpdatePubInfoRequest::setPubId));
        builder.<UpdatePubInfoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePubInfoRequestBody.class),
            f -> f.withMarshaller(UpdatePubInfoRequest::getBody, UpdatePubInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePubInfoRequest, CreatePubInfoResponse> createPubInfo =
        genForCreatePubInfo();

    private static HttpRequestDef<CreatePubInfoRequest, CreatePubInfoResponse> genForCreatePubInfo() {
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
            f -> f.withMarshaller(CreatePubInfoRequest::getBody, CreatePubInfoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushMenuInfoRequest, PushMenuInfoResponse> pushMenuInfo = genForPushMenuInfo();

    private static HttpRequestDef<PushMenuInfoRequest, PushMenuInfoResponse> genForPushMenuInfo() {
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
            f -> f.withMarshaller(PushMenuInfoRequest::getMenuId, PushMenuInfoRequest::setMenuId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PushPortalInfoRequest, PushPortalInfoResponse> pushPortalInfo =
        genForPushPortalInfo();

    private static HttpRequestDef<PushPortalInfoRequest, PushPortalInfoResponse> genForPushPortalInfo() {
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
            f -> f.withMarshaller(PushPortalInfoRequest::getPortalId, PushPortalInfoRequest::setPortalId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadMediaRequest, UploadMediaResponse> uploadMedia = genForUploadMedia();

    private static HttpRequestDef<UploadMediaRequest, UploadMediaResponse> genForUploadMedia() {
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
            f -> f.withMarshaller(UploadMediaRequest::getBody, UploadMediaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAimSendTaskRequest, CreateAimSendTaskResponse> createAimSendTask =
        genForCreateAimSendTask();

    private static HttpRequestDef<CreateAimSendTaskRequest, CreateAimSendTaskResponse> genForCreateAimSendTask() {
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
            f -> f.withMarshaller(CreateAimSendTaskRequest::getBody, CreateAimSendTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimSendDetailsRequest, ListAimSendDetailsResponse> listAimSendDetails =
        genForListAimSendDetails();

    private static HttpRequestDef<ListAimSendDetailsRequest, ListAimSendDetailsResponse> genForListAimSendDetails() {
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
            f -> f.withMarshaller(ListAimSendDetailsRequest::getTaskId, ListAimSendDetailsRequest::setTaskId));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getTplId, ListAimSendDetailsRequest::setTplId));
        builder.<String>withRequestField("sms_sign",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getSmsSign, ListAimSendDetailsRequest::setSmsSign));
        builder.<String>withRequestField("cust_flag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getCustFlag, ListAimSendDetailsRequest::setCustFlag));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getBeginTime, ListAimSendDetailsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getEndTime, ListAimSendDetailsRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getOffset, ListAimSendDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimSendDetailsRequest::getLimit, ListAimSendDetailsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimSendReportsRequest, ListAimSendReportsResponse> listAimSendReports =
        genForListAimSendReports();

    private static HttpRequestDef<ListAimSendReportsRequest, ListAimSendReportsResponse> genForListAimSendReports() {
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
            f -> f.withMarshaller(ListAimSendReportsRequest::getBody, ListAimSendReportsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimSendTasksRequest, ListAimSendTasksResponse> listAimSendTasks =
        genForListAimSendTasks();

    private static HttpRequestDef<ListAimSendTasksRequest, ListAimSendTasksResponse> genForListAimSendTasks() {
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
            f -> f.withMarshaller(ListAimSendTasksRequest::getTaskId, ListAimSendTasksRequest::setTaskId));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTaskName, ListAimSendTasksRequest::setTaskName));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTplId, ListAimSendTasksRequest::setTplId));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTplName, ListAimSendTasksRequest::setTplName));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getBeginTime, ListAimSendTasksRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getEndTime, ListAimSendTasksRequest::setEndTime));
        builder.<String>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getTaskStatus, ListAimSendTasksRequest::setTaskStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getOffset, ListAimSendTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimSendTasksRequest::getLimit, ListAimSendTasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSmsAppRequest, CreateSmsAppResponse> createSmsApp = genForCreateSmsApp();

    private static HttpRequestDef<CreateSmsAppRequest, CreateSmsAppResponse> genForCreateSmsApp() {
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
            f -> f.withMarshaller(CreateSmsAppRequest::getBody, CreateSmsAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimMsgAppRequest, ListAimMsgAppResponse> listAimMsgApp =
        genForListAimMsgApp();

    private static HttpRequestDef<ListAimMsgAppRequest, ListAimMsgAppResponse> genForListAimMsgApp() {
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
            f -> f.withMarshaller(ListAimMsgAppRequest::getOffset, ListAimMsgAppRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimMsgAppRequest::getLimit, ListAimMsgAppRequest::setLimit));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgAppRequest::getAppName, ListAimMsgAppRequest::setAppName));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgAppRequest::getStatus, ListAimMsgAppRequest::setStatus));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgAppRequest::getBeginTime, ListAimMsgAppRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgAppRequest::getEndTime, ListAimMsgAppRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimMsgAppDetailRequest, ListAimMsgAppDetailResponse> listAimMsgAppDetail =
        genForListAimMsgAppDetail();

    private static HttpRequestDef<ListAimMsgAppDetailRequest, ListAimMsgAppDetailResponse> genForListAimMsgAppDetail() {
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
            f -> f.withMarshaller(ListAimMsgAppDetailRequest::getAppId, ListAimMsgAppDetailRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAimMsgAppRequest, UpdateAimMsgAppResponse> updateAimMsgApp =
        genForUpdateAimMsgApp();

    private static HttpRequestDef<UpdateAimMsgAppRequest, UpdateAimMsgAppResponse> genForUpdateAimMsgApp() {
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
            f -> f.withMarshaller(UpdateAimMsgAppRequest::getAppId, UpdateAimMsgAppRequest::setAppId));
        builder.<MsgAppRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MsgAppRequest.class),
            f -> f.withMarshaller(UpdateAimMsgAppRequest::getBody, UpdateAimMsgAppRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendAimBatchDifferentMessagesRequest, SendAimBatchDifferentMessagesResponse> sendAimBatchDifferentMessages =
        genForSendAimBatchDifferentMessages();

    private static HttpRequestDef<SendAimBatchDifferentMessagesRequest, SendAimBatchDifferentMessagesResponse> genForSendAimBatchDifferentMessages() {
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
            f -> f.withMarshaller(SendAimBatchDifferentMessagesRequest::getBody,
                SendAimBatchDifferentMessagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SendAimBatchMessagesRequest, SendAimBatchMessagesResponse> sendAimBatchMessages =
        genForSendAimBatchMessages();

    private static HttpRequestDef<SendAimBatchMessagesRequest, SendAimBatchMessagesResponse> genForSendAimBatchMessages() {
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
            f -> f.withMarshaller(SendAimBatchMessagesRequest::getBody, SendAimBatchMessagesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddAimMsgSignatureRequest, AddAimMsgSignatureResponse> addAimMsgSignature =
        genForAddAimMsgSignature();

    private static HttpRequestDef<AddAimMsgSignatureRequest, AddAimMsgSignatureResponse> genForAddAimMsgSignature() {
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
            f -> f.withMarshaller(AddAimMsgSignatureRequest::getBody, AddAimMsgSignatureRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAimMsgSignatureRequest, DeleteAimMsgSignatureResponse> deleteAimMsgSignature =
        genForDeleteAimMsgSignature();

    private static HttpRequestDef<DeleteAimMsgSignatureRequest, DeleteAimMsgSignatureResponse> genForDeleteAimMsgSignature() {
        // basic
        HttpRequestDef.Builder<DeleteAimMsgSignatureRequest, DeleteAimMsgSignatureResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAimMsgSignatureRequest.class, DeleteAimMsgSignatureResponse.class)
            .withName("DeleteAimMsgSignature")
            .withUri("/v1/sms/signatures/{signature_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("signature_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAimMsgSignatureRequest::getSignatureId,
                DeleteAimMsgSignatureRequest::setSignatureId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimMsgSignatureRequest, ListAimMsgSignatureResponse> listAimMsgSignature =
        genForListAimMsgSignature();

    private static HttpRequestDef<ListAimMsgSignatureRequest, ListAimMsgSignatureResponse> genForListAimMsgSignature() {
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
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getAppName, ListAimMsgSignatureRequest::setAppName));
        builder.<String>withRequestField("signature_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getSignatureId,
                ListAimMsgSignatureRequest::setSignatureId));
        builder.<String>withRequestField("signature_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getSignatureName,
                ListAimMsgSignatureRequest::setSignatureName));
        builder.<String>withRequestField("signature_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getSignatureType,
                ListAimMsgSignatureRequest::setSignatureType));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getBeginTime, ListAimMsgSignatureRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getEndTime, ListAimMsgSignatureRequest::setEndTime));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getStatus, ListAimMsgSignatureRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getLimit, ListAimMsgSignatureRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgSignatureRequest::getOffset, ListAimMsgSignatureRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimMsgSignatureDetailRequest, ListAimMsgSignatureDetailResponse> listAimMsgSignatureDetail =
        genForListAimMsgSignatureDetail();

    private static HttpRequestDef<ListAimMsgSignatureDetailRequest, ListAimMsgSignatureDetailResponse> genForListAimMsgSignatureDetail() {
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
            f -> f.withMarshaller(ListAimMsgSignatureDetailRequest::getSignatureId,
                ListAimMsgSignatureDetailRequest::setSignatureId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAimMsgSignatureFileInfoRequest, ShowAimMsgSignatureFileInfoResponse> showAimMsgSignatureFileInfo =
        genForShowAimMsgSignatureFileInfo();

    private static HttpRequestDef<ShowAimMsgSignatureFileInfoRequest, ShowAimMsgSignatureFileInfoResponse> genForShowAimMsgSignatureFileInfo() {
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
            f -> f.withMarshaller(ShowAimMsgSignatureFileInfoRequest::getFileId,
                ShowAimMsgSignatureFileInfoRequest::setFileId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAimMsgSignatureFileInfoRequest::getOffset,
                ShowAimMsgSignatureFileInfoRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAimMsgSignatureFileInfoRequest::getLimit,
                ShowAimMsgSignatureFileInfoRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAimMsgSignatureRequest, UpdateAimMsgSignatureResponse> updateAimMsgSignature =
        genForUpdateAimMsgSignature();

    private static HttpRequestDef<UpdateAimMsgSignatureRequest, UpdateAimMsgSignatureResponse> genForUpdateAimMsgSignature() {
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
            f -> f.withMarshaller(UpdateAimMsgSignatureRequest::getSignatureId,
                UpdateAimMsgSignatureRequest::setSignatureId));
        builder.<SignatureRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SignatureRequest.class),
            f -> f.withMarshaller(UpdateAimMsgSignatureRequest::getBody, UpdateAimMsgSignatureRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAimMsgSignatureFileRequest, UploadAimMsgSignatureFileResponse> uploadAimMsgSignatureFile =
        genForUploadAimMsgSignatureFile();

    private static HttpRequestDef<UploadAimMsgSignatureFileRequest, UploadAimMsgSignatureFileResponse> genForUploadAimMsgSignatureFile() {
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
            f -> f.withMarshaller(UploadAimMsgSignatureFileRequest::getFileDesc,
                UploadAimMsgSignatureFileRequest::setFileDesc));
        builder.<UploadAimMsgSignatureFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadAimMsgSignatureFileRequestBody.class),
            f -> f.withMarshaller(UploadAimMsgSignatureFileRequest::getBody,
                UploadAimMsgSignatureFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAimMsgTemplateRequest, CreateAimMsgTemplateResponse> createAimMsgTemplate =
        genForCreateAimMsgTemplate();

    private static HttpRequestDef<CreateAimMsgTemplateRequest, CreateAimMsgTemplateResponse> genForCreateAimMsgTemplate() {
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
            f -> f.withMarshaller(CreateAimMsgTemplateRequest::getBody, CreateAimMsgTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAimMsgTemplateRequest, DeleteAimMsgTemplateResponse> deleteAimMsgTemplate =
        genForDeleteAimMsgTemplate();

    private static HttpRequestDef<DeleteAimMsgTemplateRequest, DeleteAimMsgTemplateResponse> genForDeleteAimMsgTemplate() {
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
            f -> f.withMarshaller(DeleteAimMsgTemplateRequest::getTemplateId,
                DeleteAimMsgTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimMsgTemplateRequest, ListAimMsgTemplateResponse> listAimMsgTemplate =
        genForListAimMsgTemplate();

    private static HttpRequestDef<ListAimMsgTemplateRequest, ListAimMsgTemplateResponse> genForListAimMsgTemplate() {
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
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getOffset, ListAimMsgTemplateRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getLimit, ListAimMsgTemplateRequest::setLimit));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getAppName, ListAimMsgTemplateRequest::setAppName));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getStartTime, ListAimMsgTemplateRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getEndTime, ListAimMsgTemplateRequest::setEndTime));
        builder.<ListAimMsgTemplateRequest.FlowStatusEnum>withRequestField("flow_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAimMsgTemplateRequest.FlowStatusEnum.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getFlowStatus, ListAimMsgTemplateRequest::setFlowStatus));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getTemplateId, ListAimMsgTemplateRequest::setTemplateId));
        builder.<String>withRequestField("template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getTemplateName,
                ListAimMsgTemplateRequest::setTemplateName));
        builder.<ListAimMsgTemplateRequest.TemplateTypeEnum>withRequestField("template_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAimMsgTemplateRequest.TemplateTypeEnum.class),
            f -> f.withMarshaller(ListAimMsgTemplateRequest::getTemplateType,
                ListAimMsgTemplateRequest::setTemplateType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAimMsgTemplateDetailRequest, ShowAimMsgTemplateDetailResponse> showAimMsgTemplateDetail =
        genForShowAimMsgTemplateDetail();

    private static HttpRequestDef<ShowAimMsgTemplateDetailRequest, ShowAimMsgTemplateDetailResponse> genForShowAimMsgTemplateDetail() {
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
            f -> f.withMarshaller(ShowAimMsgTemplateDetailRequest::getTemplateId,
                ShowAimMsgTemplateDetailRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAimMsgTemplateVariableRequest, ShowAimMsgTemplateVariableResponse> showAimMsgTemplateVariable =
        genForShowAimMsgTemplateVariable();

    private static HttpRequestDef<ShowAimMsgTemplateVariableRequest, ShowAimMsgTemplateVariableResponse> genForShowAimMsgTemplateVariable() {
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
            f -> f.withMarshaller(ShowAimMsgTemplateVariableRequest::getTemplateId,
                ShowAimMsgTemplateVariableRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAimMsgTemplateRequest, UpdateAimMsgTemplateResponse> updateAimMsgTemplate =
        genForUpdateAimMsgTemplate();

    private static HttpRequestDef<UpdateAimMsgTemplateRequest, UpdateAimMsgTemplateResponse> genForUpdateAimMsgTemplate() {
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
            f -> f.withMarshaller(UpdateAimMsgTemplateRequest::getTemplateId,
                UpdateAimMsgTemplateRequest::setTemplateId));
        builder.<MsgTemplateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MsgTemplateRequest.class),
            f -> f.withMarshaller(UpdateAimMsgTemplateRequest::getBody, UpdateAimMsgTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse> createAimPersonalTemplate =
        genForCreateAimPersonalTemplate();

    private static HttpRequestDef<CreateAimPersonalTemplateRequest, CreateAimPersonalTemplateResponse> genForCreateAimPersonalTemplate() {
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
            f -> f.withMarshaller(CreateAimPersonalTemplateRequest::getBody,
                CreateAimPersonalTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse> deleteAimPersonalTemplate =
        genForDeleteAimPersonalTemplate();

    private static HttpRequestDef<DeleteAimPersonalTemplateRequest, DeleteAimPersonalTemplateResponse> genForDeleteAimPersonalTemplate() {
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
            f -> f.withMarshaller(DeleteAimPersonalTemplateRequest::getTplId,
                DeleteAimPersonalTemplateRequest::setTplId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse> deleteTemplateMaterial =
        genForDeleteTemplateMaterial();

    private static HttpRequestDef<DeleteTemplateMaterialRequest, DeleteTemplateMaterialResponse> genForDeleteTemplateMaterial() {
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
            f -> f.withMarshaller(DeleteTemplateMaterialRequest::getBody, DeleteTemplateMaterialRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse> listAimTemplateMaterials =
        genForListAimTemplateMaterials();

    private static HttpRequestDef<ListAimTemplateMaterialsRequest, ListAimTemplateMaterialsResponse> genForListAimTemplateMaterials() {
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
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getResourceType,
                ListAimTemplateMaterialsRequest::setResourceType));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getFileName,
                ListAimTemplateMaterialsRequest::setFileName));
        builder.<String>withRequestField("material_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getMaterialId,
                ListAimTemplateMaterialsRequest::setMaterialId));
        builder.<String>withRequestField("aim_resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getAimResourceId,
                ListAimTemplateMaterialsRequest::setAimResourceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getOffset,
                ListAimTemplateMaterialsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimTemplateMaterialsRequest::getLimit,
                ListAimTemplateMaterialsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse> listAimTemplateReports =
        genForListAimTemplateReports();

    private static HttpRequestDef<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse> genForListAimTemplateReports() {
        // basic
        HttpRequestDef.Builder<ListAimTemplateReportsRequest, ListAimTemplateReportsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListAimTemplateReportsRequest.class, ListAimTemplateReportsResponse.class)
            .withName("ListAimTemplateReports")
            .withUri("/v1/aim/template-reports/query")
            .withContentType("application/json");

        // requests
        builder.<ListAimTemplateReportsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAimTemplateReportsRequestBody.class),
            f -> f.withMarshaller(ListAimTemplateReportsRequest::getBody, ListAimTemplateReportsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAimTemplatesRequest, ListAimTemplatesResponse> listAimTemplates =
        genForListAimTemplates();

    private static HttpRequestDef<ListAimTemplatesRequest, ListAimTemplatesResponse> genForListAimTemplates() {
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
            f -> f.withMarshaller(ListAimTemplatesRequest::getTplId, ListAimTemplatesRequest::setTplId));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getTplName, ListAimTemplatesRequest::setTplName));
        builder.<String>withRequestField("tpl_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getTplType, ListAimTemplatesRequest::setTplType));
        builder.<List<String>>withRequestField("factory_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getFactoryType, ListAimTemplatesRequest::setFactoryType));
        builder.<Boolean>withRequestField("has_param",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getHasParam, ListAimTemplatesRequest::setHasParam));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getBeginTime, ListAimTemplatesRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getEndTime, ListAimTemplatesRequest::setEndTime));
        builder.<Boolean>withRequestField("is_only_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getIsOnlyStatus, ListAimTemplatesRequest::setIsOnlyStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getOffset, ListAimTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAimTemplatesRequest::getLimit, ListAimTemplatesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetPrimaryVideoThumbnailRequest, SetPrimaryVideoThumbnailResponse> setPrimaryVideoThumbnail =
        genForSetPrimaryVideoThumbnail();

    private static HttpRequestDef<SetPrimaryVideoThumbnailRequest, SetPrimaryVideoThumbnailResponse> genForSetPrimaryVideoThumbnail() {
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
            f -> f.withMarshaller(SetPrimaryVideoThumbnailRequest::getBody, SetPrimaryVideoThumbnailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateVideoThumbnailRequest, ShowTemplateVideoThumbnailResponse> showTemplateVideoThumbnail =
        genForShowTemplateVideoThumbnail();

    private static HttpRequestDef<ShowTemplateVideoThumbnailRequest, ShowTemplateVideoThumbnailResponse> genForShowTemplateVideoThumbnail() {
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
            f -> f.withMarshaller(ShowTemplateVideoThumbnailRequest::getAimResourceId,
                ShowTemplateVideoThumbnailRequest::setAimResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse> updatePersonalTemplateState =
        genForUpdatePersonalTemplateState();

    private static HttpRequestDef<UpdatePersonalTemplateStateRequest, UpdatePersonalTemplateStateResponse> genForUpdatePersonalTemplateState() {
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
            f -> f.withMarshaller(UpdatePersonalTemplateStateRequest::getTplId,
                UpdatePersonalTemplateStateRequest::setTplId));
        builder.<UpdatePersonalTemplateStateDataRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePersonalTemplateStateDataRequest.class),
            f -> f.withMarshaller(UpdatePersonalTemplateStateRequest::getBody,
                UpdatePersonalTemplateStateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse> uploadAimTemplateMaterial =
        genForUploadAimTemplateMaterial();

    private static HttpRequestDef<UploadAimTemplateMaterialRequest, UploadAimTemplateMaterialResponse> genForUploadAimTemplateMaterial() {
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
            f -> f.withMarshaller(UploadAimTemplateMaterialRequest::getBody,
                UploadAimTemplateMaterialRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddVmsCallBackRequest, AddVmsCallBackResponse> addVmsCallBack =
        genForAddVmsCallBack();

    private static HttpRequestDef<AddVmsCallBackRequest, AddVmsCallBackResponse> genForAddVmsCallBack() {
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
            f -> f.withMarshaller(AddVmsCallBackRequest::getBody, AddVmsCallBackRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse> createVmsSendTask =
        genForCreateVmsSendTask();

    private static HttpRequestDef<CreateVmsSendTaskRequest, CreateVmsSendTaskResponse> genForCreateVmsSendTask() {
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
            f -> f.withMarshaller(CreateVmsSendTaskRequest::getBody, CreateVmsSendTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVmsCallbacksRequest, ListVmsCallbacksResponse> listVmsCallbacks =
        genForListVmsCallbacks();

    private static HttpRequestDef<ListVmsCallbacksRequest, ListVmsCallbacksResponse> genForListVmsCallbacks() {
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
        genForListVmsSendTasks();

    private static HttpRequestDef<ListVmsSendTasksRequest, ListVmsSendTasksResponse> genForListVmsSendTasks() {
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
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTaskName, ListVmsSendTasksRequest::setTaskName));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTaskId, ListVmsSendTasksRequest::setTaskId));
        builder.<String>withRequestField("tpl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTplId, ListVmsSendTasksRequest::setTplId));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTplName, ListVmsSendTasksRequest::setTplName));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getBeginTime, ListVmsSendTasksRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getEndTime, ListVmsSendTasksRequest::setEndTime));
        builder.<String>withRequestField("send_begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getSendBeginTime,
                ListVmsSendTasksRequest::setSendBeginTime));
        builder.<String>withRequestField("send_end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getSendEndTime, ListVmsSendTasksRequest::setSendEndTime));
        builder.<String>withRequestField("operator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getOperator, ListVmsSendTasksRequest::setOperator));
        builder.<String>withRequestField("task_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getTaskStatus, ListVmsSendTasksRequest::setTaskStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getOffset, ListVmsSendTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVmsSendTasksRequest::getLimit, ListVmsSendTasksRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVmsTemplateRequest, CreateVmsTemplateResponse> createVmsTemplate =
        genForCreateVmsTemplate();

    private static HttpRequestDef<CreateVmsTemplateRequest, CreateVmsTemplateResponse> genForCreateVmsTemplate() {
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
            f -> f.withMarshaller(CreateVmsTemplateRequest::getBody, CreateVmsTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse> listVmsTemplateStatus =
        genForListVmsTemplateStatus();

    private static HttpRequestDef<ListVmsTemplateStatusRequest, ListVmsTemplateStatusResponse> genForListVmsTemplateStatus() {
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
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getTplId, ListVmsTemplateStatusRequest::setTplId));
        builder.<String>withRequestField("tpl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getTplName, ListVmsTemplateStatusRequest::setTplName));
        builder.<String>withRequestField("tpl_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getTplType, ListVmsTemplateStatusRequest::setTplType));
        builder.<Boolean>withRequestField("has_param",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getHasParam,
                ListVmsTemplateStatusRequest::setHasParam));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getBeginTime,
                ListVmsTemplateStatusRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getEndTime, ListVmsTemplateStatusRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getOffset, ListVmsTemplateStatusRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVmsTemplateStatusRequest::getLimit, ListVmsTemplateStatusRequest::setLimit));

        // response

        return builder.build();
    }

}
