package com.huaweicloud.sdk.waf.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.waf.v1.model.ApplyCertificateToHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ApplyCertificateToHostRequestBody;
import com.huaweicloud.sdk.waf.v1.model.ApplyCertificateToHostResponse;
import com.huaweicloud.sdk.waf.v1.model.BandwidthStatisticsTimelineItem;
import com.huaweicloud.sdk.waf.v1.model.ChangePrepaidCloudWafRequest;
import com.huaweicloud.sdk.waf.v1.model.ChangePrepaidCloudWafRequestBody;
import com.huaweicloud.sdk.waf.v1.model.ChangePrepaidCloudWafResponse;
import com.huaweicloud.sdk.waf.v1.model.CountItem;
import com.huaweicloud.sdk.waf.v1.model.CreateAntiTamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAntiTamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAntiTamperRulesRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAnticrawlerRuleRequestbody;
import com.huaweicloud.sdk.waf.v1.model.CreateAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateAntileakageRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCcRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCertificateRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCloudWafPostPaidResourceRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCloudWafPostPaidResourceRequestbody;
import com.huaweicloud.sdk.waf.v1.model.CreateCloudWafPostPaidResourceResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateCustomRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateGeoIpRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateHostRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateHostRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateHostResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateIgnoreRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateInstanceRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateIpGroupRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePolicyRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePremiumHostRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreatePremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePrepaidCloudWafRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePrepaidCloudWafRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreatePrepaidCloudWafResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePrivacyRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreatePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreatePunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreatePunishmentRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreatePunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateValueListRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.CreateWhiteBlackIpRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.CreateWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.CreateWhiteblackipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntitamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteAntitamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCloudWafPostPaidResourceRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCloudWafPostPaidResourceResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteHostRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteHostResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeletePunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeletePunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.DeleteWhiteBlackIpRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.DeleteWhiteBlackIpRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAnticrawlerRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAnticrawlerRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakageRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntileakageRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListAntitamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListAntitamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListBandwidthTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListBandwidthTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCcRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCcRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCertificatesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCertificatesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCompositeHostsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCompositeHostsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListCustomRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListCustomRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListEventRequest;
import com.huaweicloud.sdk.waf.v1.model.ListEventResponse;
import com.huaweicloud.sdk.waf.v1.model.ListGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ListHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ListHostRouteRequest;
import com.huaweicloud.sdk.waf.v1.model.ListHostRouteResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.ListInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.ListIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.ListIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.ListNoticeConfigsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListNoticeConfigsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListOverviewsClassificationRequest;
import com.huaweicloud.sdk.waf.v1.model.ListOverviewsClassificationResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ListPunishmentRulesRequest;
import com.huaweicloud.sdk.waf.v1.model.ListPunishmentRulesResponse;
import com.huaweicloud.sdk.waf.v1.model.ListQpsTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListQpsTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListRequestTimelineRequest;
import com.huaweicloud.sdk.waf.v1.model.ListRequestTimelineResponse;
import com.huaweicloud.sdk.waf.v1.model.ListStatisticsRequest;
import com.huaweicloud.sdk.waf.v1.model.ListStatisticsResponse;
import com.huaweicloud.sdk.waf.v1.model.ListTopAbnormalRequest;
import com.huaweicloud.sdk.waf.v1.model.ListTopAbnormalResponse;
import com.huaweicloud.sdk.waf.v1.model.ListValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.ListValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ListWhiteblackipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.MigrateCompositeHostsRequest;
import com.huaweicloud.sdk.waf.v1.model.MigrateCompositeHostsRequestBody;
import com.huaweicloud.sdk.waf.v1.model.MigrateCompositeHostsResponse;
import com.huaweicloud.sdk.waf.v1.model.RenameInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.RenameInstanceRequestBody;
import com.huaweicloud.sdk.waf.v1.model.RenameInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowAntitamperRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowAntitamperRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCompositeHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCompositeHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowConsoleConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowConsoleConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowEventRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowEventResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowInstanceRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowInstanceResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowLtsInfoConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowLtsInfoConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowPunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowPunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSourceIpRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSourceIpResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowSubscriptionInfoRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowSubscriptionInfoResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.ShowWhiteBlackIpRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.ShowWhiteBlackIpRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.StatisticsTimelineItem;
import com.huaweicloud.sdk.waf.v1.model.UpdateAlertNoticeConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAlertNoticeConfigRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateAlertNoticeConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntiTamperRuleRefreshRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntiTamperRuleRefreshResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleTypeRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleTypeRequestbody;
import com.huaweicloud.sdk.waf.v1.model.UpdateAnticrawlerRuleTypeResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntileakageRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntileakageRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateAntileakageRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateCcRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateCcRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateCcRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateCertificateRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateCustomRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateCustomRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateCustomRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateGeoipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateGeoipRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateGeoipRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostProtectStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostProtectStatusRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostProtectStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateHostResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateIgnoreRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateIgnoreRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateIgnoreRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpGroupRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpGroupRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateIpGroupResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateLtsInfoConfigRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateLtsInfoConfigRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateLtsInfoConfigResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyProtectHostRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyProtectHostResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRuleStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRuleStatusRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePolicyRuleStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostProtectStatusRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostProtectStatusRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostProtectStatusResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePremiumHostResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePrivacyRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePrivacyRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePrivacyRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdatePunishmentRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdatePunishmentRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdatePunishmentRuleResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateValueListRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateValueListRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateValueListResponse;
import com.huaweicloud.sdk.waf.v1.model.UpdateWhiteBlackIpRuleRequestBody;
import com.huaweicloud.sdk.waf.v1.model.UpdateWhiteblackipRuleRequest;
import com.huaweicloud.sdk.waf.v1.model.UpdateWhiteblackipRuleResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class WafMeta {

    public static final HttpRequestDef<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> applyCertificateToHost =
        genForApplyCertificateToHost();

    private static HttpRequestDef<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> genForApplyCertificateToHost() {
        // basic
        HttpRequestDef.Builder<ApplyCertificateToHostRequest, ApplyCertificateToHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ApplyCertificateToHostRequest.class, ApplyCertificateToHostResponse.class)
            .withName("ApplyCertificateToHost")
            .withUri("/v1/{project_id}/waf/certificate/{certificate_id}/apply-to-hosts")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyCertificateToHostRequest::getCertificateId,
                ApplyCertificateToHostRequest::setCertificateId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyCertificateToHostRequest::getEnterpriseProjectId,
                ApplyCertificateToHostRequest::setEnterpriseProjectId));
        builder.<ApplyCertificateToHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplyCertificateToHostRequestBody.class),
            f -> f.withMarshaller(ApplyCertificateToHostRequest::getBody, ApplyCertificateToHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> changePrepaidCloudWaf =
        genForChangePrepaidCloudWaf();

    private static HttpRequestDef<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> genForChangePrepaidCloudWaf() {
        // basic
        HttpRequestDef.Builder<ChangePrepaidCloudWafRequest, ChangePrepaidCloudWafResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangePrepaidCloudWafRequest.class, ChangePrepaidCloudWafResponse.class)
            .withName("ChangePrepaidCloudWaf")
            .withUri("/v1/{project_id}/waf/subscription/batchalter/prepaid-cloud-waf")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangePrepaidCloudWafRequest::getEnterpriseProjectId,
                ChangePrepaidCloudWafRequest::setEnterpriseProjectId));
        builder.<ChangePrepaidCloudWafRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePrepaidCloudWafRequestBody.class),
            f -> f.withMarshaller(ChangePrepaidCloudWafRequest::getBody, ChangePrepaidCloudWafRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> createAntiTamperRule =
        genForCreateAntiTamperRule();

    private static HttpRequestDef<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> genForCreateAntiTamperRule() {
        // basic
        HttpRequestDef.Builder<CreateAntiTamperRuleRequest, CreateAntiTamperRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAntiTamperRuleRequest.class, CreateAntiTamperRuleResponse.class)
            .withName("CreateAntiTamperRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntiTamperRuleRequest::getPolicyId, CreateAntiTamperRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntiTamperRuleRequest::getEnterpriseProjectId,
                CreateAntiTamperRuleRequest::setEnterpriseProjectId));
        builder.<CreateAntiTamperRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAntiTamperRulesRequestBody.class),
            f -> f.withMarshaller(CreateAntiTamperRuleRequest::getBody, CreateAntiTamperRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse> createAnticrawlerRule =
        genForCreateAnticrawlerRule();

    private static HttpRequestDef<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse> genForCreateAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<CreateAnticrawlerRuleRequest, CreateAnticrawlerRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAnticrawlerRuleRequest.class, CreateAnticrawlerRuleResponse.class)
            .withName("CreateAnticrawlerRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAnticrawlerRuleRequest::getPolicyId,
                CreateAnticrawlerRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAnticrawlerRuleRequest::getEnterpriseProjectId,
                CreateAnticrawlerRuleRequest::setEnterpriseProjectId));
        builder.<CreateAnticrawlerRuleRequestbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAnticrawlerRuleRequestbody.class),
            f -> f.withMarshaller(CreateAnticrawlerRuleRequest::getBody, CreateAnticrawlerRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse> createAntileakageRule =
        genForCreateAntileakageRule();

    private static HttpRequestDef<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse> genForCreateAntileakageRule() {
        // basic
        HttpRequestDef.Builder<CreateAntileakageRuleRequest, CreateAntileakageRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAntileakageRuleRequest.class, CreateAntileakageRuleResponse.class)
            .withName("CreateAntileakageRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntileakageRuleRequest::getPolicyId,
                CreateAntileakageRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAntileakageRuleRequest::getEnterpriseProjectId,
                CreateAntileakageRuleRequest::setEnterpriseProjectId));
        builder.<CreateAntileakageRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAntileakageRuleRequestBody.class),
            f -> f.withMarshaller(CreateAntileakageRuleRequest::getBody, CreateAntileakageRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCcRuleRequest, CreateCcRuleResponse> createCcRule = genForCreateCcRule();

    private static HttpRequestDef<CreateCcRuleRequest, CreateCcRuleResponse> genForCreateCcRule() {
        // basic
        HttpRequestDef.Builder<CreateCcRuleRequest, CreateCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCcRuleRequest.class, CreateCcRuleResponse.class)
                .withName("CreateCcRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCcRuleRequest::getPolicyId, CreateCcRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCcRuleRequest::getEnterpriseProjectId,
                CreateCcRuleRequest::setEnterpriseProjectId));
        builder.<CreateCcRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateCcRuleRequestBody.class),
            f -> f.withMarshaller(CreateCcRuleRequest::getBody, CreateCcRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate =
        genForCreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForCreateCertificate() {
        // basic
        HttpRequestDef.Builder<CreateCertificateRequest, CreateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateRequest.class, CreateCertificateResponse.class)
                .withName("CreateCertificate")
                .withUri("/v1/{project_id}/waf/certificate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCertificateRequest::getEnterpriseProjectId,
                CreateCertificateRequest::setEnterpriseProjectId));
        builder.<CreateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateRequestBody.class),
            f -> f.withMarshaller(CreateCertificateRequest::getBody, CreateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse> createCloudWafPostPaidResource =
        genForCreateCloudWafPostPaidResource();

    private static HttpRequestDef<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse> genForCreateCloudWafPostPaidResource() {
        // basic
        HttpRequestDef.Builder<CreateCloudWafPostPaidResourceRequest, CreateCloudWafPostPaidResourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateCloudWafPostPaidResourceRequest.class,
                    CreateCloudWafPostPaidResourceResponse.class)
                .withName("CreateCloudWafPostPaidResource")
                .withUri("/v1/{project_id}/waf/postpaid")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCloudWafPostPaidResourceRequest::getEnterpriseProjectId,
                CreateCloudWafPostPaidResourceRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCloudWafPostPaidResourceRequest::getRegion,
                CreateCloudWafPostPaidResourceRequest::setRegion));
        builder.<CreateCloudWafPostPaidResourceRequestbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCloudWafPostPaidResourceRequestbody.class),
            f -> f.withMarshaller(CreateCloudWafPostPaidResourceRequest::getBody,
                CreateCloudWafPostPaidResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomRuleRequest, CreateCustomRuleResponse> createCustomRule =
        genForCreateCustomRule();

    private static HttpRequestDef<CreateCustomRuleRequest, CreateCustomRuleResponse> genForCreateCustomRule() {
        // basic
        HttpRequestDef.Builder<CreateCustomRuleRequest, CreateCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCustomRuleRequest.class, CreateCustomRuleResponse.class)
                .withName("CreateCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomRuleRequest::getPolicyId, CreateCustomRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomRuleRequest::getEnterpriseProjectId,
                CreateCustomRuleRequest::setEnterpriseProjectId));
        builder.<CreateCustomRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCustomRuleRequestBody.class),
            f -> f.withMarshaller(CreateCustomRuleRequest::getBody, CreateCustomRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGeoipRuleRequest, CreateGeoipRuleResponse> createGeoipRule =
        genForCreateGeoipRule();

    private static HttpRequestDef<CreateGeoipRuleRequest, CreateGeoipRuleResponse> genForCreateGeoipRule() {
        // basic
        HttpRequestDef.Builder<CreateGeoipRuleRequest, CreateGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGeoipRuleRequest.class, CreateGeoipRuleResponse.class)
                .withName("CreateGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGeoipRuleRequest::getPolicyId, CreateGeoipRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGeoipRuleRequest::getEnterpriseProjectId,
                CreateGeoipRuleRequest::setEnterpriseProjectId));
        builder.<CreateGeoIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGeoIpRuleRequestBody.class),
            f -> f.withMarshaller(CreateGeoipRuleRequest::getBody, CreateGeoipRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHostRequest, CreateHostResponse> createHost = genForCreateHost();

    private static HttpRequestDef<CreateHostRequest, CreateHostResponse> genForCreateHost() {
        // basic
        HttpRequestDef.Builder<CreateHostRequest, CreateHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHostRequest.class, CreateHostResponse.class)
                .withName("CreateHost")
                .withUri("/v1/{project_id}/waf/instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHostRequest::getEnterpriseProjectId,
                CreateHostRequest::setEnterpriseProjectId));
        builder.<CreateHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHostRequestBody.class),
            f -> f.withMarshaller(CreateHostRequest::getBody, CreateHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> createIgnoreRule =
        genForCreateIgnoreRule();

    private static HttpRequestDef<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> genForCreateIgnoreRule() {
        // basic
        HttpRequestDef.Builder<CreateIgnoreRuleRequest, CreateIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIgnoreRuleRequest.class, CreateIgnoreRuleResponse.class)
                .withName("CreateIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIgnoreRuleRequest::getPolicyId, CreateIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIgnoreRuleRequest::getEnterpriseProjectId,
                CreateIgnoreRuleRequest::setEnterpriseProjectId));
        builder.<CreateIgnoreRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIgnoreRuleRequestBody.class),
            f -> f.withMarshaller(CreateIgnoreRuleRequest::getBody, CreateIgnoreRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v1/{project_id}/premium-waf/instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getEnterpriseProjectId,
                CreateInstanceRequest::setEnterpriseProjectId));
        builder.<CreateInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceRequestBody.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> createIpGroup =
        genForCreateIpGroup();

    private static HttpRequestDef<CreateIpGroupRequest, CreateIpGroupResponse> genForCreateIpGroup() {
        // basic
        HttpRequestDef.Builder<CreateIpGroupRequest, CreateIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIpGroupRequest.class, CreateIpGroupResponse.class)
                .withName("CreateIpGroup")
                .withUri("/v1/{project_id}/waf/ip-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIpGroupRequest::getEnterpriseProjectId,
                CreateIpGroupRequest::setEnterpriseProjectId));
        builder.<CreateIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIpGroupRequestBody.class),
            f -> f.withMarshaller(CreateIpGroupRequest::getBody, CreateIpGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForCreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForCreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreatePolicyRequest, CreatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyRequest.class, CreatePolicyResponse.class)
                .withName("CreatePolicy")
                .withUri("/v1/{project_id}/waf/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePolicyRequest::getEnterpriseProjectId,
                CreatePolicyRequest::setEnterpriseProjectId));
        builder.<CreatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyRequestBody.class),
            f -> f.withMarshaller(CreatePolicyRequest::getBody, CreatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePremiumHostRequest, CreatePremiumHostResponse> createPremiumHost =
        genForCreatePremiumHost();

    private static HttpRequestDef<CreatePremiumHostRequest, CreatePremiumHostResponse> genForCreatePremiumHost() {
        // basic
        HttpRequestDef.Builder<CreatePremiumHostRequest, CreatePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePremiumHostRequest.class, CreatePremiumHostResponse.class)
                .withName("CreatePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePremiumHostRequest::getEnterpriseProjectId,
                CreatePremiumHostRequest::setEnterpriseProjectId));
        builder.<CreatePremiumHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePremiumHostRequestBody.class),
            f -> f.withMarshaller(CreatePremiumHostRequest::getBody, CreatePremiumHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> createPrepaidCloudWaf =
        genForCreatePrepaidCloudWaf();

    private static HttpRequestDef<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> genForCreatePrepaidCloudWaf() {
        // basic
        HttpRequestDef.Builder<CreatePrepaidCloudWafRequest, CreatePrepaidCloudWafResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePrepaidCloudWafRequest.class, CreatePrepaidCloudWafResponse.class)
            .withName("CreatePrepaidCloudWaf")
            .withUri("/v1/{project_id}/waf/subscription/purchase/prepaid-cloud-waf")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrepaidCloudWafRequest::getEnterpriseProjectId,
                CreatePrepaidCloudWafRequest::setEnterpriseProjectId));
        builder.<CreatePrepaidCloudWafRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrepaidCloudWafRequestBody.class),
            f -> f.withMarshaller(CreatePrepaidCloudWafRequest::getBody, CreatePrepaidCloudWafRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> createPrivacyRule =
        genForCreatePrivacyRule();

    private static HttpRequestDef<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> genForCreatePrivacyRule() {
        // basic
        HttpRequestDef.Builder<CreatePrivacyRuleRequest, CreatePrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivacyRuleRequest.class, CreatePrivacyRuleResponse.class)
                .withName("CreatePrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivacyRuleRequest::getPolicyId, CreatePrivacyRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivacyRuleRequest::getEnterpriseProjectId,
                CreatePrivacyRuleRequest::setEnterpriseProjectId));
        builder.<CreatePrivacyRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrivacyRuleRequestBody.class),
            f -> f.withMarshaller(CreatePrivacyRuleRequest::getBody, CreatePrivacyRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse> createPunishmentRule =
        genForCreatePunishmentRule();

    private static HttpRequestDef<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse> genForCreatePunishmentRule() {
        // basic
        HttpRequestDef.Builder<CreatePunishmentRuleRequest, CreatePunishmentRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePunishmentRuleRequest.class, CreatePunishmentRuleResponse.class)
            .withName("CreatePunishmentRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePunishmentRuleRequest::getPolicyId, CreatePunishmentRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePunishmentRuleRequest::getEnterpriseProjectId,
                CreatePunishmentRuleRequest::setEnterpriseProjectId));
        builder.<CreatePunishmentRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePunishmentRuleRequestBody.class),
            f -> f.withMarshaller(CreatePunishmentRuleRequest::getBody, CreatePunishmentRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateValueListRequest, CreateValueListResponse> createValueList =
        genForCreateValueList();

    private static HttpRequestDef<CreateValueListRequest, CreateValueListResponse> genForCreateValueList() {
        // basic
        HttpRequestDef.Builder<CreateValueListRequest, CreateValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateValueListRequest.class, CreateValueListResponse.class)
                .withName("CreateValueList")
                .withUri("/v1/{project_id}/waf/valuelist")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateValueListRequest::getEnterpriseProjectId,
                CreateValueListRequest::setEnterpriseProjectId));
        builder.<CreateValueListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateValueListRequestBody.class),
            f -> f.withMarshaller(CreateValueListRequest::getBody, CreateValueListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> createWhiteblackipRule =
        genForCreateWhiteblackipRule();

    private static HttpRequestDef<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> genForCreateWhiteblackipRule() {
        // basic
        HttpRequestDef.Builder<CreateWhiteblackipRuleRequest, CreateWhiteblackipRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateWhiteblackipRuleRequest.class, CreateWhiteblackipRuleResponse.class)
            .withName("CreateWhiteblackipRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWhiteblackipRuleRequest::getPolicyId,
                CreateWhiteblackipRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWhiteblackipRuleRequest::getEnterpriseProjectId,
                CreateWhiteblackipRuleRequest::setEnterpriseProjectId));
        builder.<CreateWhiteBlackIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWhiteBlackIpRuleRequestBody.class),
            f -> f.withMarshaller(CreateWhiteblackipRuleRequest::getBody, CreateWhiteblackipRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> deleteAnticrawlerRule =
        genForDeleteAnticrawlerRule();

    private static HttpRequestDef<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> genForDeleteAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<DeleteAnticrawlerRuleRequest, DeleteAnticrawlerRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAnticrawlerRuleRequest.class, DeleteAnticrawlerRuleResponse.class)
            .withName("DeleteAnticrawlerRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnticrawlerRuleRequest::getPolicyId,
                DeleteAnticrawlerRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnticrawlerRuleRequest::getRuleId, DeleteAnticrawlerRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAnticrawlerRuleRequest::getEnterpriseProjectId,
                DeleteAnticrawlerRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> deleteAntileakageRule =
        genForDeleteAntileakageRule();

    private static HttpRequestDef<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> genForDeleteAntileakageRule() {
        // basic
        HttpRequestDef.Builder<DeleteAntileakageRuleRequest, DeleteAntileakageRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAntileakageRuleRequest.class, DeleteAntileakageRuleResponse.class)
            .withName("DeleteAntileakageRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntileakageRuleRequest::getPolicyId,
                DeleteAntileakageRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntileakageRuleRequest::getRuleId, DeleteAntileakageRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntileakageRuleRequest::getEnterpriseProjectId,
                DeleteAntileakageRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> deleteAntitamperRule =
        genForDeleteAntitamperRule();

    private static HttpRequestDef<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> genForDeleteAntitamperRule() {
        // basic
        HttpRequestDef.Builder<DeleteAntitamperRuleRequest, DeleteAntitamperRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAntitamperRuleRequest.class, DeleteAntitamperRuleResponse.class)
            .withName("DeleteAntitamperRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntitamperRuleRequest::getPolicyId, DeleteAntitamperRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntitamperRuleRequest::getRuleId, DeleteAntitamperRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAntitamperRuleRequest::getEnterpriseProjectId,
                DeleteAntitamperRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCcRuleRequest, DeleteCcRuleResponse> deleteCcRule = genForDeleteCcRule();

    private static HttpRequestDef<DeleteCcRuleRequest, DeleteCcRuleResponse> genForDeleteCcRule() {
        // basic
        HttpRequestDef.Builder<DeleteCcRuleRequest, DeleteCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCcRuleRequest.class, DeleteCcRuleResponse.class)
                .withName("DeleteCcRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCcRuleRequest::getPolicyId, DeleteCcRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCcRuleRequest::getRuleId, DeleteCcRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCcRuleRequest::getEnterpriseProjectId,
                DeleteCcRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genForDeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genForDeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withName("DeleteCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId,
                DeleteCertificateRequest::setCertificateId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getEnterpriseProjectId,
                DeleteCertificateRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse> deleteCloudWafPostPaidResource =
        genForDeleteCloudWafPostPaidResource();

    private static HttpRequestDef<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse> genForDeleteCloudWafPostPaidResource() {
        // basic
        HttpRequestDef.Builder<DeleteCloudWafPostPaidResourceRequest, DeleteCloudWafPostPaidResourceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCloudWafPostPaidResourceRequest.class,
                    DeleteCloudWafPostPaidResourceResponse.class)
                .withName("DeleteCloudWafPostPaidResource")
                .withUri("/v1/{project_id}/waf/postpaid")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudWafPostPaidResourceRequest::getEnterpriseProjectId,
                DeleteCloudWafPostPaidResourceRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("region",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudWafPostPaidResourceRequest::getRegion,
                DeleteCloudWafPostPaidResourceRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomRuleRequest, DeleteCustomRuleResponse> deleteCustomRule =
        genForDeleteCustomRule();

    private static HttpRequestDef<DeleteCustomRuleRequest, DeleteCustomRuleResponse> genForDeleteCustomRule() {
        // basic
        HttpRequestDef.Builder<DeleteCustomRuleRequest, DeleteCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCustomRuleRequest.class, DeleteCustomRuleResponse.class)
                .withName("DeleteCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRuleRequest::getPolicyId, DeleteCustomRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRuleRequest::getRuleId, DeleteCustomRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRuleRequest::getEnterpriseProjectId,
                DeleteCustomRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> deleteGeoipRule =
        genForDeleteGeoipRule();

    private static HttpRequestDef<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> genForDeleteGeoipRule() {
        // basic
        HttpRequestDef.Builder<DeleteGeoipRuleRequest, DeleteGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGeoipRuleRequest.class, DeleteGeoipRuleResponse.class)
                .withName("DeleteGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getPolicyId, DeleteGeoipRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getRuleId, DeleteGeoipRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGeoipRuleRequest::getEnterpriseProjectId,
                DeleteGeoipRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHostRequest, DeleteHostResponse> deleteHost = genForDeleteHost();

    private static HttpRequestDef<DeleteHostRequest, DeleteHostResponse> genForDeleteHost() {
        // basic
        HttpRequestDef.Builder<DeleteHostRequest, DeleteHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHostRequest.class, DeleteHostResponse.class)
                .withName("DeleteHost")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostRequest::getInstanceId, DeleteHostRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHostRequest::getEnterpriseProjectId,
                DeleteHostRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> deleteIgnoreRule =
        genForDeleteIgnoreRule();

    private static HttpRequestDef<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> genForDeleteIgnoreRule() {
        // basic
        HttpRequestDef.Builder<DeleteIgnoreRuleRequest, DeleteIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIgnoreRuleRequest.class, DeleteIgnoreRuleResponse.class)
                .withName("DeleteIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIgnoreRuleRequest::getPolicyId, DeleteIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIgnoreRuleRequest::getRuleId, DeleteIgnoreRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIgnoreRuleRequest::getEnterpriseProjectId,
                DeleteIgnoreRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v1/{project_id}/premium-waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getEnterpriseProjectId,
                DeleteInstanceRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> deleteIpGroup =
        genForDeleteIpGroup();

    private static HttpRequestDef<DeleteIpGroupRequest, DeleteIpGroupResponse> genForDeleteIpGroup() {
        // basic
        HttpRequestDef.Builder<DeleteIpGroupRequest, DeleteIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIpGroupRequest.class, DeleteIpGroupResponse.class)
                .withName("DeleteIpGroup")
                .withUri("/v1/{project_id}/waf/ip-group/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpGroupRequest::getId, DeleteIpGroupRequest::setId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpGroupRequest::getEnterpriseProjectId,
                DeleteIpGroupRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genForDeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genForDeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, DeletePolicyRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getEnterpriseProjectId,
                DeletePolicyRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePremiumHostRequest, DeletePremiumHostResponse> deletePremiumHost =
        genForDeletePremiumHost();

    private static HttpRequestDef<DeletePremiumHostRequest, DeletePremiumHostResponse> genForDeletePremiumHost() {
        // basic
        HttpRequestDef.Builder<DeletePremiumHostRequest, DeletePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePremiumHostRequest.class, DeletePremiumHostResponse.class)
                .withName("DeletePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePremiumHostRequest::getHostId, DeletePremiumHostRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePremiumHostRequest::getEnterpriseProjectId,
                DeletePremiumHostRequest::setEnterpriseProjectId));
        builder.<Boolean>withRequestField("keepPolicy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeletePremiumHostRequest::getKeepPolicy, DeletePremiumHostRequest::setKeepPolicy));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> deletePrivacyRule =
        genForDeletePrivacyRule();

    private static HttpRequestDef<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> genForDeletePrivacyRule() {
        // basic
        HttpRequestDef.Builder<DeletePrivacyRuleRequest, DeletePrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePrivacyRuleRequest.class, DeletePrivacyRuleResponse.class)
                .withName("DeletePrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivacyRuleRequest::getPolicyId, DeletePrivacyRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivacyRuleRequest::getRuleId, DeletePrivacyRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivacyRuleRequest::getEnterpriseProjectId,
                DeletePrivacyRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse> deletePunishmentRule =
        genForDeletePunishmentRule();

    private static HttpRequestDef<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse> genForDeletePunishmentRule() {
        // basic
        HttpRequestDef.Builder<DeletePunishmentRuleRequest, DeletePunishmentRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePunishmentRuleRequest.class, DeletePunishmentRuleResponse.class)
            .withName("DeletePunishmentRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePunishmentRuleRequest::getPolicyId, DeletePunishmentRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePunishmentRuleRequest::getRuleId, DeletePunishmentRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePunishmentRuleRequest::getEnterpriseProjectId,
                DeletePunishmentRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteValueListRequest, DeleteValueListResponse> deleteValueList =
        genForDeleteValueList();

    private static HttpRequestDef<DeleteValueListRequest, DeleteValueListResponse> genForDeleteValueList() {
        // basic
        HttpRequestDef.Builder<DeleteValueListRequest, DeleteValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteValueListRequest.class, DeleteValueListResponse.class)
                .withName("DeleteValueList")
                .withUri("/v1/{project_id}/waf/valuelist/{valuelistid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("valuelistid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteValueListRequest::getValuelistid, DeleteValueListRequest::setValuelistid));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteValueListRequest::getEnterpriseProjectId,
                DeleteValueListRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> deleteWhiteBlackIpRule =
        genForDeleteWhiteBlackIpRule();

    private static HttpRequestDef<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> genForDeleteWhiteBlackIpRule() {
        // basic
        HttpRequestDef.Builder<DeleteWhiteBlackIpRuleRequest, DeleteWhiteBlackIpRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWhiteBlackIpRuleRequest.class, DeleteWhiteBlackIpRuleResponse.class)
            .withName("DeleteWhiteBlackIpRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWhiteBlackIpRuleRequest::getPolicyId,
                DeleteWhiteBlackIpRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWhiteBlackIpRuleRequest::getRuleId, DeleteWhiteBlackIpRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWhiteBlackIpRuleRequest::getEnterpriseProjectId,
                DeleteWhiteBlackIpRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> listAnticrawlerRules =
        genForListAnticrawlerRules();

    private static HttpRequestDef<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> genForListAnticrawlerRules() {
        // basic
        HttpRequestDef.Builder<ListAnticrawlerRulesRequest, ListAnticrawlerRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAnticrawlerRulesRequest.class, ListAnticrawlerRulesResponse.class)
            .withName("ListAnticrawlerRules")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getPolicyId, ListAnticrawlerRulesRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getEnterpriseProjectId,
                ListAnticrawlerRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getOffset, ListAnticrawlerRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getLimit, ListAnticrawlerRulesRequest::setLimit));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAnticrawlerRulesRequest::getType, ListAnticrawlerRulesRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntileakageRulesRequest, ListAntileakageRulesResponse> listAntileakageRules =
        genForListAntileakageRules();

    private static HttpRequestDef<ListAntileakageRulesRequest, ListAntileakageRulesResponse> genForListAntileakageRules() {
        // basic
        HttpRequestDef.Builder<ListAntileakageRulesRequest, ListAntileakageRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAntileakageRulesRequest.class, ListAntileakageRulesResponse.class)
            .withName("ListAntileakageRules")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntileakageRulesRequest::getPolicyId, ListAntileakageRulesRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntileakageRulesRequest::getEnterpriseProjectId,
                ListAntileakageRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntileakageRulesRequest::getOffset, ListAntileakageRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntileakageRulesRequest::getLimit, ListAntileakageRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAntitamperRuleRequest, ListAntitamperRuleResponse> listAntitamperRule =
        genForListAntitamperRule();

    private static HttpRequestDef<ListAntitamperRuleRequest, ListAntitamperRuleResponse> genForListAntitamperRule() {
        // basic
        HttpRequestDef.Builder<ListAntitamperRuleRequest, ListAntitamperRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAntitamperRuleRequest.class, ListAntitamperRuleResponse.class)
                .withName("ListAntitamperRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getPolicyId, ListAntitamperRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getEnterpriseProjectId,
                ListAntitamperRuleRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getPage, ListAntitamperRuleRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAntitamperRuleRequest::getPagesize, ListAntitamperRuleRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> listBandwidthTimeline =
        genForListBandwidthTimeline();

    private static HttpRequestDef<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> genForListBandwidthTimeline() {
        // basic
        HttpRequestDef.Builder<ListBandwidthTimelineRequest, ListBandwidthTimelineResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBandwidthTimelineRequest.class, ListBandwidthTimelineResponse.class)
            .withName("ListBandwidthTimeline")
            .withUri("/v1/{project_id}/waf/overviews/bandwidth/timeline")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getEnterpriseProjectId,
                ListBandwidthTimelineRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getFrom, ListBandwidthTimelineRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getTo, ListBandwidthTimelineRequest::setTo));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getHosts, ListBandwidthTimelineRequest::setHosts));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getInstances,
                ListBandwidthTimelineRequest::setInstances));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthTimelineRequest::getGroupBy, ListBandwidthTimelineRequest::setGroupBy));

        // response
        builder.<List<BandwidthStatisticsTimelineItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthTimelineResponse::getBody, ListBandwidthTimelineResponse::setBody)
                .withInnerContainerType(BandwidthStatisticsTimelineItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListCcRulesRequest, ListCcRulesResponse> listCcRules = genForListCcRules();

    private static HttpRequestDef<ListCcRulesRequest, ListCcRulesResponse> genForListCcRules() {
        // basic
        HttpRequestDef.Builder<ListCcRulesRequest, ListCcRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCcRulesRequest.class, ListCcRulesResponse.class)
                .withName("ListCcRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcRulesRequest::getPolicyId, ListCcRulesRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCcRulesRequest::getEnterpriseProjectId,
                ListCcRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCcRulesRequest::getOffset, ListCcRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCcRulesRequest::getLimit, ListCcRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForListCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForListCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withName("ListCertificates")
                .withUri("/v1/{project_id}/waf/certificate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getEnterpriseProjectId,
                ListCertificatesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPage, ListCertificatesRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPagesize, ListCertificatesRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getName, ListCertificatesRequest::setName));
        builder.<Boolean>withRequestField("host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCertificatesRequest::getHost, ListCertificatesRequest::setHost));
        builder.<Integer>withRequestField("exp_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getExpStatus, ListCertificatesRequest::setExpStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCompositeHostsRequest, ListCompositeHostsResponse> listCompositeHosts =
        genForListCompositeHosts();

    private static HttpRequestDef<ListCompositeHostsRequest, ListCompositeHostsResponse> genForListCompositeHosts() {
        // basic
        HttpRequestDef.Builder<ListCompositeHostsRequest, ListCompositeHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCompositeHostsRequest.class, ListCompositeHostsResponse.class)
                .withName("ListCompositeHosts")
                .withUri("/v1/{project_id}/composite-waf/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getEnterpriseProjectId,
                ListCompositeHostsRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getPage, ListCompositeHostsRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getPagesize, ListCompositeHostsRequest::setPagesize));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getHostname, ListCompositeHostsRequest::setHostname));
        builder.<String>withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getPolicyname, ListCompositeHostsRequest::setPolicyname));
        builder.<Integer>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getProtectStatus,
                ListCompositeHostsRequest::setProtectStatus));
        builder.<String>withRequestField("waf_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getWafType, ListCompositeHostsRequest::setWafType));
        builder.<Boolean>withRequestField("is_https",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCompositeHostsRequest::getIsHttps, ListCompositeHostsRequest::setIsHttps));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomRulesRequest, ListCustomRulesResponse> listCustomRules =
        genForListCustomRules();

    private static HttpRequestDef<ListCustomRulesRequest, ListCustomRulesResponse> genForListCustomRules() {
        // basic
        HttpRequestDef.Builder<ListCustomRulesRequest, ListCustomRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomRulesRequest.class, ListCustomRulesResponse.class)
                .withName("ListCustomRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomRulesRequest::getPolicyId, ListCustomRulesRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomRulesRequest::getEnterpriseProjectId,
                ListCustomRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomRulesRequest::getOffset, ListCustomRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomRulesRequest::getLimit, ListCustomRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventRequest, ListEventResponse> listEvent = genForListEvent();

    private static HttpRequestDef<ListEventRequest, ListEventResponse> genForListEvent() {
        // basic
        HttpRequestDef.Builder<ListEventRequest, ListEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventRequest.class, ListEventResponse.class)
                .withName("ListEvent")
                .withUri("/v1/{project_id}/waf/event")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventRequest::getEnterpriseProjectId, ListEventRequest::setEnterpriseProjectId));
        builder.<ListEventRequest.RecentEnum>withRequestField("recent",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventRequest.RecentEnum.class),
            f -> f.withMarshaller(ListEventRequest::getRecent, ListEventRequest::setRecent));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEventRequest::getFrom, ListEventRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEventRequest::getTo, ListEventRequest::setTo));
        builder.<List<String>>withRequestField("attacks",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEventRequest::getAttacks, ListEventRequest::setAttacks));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListEventRequest::getHosts, ListEventRequest::setHosts));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventRequest::getPage, ListEventRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventRequest::getPagesize, ListEventRequest::setPagesize));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventRequest::getXLanguage, ListEventRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGeoipRuleRequest, ListGeoipRuleResponse> listGeoipRule =
        genForListGeoipRule();

    private static HttpRequestDef<ListGeoipRuleRequest, ListGeoipRuleResponse> genForListGeoipRule() {
        // basic
        HttpRequestDef.Builder<ListGeoipRuleRequest, ListGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGeoipRuleRequest.class, ListGeoipRuleResponse.class)
                .withName("ListGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getPolicyId, ListGeoipRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getEnterpriseProjectId,
                ListGeoipRuleRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getPage, ListGeoipRuleRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGeoipRuleRequest::getPagesize, ListGeoipRuleRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRequest, ListHostResponse> listHost = genForListHost();

    private static HttpRequestDef<ListHostRequest, ListHostResponse> genForListHost() {
        // basic
        HttpRequestDef.Builder<ListHostRequest, ListHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostRequest.class, ListHostResponse.class)
                .withName("ListHost")
                .withUri("/v1/{project_id}/waf/instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRequest::getEnterpriseProjectId, ListHostRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRequest::getPage, ListHostRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHostRequest::getPagesize, ListHostRequest::setPagesize));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRequest::getHostname, ListHostRequest::setHostname));
        builder.<String>withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRequest::getPolicyname, ListHostRequest::setPolicyname));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHostRouteRequest, ListHostRouteResponse> listHostRoute =
        genForListHostRoute();

    private static HttpRequestDef<ListHostRouteRequest, ListHostRouteResponse> genForListHostRoute() {
        // basic
        HttpRequestDef.Builder<ListHostRouteRequest, ListHostRouteResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostRouteRequest.class, ListHostRouteResponse.class)
                .withName("ListHostRoute")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}/route")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRouteRequest::getInstanceId, ListHostRouteRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHostRouteRequest::getEnterpriseProjectId,
                ListHostRouteRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIgnoreRuleRequest, ListIgnoreRuleResponse> listIgnoreRule =
        genForListIgnoreRule();

    private static HttpRequestDef<ListIgnoreRuleRequest, ListIgnoreRuleResponse> genForListIgnoreRule() {
        // basic
        HttpRequestDef.Builder<ListIgnoreRuleRequest, ListIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIgnoreRuleRequest.class, ListIgnoreRuleResponse.class)
                .withName("ListIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIgnoreRuleRequest::getPolicyId, ListIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIgnoreRuleRequest::getEnterpriseProjectId,
                ListIgnoreRuleRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIgnoreRuleRequest::getPage, ListIgnoreRuleRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIgnoreRuleRequest::getPagesize, ListIgnoreRuleRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceRequest, ListInstanceResponse> listInstance = genForListInstance();

    private static HttpRequestDef<ListInstanceRequest, ListInstanceResponse> genForListInstance() {
        // basic
        HttpRequestDef.Builder<ListInstanceRequest, ListInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceRequest.class, ListInstanceResponse.class)
                .withName("ListInstance")
                .withUri("/v1/{project_id}/premium-waf/instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRequest::getEnterpriseProjectId,
                ListInstanceRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRequest::getPage, ListInstanceRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceRequest::getPagesize, ListInstanceRequest::setPagesize));
        builder.<String>withRequestField("instancename",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceRequest::getInstancename, ListInstanceRequest::setInstancename));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIpGroupRequest, ListIpGroupResponse> listIpGroup = genForListIpGroup();

    private static HttpRequestDef<ListIpGroupRequest, ListIpGroupResponse> genForListIpGroup() {
        // basic
        HttpRequestDef.Builder<ListIpGroupRequest, ListIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIpGroupRequest.class, ListIpGroupResponse.class)
                .withName("ListIpGroup")
                .withUri("/v1/{project_id}/waf/ip-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupRequest::getEnterpriseProjectId,
                ListIpGroupRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpGroupRequest::getPage, ListIpGroupRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIpGroupRequest::getPagesize, ListIpGroupRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupRequest::getName, ListIpGroupRequest::setName));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIpGroupRequest::getIp, ListIpGroupRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNoticeConfigsRequest, ListNoticeConfigsResponse> listNoticeConfigs =
        genForListNoticeConfigs();

    private static HttpRequestDef<ListNoticeConfigsRequest, ListNoticeConfigsResponse> genForListNoticeConfigs() {
        // basic
        HttpRequestDef.Builder<ListNoticeConfigsRequest, ListNoticeConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNoticeConfigsRequest.class, ListNoticeConfigsResponse.class)
                .withName("ListNoticeConfigs")
                .withUri("/v2/{project_id}/waf/alerts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNoticeConfigsRequest::getEnterpriseProjectId,
                ListNoticeConfigsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> listOverviewsClassification =
        genForListOverviewsClassification();

    private static HttpRequestDef<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> genForListOverviewsClassification() {
        // basic
        HttpRequestDef.Builder<ListOverviewsClassificationRequest, ListOverviewsClassificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListOverviewsClassificationRequest.class,
                    ListOverviewsClassificationResponse.class)
                .withName("ListOverviewsClassification")
                .withUri("/v1/{project_id}/waf/overviews/classification")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getEnterpriseProjectId,
                ListOverviewsClassificationRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getFrom,
                ListOverviewsClassificationRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getTo,
                ListOverviewsClassificationRequest::setTo));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getTop,
                ListOverviewsClassificationRequest::setTop));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getHosts,
                ListOverviewsClassificationRequest::setHosts));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getInstances,
                ListOverviewsClassificationRequest::setInstances));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOverviewsClassificationRequest::getXLanguage,
                ListOverviewsClassificationRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyRequest, ListPolicyResponse> listPolicy = genForListPolicy();

    private static HttpRequestDef<ListPolicyRequest, ListPolicyResponse> genForListPolicy() {
        // basic
        HttpRequestDef.Builder<ListPolicyRequest, ListPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyRequest.class, ListPolicyResponse.class)
                .withName("ListPolicy")
                .withUri("/v1/{project_id}/waf/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getEnterpriseProjectId,
                ListPolicyRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getPage, ListPolicyRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyRequest::getPagesize, ListPolicyRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyRequest::getName, ListPolicyRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPremiumHostRequest, ListPremiumHostResponse> listPremiumHost =
        genForListPremiumHost();

    private static HttpRequestDef<ListPremiumHostRequest, ListPremiumHostResponse> genForListPremiumHost() {
        // basic
        HttpRequestDef.Builder<ListPremiumHostRequest, ListPremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPremiumHostRequest.class, ListPremiumHostResponse.class)
                .withName("ListPremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getEnterpriseProjectId,
                ListPremiumHostRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getPage, ListPremiumHostRequest::setPage));
        builder.<String>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getPagesize, ListPremiumHostRequest::setPagesize));
        builder.<String>withRequestField("hostname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getHostname, ListPremiumHostRequest::setHostname));
        builder.<String>withRequestField("policyname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getPolicyname, ListPremiumHostRequest::setPolicyname));
        builder.<Integer>withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPremiumHostRequest::getProtectStatus, ListPremiumHostRequest::setProtectStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivacyRuleRequest, ListPrivacyRuleResponse> listPrivacyRule =
        genForListPrivacyRule();

    private static HttpRequestDef<ListPrivacyRuleRequest, ListPrivacyRuleResponse> genForListPrivacyRule() {
        // basic
        HttpRequestDef.Builder<ListPrivacyRuleRequest, ListPrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivacyRuleRequest.class, ListPrivacyRuleResponse.class)
                .withName("ListPrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getPolicyId, ListPrivacyRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getEnterpriseProjectId,
                ListPrivacyRuleRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getPage, ListPrivacyRuleRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivacyRuleRequest::getPagesize, ListPrivacyRuleRequest::setPagesize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPunishmentRulesRequest, ListPunishmentRulesResponse> listPunishmentRules =
        genForListPunishmentRules();

    private static HttpRequestDef<ListPunishmentRulesRequest, ListPunishmentRulesResponse> genForListPunishmentRules() {
        // basic
        HttpRequestDef.Builder<ListPunishmentRulesRequest, ListPunishmentRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPunishmentRulesRequest.class, ListPunishmentRulesResponse.class)
                .withName("ListPunishmentRules")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPunishmentRulesRequest::getPolicyId, ListPunishmentRulesRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPunishmentRulesRequest::getEnterpriseProjectId,
                ListPunishmentRulesRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPunishmentRulesRequest::getOffset, ListPunishmentRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPunishmentRulesRequest::getLimit, ListPunishmentRulesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQpsTimelineRequest, ListQpsTimelineResponse> listQpsTimeline =
        genForListQpsTimeline();

    private static HttpRequestDef<ListQpsTimelineRequest, ListQpsTimelineResponse> genForListQpsTimeline() {
        // basic
        HttpRequestDef.Builder<ListQpsTimelineRequest, ListQpsTimelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQpsTimelineRequest.class, ListQpsTimelineResponse.class)
                .withName("ListQpsTimeline")
                .withUri("/v1/{project_id}/waf/overviews/qps/timeline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getEnterpriseProjectId,
                ListQpsTimelineRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getFrom, ListQpsTimelineRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getTo, ListQpsTimelineRequest::setTo));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getHosts, ListQpsTimelineRequest::setHosts));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getInstances, ListQpsTimelineRequest::setInstances));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQpsTimelineRequest::getGroupBy, ListQpsTimelineRequest::setGroupBy));

        // response
        builder.<List<StatisticsTimelineItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListQpsTimelineResponse::getBody, ListQpsTimelineResponse::setBody)
                .withInnerContainerType(StatisticsTimelineItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRequestTimelineRequest, ListRequestTimelineResponse> listRequestTimeline =
        genForListRequestTimeline();

    private static HttpRequestDef<ListRequestTimelineRequest, ListRequestTimelineResponse> genForListRequestTimeline() {
        // basic
        HttpRequestDef.Builder<ListRequestTimelineRequest, ListRequestTimelineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRequestTimelineRequest.class, ListRequestTimelineResponse.class)
                .withName("ListRequestTimeline")
                .withUri("/v1/{project_id}/waf/overviews/request/timeline")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getEnterpriseProjectId,
                ListRequestTimelineRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getFrom, ListRequestTimelineRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getTo, ListRequestTimelineRequest::setTo));
        builder.<List<String>>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getHosts, ListRequestTimelineRequest::setHosts));
        builder.<List<String>>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getInstances, ListRequestTimelineRequest::setInstances));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestTimelineRequest::getGroupBy, ListRequestTimelineRequest::setGroupBy));

        // response
        builder.<List<StatisticsTimelineItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRequestTimelineResponse::getBody, ListRequestTimelineResponse::setBody)
                .withInnerContainerType(StatisticsTimelineItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> listStatistics =
        genForListStatistics();

    private static HttpRequestDef<ListStatisticsRequest, ListStatisticsResponse> genForListStatistics() {
        // basic
        HttpRequestDef.Builder<ListStatisticsRequest, ListStatisticsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStatisticsRequest.class, ListStatisticsResponse.class)
                .withName("ListStatistics")
                .withUri("/v1/{project_id}/waf/overviews/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getEnterpriseProjectId,
                ListStatisticsRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListStatisticsRequest::getFrom, ListStatisticsRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListStatisticsRequest::getTo, ListStatisticsRequest::setTo));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getHosts, ListStatisticsRequest::setHosts));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStatisticsRequest::getInstances, ListStatisticsRequest::setInstances));

        // response
        builder.<List<CountItem>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListStatisticsResponse::getBody, ListStatisticsResponse::setBody)
                .withInnerContainerType(CountItem.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListTopAbnormalRequest, ListTopAbnormalResponse> listTopAbnormal =
        genForListTopAbnormal();

    private static HttpRequestDef<ListTopAbnormalRequest, ListTopAbnormalResponse> genForListTopAbnormal() {
        // basic
        HttpRequestDef.Builder<ListTopAbnormalRequest, ListTopAbnormalResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopAbnormalRequest.class, ListTopAbnormalResponse.class)
                .withName("ListTopAbnormal")
                .withUri("/v1/{project_id}/waf/overviews/abnormal")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getEnterpriseProjectId,
                ListTopAbnormalRequest::setEnterpriseProjectId));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getFrom, ListTopAbnormalRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getTo, ListTopAbnormalRequest::setTo));
        builder.<Integer>withRequestField("top",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getTop, ListTopAbnormalRequest::setTop));
        builder.<Integer>withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getCode, ListTopAbnormalRequest::setCode));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getHosts, ListTopAbnormalRequest::setHosts));
        builder.<String>withRequestField("instances",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTopAbnormalRequest::getInstances, ListTopAbnormalRequest::setInstances));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListValueListRequest, ListValueListResponse> listValueList =
        genForListValueList();

    private static HttpRequestDef<ListValueListRequest, ListValueListResponse> genForListValueList() {
        // basic
        HttpRequestDef.Builder<ListValueListRequest, ListValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListValueListRequest.class, ListValueListResponse.class)
                .withName("ListValueList")
                .withUri("/v1/{project_id}/waf/valuelist")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListValueListRequest::getPage, ListValueListRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListValueListRequest::getPagesize, ListValueListRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListValueListRequest::getName, ListValueListRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> listWhiteblackipRule =
        genForListWhiteblackipRule();

    private static HttpRequestDef<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> genForListWhiteblackipRule() {
        // basic
        HttpRequestDef.Builder<ListWhiteblackipRuleRequest, ListWhiteblackipRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWhiteblackipRuleRequest.class, ListWhiteblackipRuleResponse.class)
            .withName("ListWhiteblackipRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getPolicyId, ListWhiteblackipRuleRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getEnterpriseProjectId,
                ListWhiteblackipRuleRequest::setEnterpriseProjectId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getPage, ListWhiteblackipRuleRequest::setPage));
        builder.<Integer>withRequestField("pagesize",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getPagesize, ListWhiteblackipRuleRequest::setPagesize));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhiteblackipRuleRequest::getName, ListWhiteblackipRuleRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> migrateCompositeHosts =
        genForMigrateCompositeHosts();

    private static HttpRequestDef<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> genForMigrateCompositeHosts() {
        // basic
        HttpRequestDef.Builder<MigrateCompositeHostsRequest, MigrateCompositeHostsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, MigrateCompositeHostsRequest.class, MigrateCompositeHostsResponse.class)
            .withName("MigrateCompositeHosts")
            .withUri("/v1/{project_id}/composite-waf/hosts/migration")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateCompositeHostsRequest::getEnterpriseProjectId,
                MigrateCompositeHostsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("target_enterprise_project_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateCompositeHostsRequest::getTargetEnterpriseProjectId,
                MigrateCompositeHostsRequest::setTargetEnterpriseProjectId));
        builder.<MigrateCompositeHostsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MigrateCompositeHostsRequestBody.class),
            f -> f.withMarshaller(MigrateCompositeHostsRequest::getBody, MigrateCompositeHostsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RenameInstanceRequest, RenameInstanceResponse> renameInstance =
        genForRenameInstance();

    private static HttpRequestDef<RenameInstanceRequest, RenameInstanceResponse> genForRenameInstance() {
        // basic
        HttpRequestDef.Builder<RenameInstanceRequest, RenameInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RenameInstanceRequest.class, RenameInstanceResponse.class)
                .withName("RenameInstance")
                .withUri("/v1/{project_id}/premium-waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenameInstanceRequest::getInstanceId, RenameInstanceRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenameInstanceRequest::getEnterpriseProjectId,
                RenameInstanceRequest::setEnterpriseProjectId));
        builder.<RenameInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RenameInstanceRequestBody.class),
            f -> f.withMarshaller(RenameInstanceRequest::getBody, RenameInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> showAnticrawlerRule =
        genForShowAnticrawlerRule();

    private static HttpRequestDef<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> genForShowAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<ShowAnticrawlerRuleRequest, ShowAnticrawlerRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAnticrawlerRuleRequest.class, ShowAnticrawlerRuleResponse.class)
                .withName("ShowAnticrawlerRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnticrawlerRuleRequest::getPolicyId, ShowAnticrawlerRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnticrawlerRuleRequest::getRuleId, ShowAnticrawlerRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnticrawlerRuleRequest::getEnterpriseProjectId,
                ShowAnticrawlerRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> showAntileakageRule =
        genForShowAntileakageRule();

    private static HttpRequestDef<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> genForShowAntileakageRule() {
        // basic
        HttpRequestDef.Builder<ShowAntileakageRuleRequest, ShowAntileakageRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAntileakageRuleRequest.class, ShowAntileakageRuleResponse.class)
                .withName("ShowAntileakageRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntileakageRuleRequest::getPolicyId, ShowAntileakageRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntileakageRuleRequest::getRuleId, ShowAntileakageRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntileakageRuleRequest::getEnterpriseProjectId,
                ShowAntileakageRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse> showAntitamperRule =
        genForShowAntitamperRule();

    private static HttpRequestDef<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse> genForShowAntitamperRule() {
        // basic
        HttpRequestDef.Builder<ShowAntitamperRuleRequest, ShowAntitamperRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAntitamperRuleRequest.class, ShowAntitamperRuleResponse.class)
                .withName("ShowAntitamperRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntitamperRuleRequest::getPolicyId, ShowAntitamperRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntitamperRuleRequest::getRuleId, ShowAntitamperRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAntitamperRuleRequest::getEnterpriseProjectId,
                ShowAntitamperRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCcRuleRequest, ShowCcRuleResponse> showCcRule = genForShowCcRule();

    private static HttpRequestDef<ShowCcRuleRequest, ShowCcRuleResponse> genForShowCcRule() {
        // basic
        HttpRequestDef.Builder<ShowCcRuleRequest, ShowCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCcRuleRequest.class, ShowCcRuleResponse.class)
                .withName("ShowCcRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcRuleRequest::getPolicyId, ShowCcRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcRuleRequest::getRuleId, ShowCcRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCcRuleRequest::getEnterpriseProjectId,
                ShowCcRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate =
        genForShowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForShowCertificate() {
        // basic
        HttpRequestDef.Builder<ShowCertificateRequest, ShowCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertificateRequest.class, ShowCertificateResponse.class)
                .withName("ShowCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, ShowCertificateRequest::setCertificateId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getEnterpriseProjectId,
                ShowCertificateRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCompositeHostRequest, ShowCompositeHostResponse> showCompositeHost =
        genForShowCompositeHost();

    private static HttpRequestDef<ShowCompositeHostRequest, ShowCompositeHostResponse> genForShowCompositeHost() {
        // basic
        HttpRequestDef.Builder<ShowCompositeHostRequest, ShowCompositeHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCompositeHostRequest.class, ShowCompositeHostResponse.class)
                .withName("ShowCompositeHost")
                .withUri("/v1/{project_id}/composite-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompositeHostRequest::getHostId, ShowCompositeHostRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCompositeHostRequest::getEnterpriseProjectId,
                ShowCompositeHostRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConsoleConfigRequest, ShowConsoleConfigResponse> showConsoleConfig =
        genForShowConsoleConfig();

    private static HttpRequestDef<ShowConsoleConfigRequest, ShowConsoleConfigResponse> genForShowConsoleConfig() {
        // basic
        HttpRequestDef.Builder<ShowConsoleConfigRequest, ShowConsoleConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConsoleConfigRequest.class, ShowConsoleConfigResponse.class)
                .withName("ShowConsoleConfig")
                .withUri("/v1/{project_id}/waf/config/console")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCustomRuleRequest, ShowCustomRuleResponse> showCustomRule =
        genForShowCustomRule();

    private static HttpRequestDef<ShowCustomRuleRequest, ShowCustomRuleResponse> genForShowCustomRule() {
        // basic
        HttpRequestDef.Builder<ShowCustomRuleRequest, ShowCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCustomRuleRequest.class, ShowCustomRuleResponse.class)
                .withName("ShowCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomRuleRequest::getPolicyId, ShowCustomRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomRuleRequest::getRuleId, ShowCustomRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCustomRuleRequest::getEnterpriseProjectId,
                ShowCustomRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEventRequest, ShowEventResponse> showEvent = genForShowEvent();

    private static HttpRequestDef<ShowEventRequest, ShowEventResponse> genForShowEvent() {
        // basic
        HttpRequestDef.Builder<ShowEventRequest, ShowEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEventRequest.class, ShowEventResponse.class)
                .withName("ShowEvent")
                .withUri("/v1/{project_id}/waf/event/{eventid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("eventid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getEventid, ShowEventRequest::setEventid));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getEnterpriseProjectId, ShowEventRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventRequest::getXLanguage, ShowEventRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGeoipRuleRequest, ShowGeoipRuleResponse> showGeoipRule =
        genForShowGeoipRule();

    private static HttpRequestDef<ShowGeoipRuleRequest, ShowGeoipRuleResponse> genForShowGeoipRule() {
        // basic
        HttpRequestDef.Builder<ShowGeoipRuleRequest, ShowGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGeoipRuleRequest.class, ShowGeoipRuleResponse.class)
                .withName("ShowGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGeoipRuleRequest::getPolicyId, ShowGeoipRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGeoipRuleRequest::getRuleId, ShowGeoipRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGeoipRuleRequest::getEnterpriseProjectId,
                ShowGeoipRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHostRequest, ShowHostResponse> showHost = genForShowHost();

    private static HttpRequestDef<ShowHostRequest, ShowHostResponse> genForShowHost() {
        // basic
        HttpRequestDef.Builder<ShowHostRequest, ShowHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHostRequest.class, ShowHostResponse.class)
                .withName("ShowHost")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostRequest::getInstanceId, ShowHostRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHostRequest::getEnterpriseProjectId, ShowHostRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse> showIgnoreRule =
        genForShowIgnoreRule();

    private static HttpRequestDef<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse> genForShowIgnoreRule() {
        // basic
        HttpRequestDef.Builder<ShowIgnoreRuleRequest, ShowIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIgnoreRuleRequest.class, ShowIgnoreRuleResponse.class)
                .withName("ShowIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIgnoreRuleRequest::getPolicyId, ShowIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIgnoreRuleRequest::getRuleId, ShowIgnoreRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIgnoreRuleRequest::getEnterpriseProjectId,
                ShowIgnoreRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v1/{project_id}/premium-waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, ShowInstanceRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getEnterpriseProjectId,
                ShowInstanceRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> showIpGroup = genForShowIpGroup();

    private static HttpRequestDef<ShowIpGroupRequest, ShowIpGroupResponse> genForShowIpGroup() {
        // basic
        HttpRequestDef.Builder<ShowIpGroupRequest, ShowIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIpGroupRequest.class, ShowIpGroupResponse.class)
                .withName("ShowIpGroup")
                .withUri("/v1/{project_id}/waf/ip-group/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpGroupRequest::getId, ShowIpGroupRequest::setId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpGroupRequest::getEnterpriseProjectId,
                ShowIpGroupRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> showLtsInfoConfig =
        genForShowLtsInfoConfig();

    private static HttpRequestDef<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> genForShowLtsInfoConfig() {
        // basic
        HttpRequestDef.Builder<ShowLtsInfoConfigRequest, ShowLtsInfoConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLtsInfoConfigRequest.class, ShowLtsInfoConfigResponse.class)
                .withName("ShowLtsInfoConfig")
                .withUri("/v1/{project_id}/waf/config/lts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLtsInfoConfigRequest::getEnterpriseProjectId,
                ShowLtsInfoConfigRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> showPolicy = genForShowPolicy();

    private static HttpRequestDef<ShowPolicyRequest, ShowPolicyResponse> genForShowPolicy() {
        // basic
        HttpRequestDef.Builder<ShowPolicyRequest, ShowPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyRequest.class, ShowPolicyResponse.class)
                .withName("ShowPolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getPolicyId, ShowPolicyRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyRequest::getEnterpriseProjectId,
                ShowPolicyRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPremiumHostRequest, ShowPremiumHostResponse> showPremiumHost =
        genForShowPremiumHost();

    private static HttpRequestDef<ShowPremiumHostRequest, ShowPremiumHostResponse> genForShowPremiumHost() {
        // basic
        HttpRequestDef.Builder<ShowPremiumHostRequest, ShowPremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPremiumHostRequest.class, ShowPremiumHostResponse.class)
                .withName("ShowPremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPremiumHostRequest::getHostId, ShowPremiumHostRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPremiumHostRequest::getEnterpriseProjectId,
                ShowPremiumHostRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse> showPrivacyRule =
        genForShowPrivacyRule();

    private static HttpRequestDef<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse> genForShowPrivacyRule() {
        // basic
        HttpRequestDef.Builder<ShowPrivacyRuleRequest, ShowPrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPrivacyRuleRequest.class, ShowPrivacyRuleResponse.class)
                .withName("ShowPrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivacyRuleRequest::getPolicyId, ShowPrivacyRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivacyRuleRequest::getRuleId, ShowPrivacyRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivacyRuleRequest::getEnterpriseProjectId,
                ShowPrivacyRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse> showPunishmentRule =
        genForShowPunishmentRule();

    private static HttpRequestDef<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse> genForShowPunishmentRule() {
        // basic
        HttpRequestDef.Builder<ShowPunishmentRuleRequest, ShowPunishmentRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPunishmentRuleRequest.class, ShowPunishmentRuleResponse.class)
                .withName("ShowPunishmentRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPunishmentRuleRequest::getPolicyId, ShowPunishmentRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPunishmentRuleRequest::getRuleId, ShowPunishmentRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPunishmentRuleRequest::getEnterpriseProjectId,
                ShowPunishmentRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSourceIpRequest, ShowSourceIpResponse> showSourceIp = genForShowSourceIp();

    private static HttpRequestDef<ShowSourceIpRequest, ShowSourceIpResponse> genForShowSourceIp() {
        // basic
        HttpRequestDef.Builder<ShowSourceIpRequest, ShowSourceIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSourceIpRequest.class, ShowSourceIpResponse.class)
                .withName("ShowSourceIp")
                .withUri("/v1/{project_id}/waf/config/source-ip")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> showSubscriptionInfo =
        genForShowSubscriptionInfo();

    private static HttpRequestDef<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> genForShowSubscriptionInfo() {
        // basic
        HttpRequestDef.Builder<ShowSubscriptionInfoRequest, ShowSubscriptionInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSubscriptionInfoRequest.class, ShowSubscriptionInfoResponse.class)
            .withName("ShowSubscriptionInfo")
            .withUri("/v1/{project_id}/waf/subscription")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowValueListRequest, ShowValueListResponse> showValueList =
        genForShowValueList();

    private static HttpRequestDef<ShowValueListRequest, ShowValueListResponse> genForShowValueList() {
        // basic
        HttpRequestDef.Builder<ShowValueListRequest, ShowValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowValueListRequest.class, ShowValueListResponse.class)
                .withName("ShowValueList")
                .withUri("/v1/{project_id}/waf/valuelist/{valuelistid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("valuelistid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowValueListRequest::getValuelistid, ShowValueListRequest::setValuelistid));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowValueListRequest::getEnterpriseProjectId,
                ShowValueListRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse> showWhiteBlackIpRule =
        genForShowWhiteBlackIpRule();

    private static HttpRequestDef<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse> genForShowWhiteBlackIpRule() {
        // basic
        HttpRequestDef.Builder<ShowWhiteBlackIpRuleRequest, ShowWhiteBlackIpRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWhiteBlackIpRuleRequest.class, ShowWhiteBlackIpRuleResponse.class)
            .withName("ShowWhiteBlackIpRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWhiteBlackIpRuleRequest::getPolicyId, ShowWhiteBlackIpRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWhiteBlackIpRuleRequest::getRuleId, ShowWhiteBlackIpRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWhiteBlackIpRuleRequest::getEnterpriseProjectId,
                ShowWhiteBlackIpRuleRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> updateAlertNoticeConfig =
        genForUpdateAlertNoticeConfig();

    private static HttpRequestDef<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> genForUpdateAlertNoticeConfig() {
        // basic
        HttpRequestDef.Builder<UpdateAlertNoticeConfigRequest, UpdateAlertNoticeConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAlertNoticeConfigRequest.class, UpdateAlertNoticeConfigResponse.class)
            .withName("UpdateAlertNoticeConfig")
            .withUri("/v2/{project_id}/waf/alert/{alert_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertNoticeConfigRequest::getAlertId,
                UpdateAlertNoticeConfigRequest::setAlertId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertNoticeConfigRequest::getXLanguage,
                UpdateAlertNoticeConfigRequest::setXLanguage));
        builder.<UpdateAlertNoticeConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlertNoticeConfigRequestBody.class),
            f -> f.withMarshaller(UpdateAlertNoticeConfigRequest::getBody, UpdateAlertNoticeConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse> updateAntiTamperRuleRefresh =
        genForUpdateAntiTamperRuleRefresh();

    private static HttpRequestDef<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse> genForUpdateAntiTamperRuleRefresh() {
        // basic
        HttpRequestDef.Builder<UpdateAntiTamperRuleRefreshRequest, UpdateAntiTamperRuleRefreshResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateAntiTamperRuleRefreshRequest.class,
                    UpdateAntiTamperRuleRefreshResponse.class)
                .withName("UpdateAntiTamperRuleRefresh")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/antitamper/{rule_id}/refresh")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntiTamperRuleRefreshRequest::getPolicyId,
                UpdateAntiTamperRuleRefreshRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntiTamperRuleRefreshRequest::getRuleId,
                UpdateAntiTamperRuleRefreshRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntiTamperRuleRefreshRequest::getEnterpriseProjectId,
                UpdateAntiTamperRuleRefreshRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> updateAnticrawlerRule =
        genForUpdateAnticrawlerRule();

    private static HttpRequestDef<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> genForUpdateAnticrawlerRule() {
        // basic
        HttpRequestDef.Builder<UpdateAnticrawlerRuleRequest, UpdateAnticrawlerRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAnticrawlerRuleRequest.class, UpdateAnticrawlerRuleResponse.class)
            .withName("UpdateAnticrawlerRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getPolicyId,
                UpdateAnticrawlerRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getRuleId, UpdateAnticrawlerRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getEnterpriseProjectId,
                UpdateAnticrawlerRuleRequest::setEnterpriseProjectId));
        builder.<UpdateAnticrawlerRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAnticrawlerRuleRequestBody.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleRequest::getBody, UpdateAnticrawlerRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse> updateAnticrawlerRuleType =
        genForUpdateAnticrawlerRuleType();

    private static HttpRequestDef<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse> genForUpdateAnticrawlerRuleType() {
        // basic
        HttpRequestDef.Builder<UpdateAnticrawlerRuleTypeRequest, UpdateAnticrawlerRuleTypeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateAnticrawlerRuleTypeRequest.class,
                    UpdateAnticrawlerRuleTypeResponse.class)
                .withName("UpdateAnticrawlerRuleType")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/anticrawler")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleTypeRequest::getPolicyId,
                UpdateAnticrawlerRuleTypeRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleTypeRequest::getEnterpriseProjectId,
                UpdateAnticrawlerRuleTypeRequest::setEnterpriseProjectId));
        builder.<UpdateAnticrawlerRuleTypeRequestbody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAnticrawlerRuleTypeRequestbody.class),
            f -> f.withMarshaller(UpdateAnticrawlerRuleTypeRequest::getBody,
                UpdateAnticrawlerRuleTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> updateAntileakageRule =
        genForUpdateAntileakageRule();

    private static HttpRequestDef<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> genForUpdateAntileakageRule() {
        // basic
        HttpRequestDef.Builder<UpdateAntileakageRuleRequest, UpdateAntileakageRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAntileakageRuleRequest.class, UpdateAntileakageRuleResponse.class)
            .withName("UpdateAntileakageRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/antileakage/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getPolicyId,
                UpdateAntileakageRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getRuleId, UpdateAntileakageRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getEnterpriseProjectId,
                UpdateAntileakageRuleRequest::setEnterpriseProjectId));
        builder.<UpdateAntileakageRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAntileakageRuleRequestBody.class),
            f -> f.withMarshaller(UpdateAntileakageRuleRequest::getBody, UpdateAntileakageRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCcRuleRequest, UpdateCcRuleResponse> updateCcRule = genForUpdateCcRule();

    private static HttpRequestDef<UpdateCcRuleRequest, UpdateCcRuleResponse> genForUpdateCcRule() {
        // basic
        HttpRequestDef.Builder<UpdateCcRuleRequest, UpdateCcRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCcRuleRequest.class, UpdateCcRuleResponse.class)
                .withName("UpdateCcRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/cc/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCcRuleRequest::getPolicyId, UpdateCcRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCcRuleRequest::getRuleId, UpdateCcRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCcRuleRequest::getEnterpriseProjectId,
                UpdateCcRuleRequest::setEnterpriseProjectId));
        builder.<UpdateCcRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCcRuleRequestBody.class),
            f -> f.withMarshaller(UpdateCcRuleRequest::getBody, UpdateCcRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate =
        genForUpdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForUpdateCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateRequest, UpdateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateRequest.class, UpdateCertificateResponse.class)
                .withName("UpdateCertificate")
                .withUri("/v1/{project_id}/waf/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId,
                UpdateCertificateRequest::setCertificateId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getEnterpriseProjectId,
                UpdateCertificateRequest::setEnterpriseProjectId));
        builder.<UpdateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, UpdateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCustomRuleRequest, UpdateCustomRuleResponse> updateCustomRule =
        genForUpdateCustomRule();

    private static HttpRequestDef<UpdateCustomRuleRequest, UpdateCustomRuleResponse> genForUpdateCustomRule() {
        // basic
        HttpRequestDef.Builder<UpdateCustomRuleRequest, UpdateCustomRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCustomRuleRequest.class, UpdateCustomRuleResponse.class)
                .withName("UpdateCustomRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/custom/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomRuleRequest::getPolicyId, UpdateCustomRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomRuleRequest::getRuleId, UpdateCustomRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomRuleRequest::getEnterpriseProjectId,
                UpdateCustomRuleRequest::setEnterpriseProjectId));
        builder.<UpdateCustomRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCustomRuleRequestBody.class),
            f -> f.withMarshaller(UpdateCustomRuleRequest::getBody, UpdateCustomRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> updateGeoipRule =
        genForUpdateGeoipRule();

    private static HttpRequestDef<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> genForUpdateGeoipRule() {
        // basic
        HttpRequestDef.Builder<UpdateGeoipRuleRequest, UpdateGeoipRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGeoipRuleRequest.class, UpdateGeoipRuleResponse.class)
                .withName("UpdateGeoipRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/geoip/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getPolicyId, UpdateGeoipRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getRuleId, UpdateGeoipRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getEnterpriseProjectId,
                UpdateGeoipRuleRequest::setEnterpriseProjectId));
        builder.<UpdateGeoipRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGeoipRuleRequestBody.class),
            f -> f.withMarshaller(UpdateGeoipRuleRequest::getBody, UpdateGeoipRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostRequest, UpdateHostResponse> updateHost = genForUpdateHost();

    private static HttpRequestDef<UpdateHostRequest, UpdateHostResponse> genForUpdateHost() {
        // basic
        HttpRequestDef.Builder<UpdateHostRequest, UpdateHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateHostRequest.class, UpdateHostResponse.class)
                .withName("UpdateHost")
                .withUri("/v1/{project_id}/waf/instance/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostRequest::getInstanceId, UpdateHostRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostRequest::getEnterpriseProjectId,
                UpdateHostRequest::setEnterpriseProjectId));
        builder.<UpdateHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHostRequestBody.class),
            f -> f.withMarshaller(UpdateHostRequest::getBody, UpdateHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> updateHostProtectStatus =
        genForUpdateHostProtectStatus();

    private static HttpRequestDef<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> genForUpdateHostProtectStatus() {
        // basic
        HttpRequestDef.Builder<UpdateHostProtectStatusRequest, UpdateHostProtectStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateHostProtectStatusRequest.class, UpdateHostProtectStatusResponse.class)
            .withName("UpdateHostProtectStatus")
            .withUri("/v1/{project_id}/waf/instance/{instance_id}/protect-status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostProtectStatusRequest::getInstanceId,
                UpdateHostProtectStatusRequest::setInstanceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostProtectStatusRequest::getEnterpriseProjectId,
                UpdateHostProtectStatusRequest::setEnterpriseProjectId));
        builder.<UpdateHostProtectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHostProtectStatusRequestBody.class),
            f -> f.withMarshaller(UpdateHostProtectStatusRequest::getBody, UpdateHostProtectStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse> updateIgnoreRule =
        genForUpdateIgnoreRule();

    private static HttpRequestDef<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse> genForUpdateIgnoreRule() {
        // basic
        HttpRequestDef.Builder<UpdateIgnoreRuleRequest, UpdateIgnoreRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIgnoreRuleRequest.class, UpdateIgnoreRuleResponse.class)
                .withName("UpdateIgnoreRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/ignore/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIgnoreRuleRequest::getPolicyId, UpdateIgnoreRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIgnoreRuleRequest::getRuleId, UpdateIgnoreRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIgnoreRuleRequest::getEnterpriseProjectId,
                UpdateIgnoreRuleRequest::setEnterpriseProjectId));
        builder.<UpdateIgnoreRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIgnoreRuleRequestBody.class),
            f -> f.withMarshaller(UpdateIgnoreRuleRequest::getBody, UpdateIgnoreRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> updateIpGroup =
        genForUpdateIpGroup();

    private static HttpRequestDef<UpdateIpGroupRequest, UpdateIpGroupResponse> genForUpdateIpGroup() {
        // basic
        HttpRequestDef.Builder<UpdateIpGroupRequest, UpdateIpGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIpGroupRequest.class, UpdateIpGroupResponse.class)
                .withName("UpdateIpGroup")
                .withUri("/v1/{project_id}/waf/ip-group/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getId, UpdateIpGroupRequest::setId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getEnterpriseProjectId,
                UpdateIpGroupRequest::setEnterpriseProjectId));
        builder.<UpdateIpGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIpGroupRequestBody.class),
            f -> f.withMarshaller(UpdateIpGroupRequest::getBody, UpdateIpGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> updateLtsInfoConfig =
        genForUpdateLtsInfoConfig();

    private static HttpRequestDef<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> genForUpdateLtsInfoConfig() {
        // basic
        HttpRequestDef.Builder<UpdateLtsInfoConfigRequest, UpdateLtsInfoConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLtsInfoConfigRequest.class, UpdateLtsInfoConfigResponse.class)
                .withName("UpdateLtsInfoConfig")
                .withUri("/v1/{project_id}/waf/config/lts/{ltsconfig_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ltsconfig_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLtsInfoConfigRequest::getLtsconfigId,
                UpdateLtsInfoConfigRequest::setLtsconfigId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLtsInfoConfigRequest::getEnterpriseProjectId,
                UpdateLtsInfoConfigRequest::setEnterpriseProjectId));
        builder.<UpdateLtsInfoConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLtsInfoConfigRequestBody.class),
            f -> f.withMarshaller(UpdateLtsInfoConfigRequest::getBody, UpdateLtsInfoConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForUpdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForUpdatePolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRequest, UpdatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePolicyRequest.class, UpdatePolicyResponse.class)
                .withName("UpdatePolicy")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, UpdatePolicyRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getEnterpriseProjectId,
                UpdatePolicyRequest::setEnterpriseProjectId));
        builder.<UpdatePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, UpdatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> updatePolicyProtectHost =
        genForUpdatePolicyProtectHost();

    private static HttpRequestDef<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> genForUpdatePolicyProtectHost() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyProtectHostRequest, UpdatePolicyProtectHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePolicyProtectHostRequest.class, UpdatePolicyProtectHostResponse.class)
            .withName("UpdatePolicyProtectHost")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyProtectHostRequest::getPolicyId,
                UpdatePolicyProtectHostRequest::setPolicyId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyProtectHostRequest::getEnterpriseProjectId,
                UpdatePolicyProtectHostRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("hosts",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyProtectHostRequest::getHosts, UpdatePolicyProtectHostRequest::setHosts));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> updatePolicyRuleStatus =
        genForUpdatePolicyRuleStatus();

    private static HttpRequestDef<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> genForUpdatePolicyRuleStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRuleStatusRequest, UpdatePolicyRuleStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePolicyRuleStatusRequest.class, UpdatePolicyRuleStatusResponse.class)
            .withName("UpdatePolicyRuleStatus")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/{ruletype}/{rule_id}/status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getPolicyId,
                UpdatePolicyRuleStatusRequest::setPolicyId));
        builder.<UpdatePolicyRuleStatusRequest.RuletypeEnum>withRequestField("ruletype",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRuleStatusRequest.RuletypeEnum.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getRuletype,
                UpdatePolicyRuleStatusRequest::setRuletype));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getRuleId, UpdatePolicyRuleStatusRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getEnterpriseProjectId,
                UpdatePolicyRuleStatusRequest::setEnterpriseProjectId));
        builder.<UpdatePolicyRuleStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyRuleStatusRequestBody.class),
            f -> f.withMarshaller(UpdatePolicyRuleStatusRequest::getBody, UpdatePolicyRuleStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumHostRequest, UpdatePremiumHostResponse> updatePremiumHost =
        genForUpdatePremiumHost();

    private static HttpRequestDef<UpdatePremiumHostRequest, UpdatePremiumHostResponse> genForUpdatePremiumHost() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumHostRequest, UpdatePremiumHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePremiumHostRequest.class, UpdatePremiumHostResponse.class)
                .withName("UpdatePremiumHost")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostRequest::getHostId, UpdatePremiumHostRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostRequest::getEnterpriseProjectId,
                UpdatePremiumHostRequest::setEnterpriseProjectId));
        builder.<UpdatePremiumHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePremiumHostRequestBody.class),
            f -> f.withMarshaller(UpdatePremiumHostRequest::getBody, UpdatePremiumHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> updatePremiumHostProtectStatus =
        genForUpdatePremiumHostProtectStatus();

    private static HttpRequestDef<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> genForUpdatePremiumHostProtectStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePremiumHostProtectStatusRequest, UpdatePremiumHostProtectStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePremiumHostProtectStatusRequest.class,
                    UpdatePremiumHostProtectStatusResponse.class)
                .withName("UpdatePremiumHostProtectStatus")
                .withUri("/v1/{project_id}/premium-waf/host/{host_id}/protect-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("host_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getHostId,
                UpdatePremiumHostProtectStatusRequest::setHostId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getEnterpriseProjectId,
                UpdatePremiumHostProtectStatusRequest::setEnterpriseProjectId));
        builder.<UpdatePremiumHostProtectStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePremiumHostProtectStatusRequestBody.class),
            f -> f.withMarshaller(UpdatePremiumHostProtectStatusRequest::getBody,
                UpdatePremiumHostProtectStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> updatePrivacyRule =
        genForUpdatePrivacyRule();

    private static HttpRequestDef<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> genForUpdatePrivacyRule() {
        // basic
        HttpRequestDef.Builder<UpdatePrivacyRuleRequest, UpdatePrivacyRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePrivacyRuleRequest.class, UpdatePrivacyRuleResponse.class)
                .withName("UpdatePrivacyRule")
                .withUri("/v1/{project_id}/waf/policy/{policy_id}/privacy/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getPolicyId, UpdatePrivacyRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getRuleId, UpdatePrivacyRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getEnterpriseProjectId,
                UpdatePrivacyRuleRequest::setEnterpriseProjectId));
        builder.<UpdatePrivacyRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivacyRuleRequestBody.class),
            f -> f.withMarshaller(UpdatePrivacyRuleRequest::getBody, UpdatePrivacyRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse> updatePunishmentRule =
        genForUpdatePunishmentRule();

    private static HttpRequestDef<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse> genForUpdatePunishmentRule() {
        // basic
        HttpRequestDef.Builder<UpdatePunishmentRuleRequest, UpdatePunishmentRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePunishmentRuleRequest.class, UpdatePunishmentRuleResponse.class)
            .withName("UpdatePunishmentRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/punishment/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePunishmentRuleRequest::getPolicyId, UpdatePunishmentRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePunishmentRuleRequest::getRuleId, UpdatePunishmentRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePunishmentRuleRequest::getEnterpriseProjectId,
                UpdatePunishmentRuleRequest::setEnterpriseProjectId));
        builder.<UpdatePunishmentRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePunishmentRuleRequestBody.class),
            f -> f.withMarshaller(UpdatePunishmentRuleRequest::getBody, UpdatePunishmentRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateValueListRequest, UpdateValueListResponse> updateValueList =
        genForUpdateValueList();

    private static HttpRequestDef<UpdateValueListRequest, UpdateValueListResponse> genForUpdateValueList() {
        // basic
        HttpRequestDef.Builder<UpdateValueListRequest, UpdateValueListResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateValueListRequest.class, UpdateValueListResponse.class)
                .withName("UpdateValueList")
                .withUri("/v1/{project_id}/waf/valuelist/{valuelistid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("valuelistid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateValueListRequest::getValuelistid, UpdateValueListRequest::setValuelistid));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateValueListRequest::getEnterpriseProjectId,
                UpdateValueListRequest::setEnterpriseProjectId));
        builder.<UpdateValueListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateValueListRequestBody.class),
            f -> f.withMarshaller(UpdateValueListRequest::getBody, UpdateValueListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> updateWhiteblackipRule =
        genForUpdateWhiteblackipRule();

    private static HttpRequestDef<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> genForUpdateWhiteblackipRule() {
        // basic
        HttpRequestDef.Builder<UpdateWhiteblackipRuleRequest, UpdateWhiteblackipRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWhiteblackipRuleRequest.class, UpdateWhiteblackipRuleResponse.class)
            .withName("UpdateWhiteblackipRule")
            .withUri("/v1/{project_id}/waf/policy/{policy_id}/whiteblackip/{rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getPolicyId,
                UpdateWhiteblackipRuleRequest::setPolicyId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getRuleId, UpdateWhiteblackipRuleRequest::setRuleId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getEnterpriseProjectId,
                UpdateWhiteblackipRuleRequest::setEnterpriseProjectId));
        builder.<UpdateWhiteBlackIpRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWhiteBlackIpRuleRequestBody.class),
            f -> f.withMarshaller(UpdateWhiteblackipRuleRequest::getBody, UpdateWhiteblackipRuleRequest::setBody));

        // response

        return builder.build();
    }

}
