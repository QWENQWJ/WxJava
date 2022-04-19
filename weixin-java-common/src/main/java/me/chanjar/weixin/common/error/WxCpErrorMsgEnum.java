package me.chanjar.weixin.common.error;

import com.google.common.collect.Maps;
import lombok.Getter;

import java.util.Map;

/**
 * <pre>
 * 企业微信全局错误码.
 * 参考文档：<a href="https://work.weixin.qq.com/api/doc/90000/90139/90313">企业微信全局错误码</a>
 * Created by Binary Wang on 2018/5/13.
 * </pre>
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@Getter
public enum WxCpErrorMsgEnum {
  /**
   * 系统繁忙；服务器暂不可用，建议稍候重试。建议重试次数不超过3次.
   */
  CODE_1(-1, "系统繁忙；服务器暂不可用，建议稍候重试。建议重试次数不超过3次。"),
  /**
   * 请求成功；接口调用成功.
   */
  CODE_0(0, "请求成功；接口调用成功"),
  /**
   * 不合法的secret参数；secret在应用详情/通讯录管理助手可查看.
   */
  CODE_40001(40001, "不合法的secret参数；secret在应用详情/通讯录管理助手可查看"),
  /**
   * 无效的UserID.
   */
  CODE_40003(40003, "无效的UserID"),
  /**
   * 不合法的媒体文件类型；不满足系统文件要求。参考：上传的媒体文件限制.
   */
  CODE_40004(40004, "不合法的媒体文件类型；不满足系统文件要求。参考：上传的媒体文件限制"),
  /**
   * 不合法的type参数；合法的type取值，参考：上传临时素材.
   */
  CODE_40005(40005, "不合法的type参数；合法的type取值，参考：上传临时素材"),
  /**
   * 不合法的文件大小；系统文件要求，参考：上传的媒体文件限制.
   */
  CODE_40006(40006, "不合法的文件大小；系统文件要求，参考：上传的媒体文件限制"),
  /**
   * 不合法的media_id参数.
   */
  CODE_40007(40007, "不合法的media_id参数"),
  /**
   * 不合法的msgtype参数；合法的msgtype取值，参考：消息类型.
   */
  CODE_40008(40008, "不合法的msgtype参数；合法的msgtype取值，参考：消息类型"),
  /**
   * 上传图片大小不是有效值；图片大小的系统限制，参考上传的媒体文件限制.
   */
  CODE_40009(40009, "上传图片大小不是有效值；图片大小的系统限制，参考上传的媒体文件限制"),
  /**
   * 上传视频大小不是有效值；视频大小的系统限制，参考上传的媒体文件限制.
   */
  CODE_40011(40011, "上传视频大小不是有效值；视频大小的系统限制，参考上传的媒体文件限制"),
  /**
   * 不合法的CorpID；需确认CorpID是否填写正确，在 web管理端-设置 可查看.
   */
  CODE_40013(40013, "不合法的CorpID；需确认CorpID是否填写正确，在 web管理端-设置 可查看"),
  /**
   * 不合法的access_token.
   */
  CODE_40014(40014, "不合法的access_token"),
  /**
   * 不合法的按钮个数；菜单按钮1-3个.
   */
  CODE_40016(40016, "不合法的按钮个数；菜单按钮1-3个"),
  /**
   * 不合法的按钮类型；支持的类型，参考：按钮类型.
   */
  CODE_40017(40017, "不合法的按钮类型；支持的类型，参考：按钮类型"),
  /**
   * 不合法的按钮名字长度；长度应不超过16个字节.
   */
  CODE_40018(40018, "不合法的按钮名字长度；长度应不超过16个字节"),
  /**
   * 不合法的按钮KEY长度；长度应不超过128字节.
   */
  CODE_40019(40019, "不合法的按钮KEY长度；长度应不超过128字节"),
  /**
   * 不合法的按钮URL长度；长度应不超过1024字节.
   */
  CODE_40020(40020, "不合法的按钮URL长度；长度应不超过1024字节"),
  /**
   * 不合法的子菜单级数；只能包含一级菜单和二级菜单.
   */
  CODE_40022(40022, "不合法的子菜单级数；只能包含一级菜单和二级菜单"),
  /**
   * 不合法的子菜单按钮个数；子菜单按钮1-5个.
   */
  CODE_40023(40023, "不合法的子菜单按钮个数；子菜单按钮1-5个"),
  /**
   * 不合法的子菜单按钮类型；支持的类型，参考：按钮类型.
   */
  CODE_40024(40024, "不合法的子菜单按钮类型；支持的类型，参考：按钮类型"),
  /**
   * 不合法的子菜单按钮名字长度；支持的类型，参考：按钮类型.
   */
  CODE_40025(40025, "不合法的子菜单按钮名字长度；支持的类型，参考：按钮类型"),
  /**
   * 不合法的子菜单按钮KEY长度；长度应不超过60个字节.
   */
  CODE_40026(40026, "不合法的子菜单按钮KEY长度；长度应不超过60个字节"),
  /**
   * 不合法的子菜单按钮URL长度；长度应不超过1024字节.
   */
  CODE_40027(40027, "不合法的子菜单按钮URL长度；长度应不超过1024字节"),
  /**
   * 不合法的oauth_code.
   */
  CODE_40029(40029, "不合法的oauth_code"),
  /**
   * 不合法的UserID列表；指定的UserID列表，至少存在一个UserID不在通讯录中.
   */
  CODE_40031(40031, "不合法的UserID列表；指定的UserID列表，至少存在一个UserID不在通讯录中"),
  /**
   * 不合法的UserID列表长度.
   */
  CODE_40032(40032, "不合法的UserID列表长度"),
  /**
   * 不合法的请求字符；不能包含\\uxxxx格式的字符.
   */
  CODE_40033(40033, "不合法的请求字符；不能包含\\uxxxx格式的字符"),
  /**
   * 不合法的参数.
   */
  CODE_40035(40035, "不合法的参数"),
  /**
   * chatid不存在；会话需要先创建后，才可修改会话详情或者发起聊天.
   */
  CODE_40050(40050, "chatid不存在；会话需要先创建后，才可修改会话详情或者发起聊天"),
  /**
   * 不合法的子菜单url域名.
   */
  CODE_40054(40054, "不合法的子菜单url域名"),
  /**
   * 不合法的菜单url域名.
   */
  CODE_40055(40055, "不合法的菜单url域名"),
  /**
   * 不合法的agentid.
   */
  CODE_40056(40056, "不合法的agentid"),
  /**
   * 不合法的callbackurl或者callbackurl验证失败；可自助到开发调试工具重现.
   */
  CODE_40057(40057, "不合法的callbackurl或者callbackurl验证失败；可自助到开发调试工具重现"),
  /**
   * 不合法的参数；传递参数不符合系统要求，需要参照具体API接口说明.
   */
  CODE_40058(40058, "不合法的参数；传递参数不符合系统要求，需要参照具体API接口说明"),
  /**
   * 不合法的上报地理位置标志位；开关标志位只能填 0 或者 1.
   */
  CODE_40059(40059, "不合法的上报地理位置标志位；开关标志位只能填 0 或者 1"),
  /**
   * 参数为空.
   */
  CODE_40063(40063, "参数为空"),
  /**
   * 不合法的部门列表；部门列表为空，或者至少存在一个部门ID不存在于通讯录中.
   */
  CODE_40066(40066, "不合法的部门列表；部门列表为空，或者至少存在一个部门ID不存在于通讯录中"),
  /**
   * 不合法的标签ID；标签ID未指定，或者指定的标签ID不存在.
   */
  CODE_40068(40068, "不合法的标签ID；标签ID未指定，或者指定的标签ID不存在"),
  /**
   * 指定的标签范围结点全部无效.
   */
  CODE_40070(40070, "指定的标签范围结点全部无效"),
  /**
   * 不合法的标签名字；标签名字已经存在.
   */
  CODE_40071(40071, "不合法的标签名字；标签名字已经存在"),
  /**
   * 不合法的标签名字长度；不允许为空，最大长度限制为32个字（汉字或英文字母）.
   */
  CODE_40072(40072, "不合法的标签名字长度；不允许为空，最大长度限制为32个字（汉字或英文字母）"),
  /**
   * 不合法的openid；openid不存在，需确认获取来源.
   */
  CODE_40073(40073, "不合法的openid；openid不存在，需确认获取来源"),
  /**
   * news消息不支持保密消息类型；图文消息支持保密类型需改用mpnews.
   */
  CODE_40074(40074, "news消息不支持保密消息类型；图文消息支持保密类型需改用mpnews"),
  /**
   * 不合法的pre_auth_code参数；预授权码不存在，参考：获取预授权码.
   */
  CODE_40077(40077, "不合法的pre_auth_code参数；预授权码不存在，参考：获取预授权码"),
  /**
   * 不合法的auth_code参数；需确认获取来源，并且只能消费一次.
   */
  CODE_40078(40078, "不合法的auth_code参数；需确认获取来源，并且只能消费一次"),
  /**
   * 不合法的suite_secret；套件secret可在第三方管理端套件详情查看.
   */
  CODE_40080(40080, "不合法的suite_secret；套件secret可在第三方管理端套件详情查看"),
  /**
   * 不合法的suite_token.
   */
  CODE_40082(40082, "不合法的suite_token"),
  /**
   * 不合法的suite_id；suite_id不存在.
   */
  CODE_40083(40083, "不合法的suite_id；suite_id不存在"),
  /**
   * 不合法的permanent_code参数.
   */
  CODE_40084(40084, "不合法的permanent_code参数"),
  /**
   * 不合法的的suite_ticket参数；suite_ticket不存在或者已失效.
   */
  CODE_40085(40085, "不合法的的suite_ticket参数；suite_ticket不存在或者已失效"),
  /**
   * 不合法的第三方应用appid；至少有一个不存在应用id.
   */
  CODE_40086(40086, "不合法的第三方应用appid；至少有一个不存在应用id"),
  /**
   * jobid不存在；请检查 jobid 来源.
   */
  CODE_40088(40088, "jobid不存在；请检查 jobid 来源"),
  /**
   * 批量任务的结果已清理；系统仅保存最近5次批量任务的结果。可在通讯录查看实际导入情况.
   */
  CODE_40089(40089, "批量任务的结果已清理；系统仅保存最近5次批量任务的结果。可在通讯录查看实际导入情况"),
  /**
   * secret不合法；可能用了别的企业的secret.
   */
  CODE_40091(40091, "secret不合法；可能用了别的企业的secret"),
  /**
   * 导入文件存在不合法的内容.
   */
  CODE_40092(40092, "导入文件存在不合法的内容"),
  /**
   * 不合法的jsapi_ticket参数；ticket已失效，或者拼写错误.
   */
  CODE_40093(40093, "不合法的jsapi_ticket参数；ticket已失效，或者拼写错误"),
  /**
   * 不合法的URL；缺少主页URL参数，或者URL不合法（链接需要带上协议头，以 http:// 或者 https:// 开头）.
   */
  CODE_40094(40094, "不合法的URL；缺少主页URL参数，或者URL不合法（链接需要带上协议头，以 http:// 或者 https:// 开头）"),
  /**
   * 不合法的外部联系人userid
   */
  CODE_40096(40096,"不合法的外部联系人userid"),
  /**
   * 缺少access_token参数.
   */
  CODE_41001(41001, "缺少access_token参数"),
  /**
   * 缺少corpid参数.
   */
  CODE_41002(41002, "缺少corpid参数"),
  /**
   * 缺少secret参数.
   */
  CODE_41004(41004, "缺少secret参数"),
  /**
   * 缺少media_id参数；media_id为调用接口必填参数，请确认是否有传递.
   */
  CODE_41006(41006, "缺少media_id参数；media_id为调用接口必填参数，请确认是否有传递"),
  /**
   * 缺少auth code参数.
   */
  CODE_41008(41008, "缺少auth code参数"),
  /**
   * 缺少userid参数.
   */
  CODE_41009(41009, "缺少userid参数"),
  /**
   * 缺少url参数.
   */
  CODE_41010(41010, "缺少url参数"),
  /**
   * 缺少agentid参数.
   */
  CODE_41011(41011, "缺少agentid参数"),
  /**
   * 缺少 description 参数；发送文本卡片消息接口，description 是必填字段.
   */
  CODE_41033(41033, "缺少 description 参数；发送文本卡片消息接口，description 是必填字段"),
  /**
   * 缺少title参数；发送图文消息，标题是必填参数。请确认参数是否有传递.
   */
  CODE_41016(41016, "缺少title参数；发送图文消息，标题是必填参数。请确认参数是否有传递。"),
  /**
   * 缺少 department 参数.
   */
  CODE_41019(41019, "缺少 department 参数"),
  /**
   * 缺少tagid参数.
   */
  CODE_41017(41017, "缺少tagid参数"),
  /**
   * 缺少suite_id参数.
   */
  CODE_41021(41021, "缺少suite_id参数"),
  /**
   * 缺少suite_access_token参数.
   */
  CODE_41022(41022, "缺少suite_access_token参数"),
  /**
   * 缺少suite_ticket参数.
   */
  CODE_41023(41023, "缺少suite_ticket参数"),
  /**
   * 缺少secret参数.
   */
  CODE_41024(41024, "缺少secret参数"),
  /**
   * 缺少permanent_code参数.
   */
  CODE_41025(41025, "缺少permanent_code参数"),
  /**
   * access_token已过期；access_token有时效性，需要重新获取一次.
   */
  CODE_42001(42001, "access_token已过期；access_token有时效性，需要重新获取一次"),
  /**
   * pre_auth_code已过期；pre_auth_code有时效性，需要重新获取一次.
   */
  CODE_42007(42007, "pre_auth_code已过期；pre_auth_code有时效性，需要重新获取一次"),
  /**
   * suite_access_token已过期；suite_access_token有时效性，需要重新获取一次.
   */
  CODE_42009(42009, "suite_access_token已过期；suite_access_token有时效性，需要重新获取一次"),
  /**
   * 指定的userid未绑定微信或未关注微信插件；需要成员使用微信登录企业微信或者关注微信插件才能获取openid.
   */
  CODE_43004(43004, "指定的userid未绑定微信或未关注微信插件；需要成员使用微信登录企业微信或者关注微信插件才能获取openid"),
  /**
   * 多媒体文件为空；上传格式参考：上传临时素材，确认header和body的内容正确.
   */
  CODE_44001(44001, "多媒体文件为空；上传格式参考：上传临时素材，确认header和body的内容正确。"),
  /**
   * 文本消息content参数为空；发文本消息content为必填参数，且不能为空.
   */
  CODE_44004(44004, "文本消息content参数为空；发文本消息content为必填参数，且不能为空"),
  /**
   * 多媒体文件大小超过限制；图片不可超过5M；音频不可超过5M；文件不可超过20M.
   */
  CODE_45001(45001, "多媒体文件大小超过限制；图片不可超过5M；音频不可超过5M；文件不可超过20M"),
  /**
   * 消息内容大小超过限制.
   */
  CODE_45002(45002, "消息内容大小超过限制"),
  /**
   * 应用description参数长度不符合系统限制；设置应用若带有description参数，则长度必须为4至120个字符.
   */
  CODE_45004(45004, "应用description参数长度不符合系统限制；设置应用若带有description参数，则长度必须为4至120个字符"),
  /**
   * 语音播放时间超过限制；语音播放时长不能超过60秒.
   */
  CODE_45007(45007, "语音播放时间超过限制；语音播放时长不能超过60秒"),
  /**
   * 图文消息的文章数量不符合系统限制；图文消息的文章数量不能超过8条.
   */
  CODE_45008(45008, "图文消息的文章数量不符合系统限制；图文消息的文章数量不能超过8条"),
  /**
   * 接口调用超过限制.
   */
  CODE_45009(45009, "接口调用超过限制"),
  /**
   * 应用name参数长度不符合系统限制；设置应用若带有name参数，则不允许为空，且不超过32个字符.
   */
  CODE_45022(45022, "应用name参数长度不符合系统限制；设置应用若带有name参数，则不允许为空，且不超过32个字符"),
  /**
   * 帐号数量超过上限.
   */
  CODE_45024(45024, "帐号数量超过上限"),
  /**
   * 触发删除用户数的保护；限制参考：全量覆盖成员.
   */
  CODE_45026(45026, "触发删除用户数的保护；限制参考：全量覆盖成员"),
  /**
   * 图文消息author参数长度超过限制；最长64个字节.
   */
  CODE_45032(45032, "图文消息author参数长度超过限制；最长64个字节"),
  /**
   * 接口并发调用超过限制.
   */
  CODE_45033(45033, "接口并发调用超过限制"),
  /**
   * 菜单未设置；菜单需发布后才能获取到数据.
   */
  CODE_46003(46003, "菜单未设置；菜单需发布后才能获取到数据"),
  /**
   * 指定的用户不存在；需要确认指定的用户存在于通讯录中.
   */
  CODE_46004(46004, "指定的用户不存在；需要确认指定的用户存在于通讯录中"),
  /**
   * API接口无权限调用.
   */
  CODE_48002(48002, "API接口无权限调用"),
  /**
   * 不合法的suite_id；确认suite_access_token由指定的suite_id生成.
   */
  CODE_48003(48003, "不合法的suite_id；确认suite_access_token由指定的suite_id生成"),
  /**
   * 授权关系无效；可能是无授权或授权已被取消.
   */
  CODE_48004(48004, "授权关系无效；可能是无授权或授权已被取消"),
  /**
   * API接口已废弃；接口已不再支持，建议改用新接口或者新方案.
   */
  CODE_48005(48005, "API接口已废弃；接口已不再支持，建议改用新接口或者新方案"),
  /**
   * redirect_url未登记可信域名.
   */
  CODE_50001(50001, "redirect_url未登记可信域名"),
  /**
   * 成员不在权限范围；请检查应用或管理组的权限范围.
   */
  CODE_50002(50002, "成员不在权限范围；请检查应用或管理组的权限范围"),
  /**
   * 应用已禁用；禁用的应用无法使用API接口。可在”管理端-企业应用”启用应用.
   */
  CODE_50003(50003, "应用已禁用；禁用的应用无法使用API接口。可在”管理端-企业应用”启用应用"),
  /**
   * 部门长度不符合限制；部门名称不能为空且长度不能超过32个字.
   */
  CODE_60001(60001, "部门长度不符合限制；部门名称不能为空且长度不能超过32个字"),
  /**
   * 部门ID不存在；需要确认部门ID是否有带，并且存在通讯录中.
   */
  CODE_60003(60003, "部门ID不存在；需要确认部门ID是否有带，并且存在通讯录中"),
  /**
   * 父部门不存在；需要确认父亲部门ID是否有带，并且存在通讯录中.
   */
  CODE_60004(60004, "父部门不存在；需要确认父亲部门ID是否有带，并且存在通讯录中"),
  /**
   * 部门下存在成员；不允许删除有成员的部门.
   */
  CODE_60005(60005, "部门下存在成员；不允许删除有成员的部门"),
  /**
   * 部门下存在子部门；不允许删除有子部门的部门.
   */
  CODE_60006(60006, "部门下存在子部门；不允许删除有子部门的部门"),
  /**
   * 不允许删除根部门.
   */
  CODE_60007(60007, "不允许删除根部门"),
  /**
   * 部门已存在；部门ID或者部门名称已存在.
   */
  CODE_60008(60008, "部门已存在；部门ID或者部门名称已存在"),
  /**
   * 部门名称含有非法字符；不能含有 \\:?*“< >| 等字符.
   */
  CODE_60009(60009, "部门名称含有非法字符；不能含有 \\ :?*“< >| 等字符"),
  /**
   * 部门存在循环关系.
   */
  CODE_60010(60010, "部门存在循环关系"),
  /**
   * 指定的成员/部门/标签参数无权限.
   */
  CODE_60011(60011, "指定的成员/部门/标签参数无权限"),
  /**
   * 不允许删除默认应用；默认应用的id为0.
   */
  CODE_60012(60012, "不允许删除默认应用；默认应用的id为0"),
  /**
   * 访问ip不在白名单之中；请确认访问ip是否在服务商白名单IP列表.
   */
  CODE_60020(60020, "访问ip不在白名单之中；请确认访问ip是否在服务商白名单IP列表"),
  /**
   * 不允许修改第三方应用的主页 URL；第三方应用类型，不允许通过接口修改该应用的主页 URL.
   */
  CODE_60028(60028, "不允许修改第三方应用的主页 URL；第三方应用类型，不允许通过接口修改该应用的主页 URL"),
  /**
   * UserID已存在.
   */
  CODE_60102(60102, "UserID已存在"),
  /**
   * 手机号码不合法；长度不超过32位，字符仅支持数字，加号和减号.
   */
  CODE_60103(60103, "手机号码不合法；长度不超过32位，字符仅支持数字，加号和减号"),
  /**
   * 手机号码已存在；同一个企业内，成员的手机号不能重复。建议更换手机号，或者更新已有的手机记录.
   */
  CODE_60104(60104, "手机号码已存在；同一个企业内，成员的手机号不能重复。建议更换手机号，或者更新已有的手机记录。"),
  /**
   * 邮箱不合法；长度不超过64位，且为有效的email格式.
   */
  CODE_60105(60105, "邮箱不合法；长度不超过64位，且为有效的email格式"),
  /**
   * 邮箱已存在；同一个企业内，成员的邮箱不能重复。建议更换邮箱，或者更新已有的邮箱记录.
   */
  CODE_60106(60106, "邮箱已存在；同一个企业内，成员的邮箱不能重复。建议更换邮箱，或者更新已有的邮箱记录。"),
  /**
   * 微信号不合法；微信号格式由字母、数字、”-“、”_“组成，长度为 3-20 字节，首字符必须是字母或”-“或”_“.
   */
  CODE_60107(60107, "微信号不合法；微信号格式由字母、数字、”-“、”_“组成，长度为 3-20 字节，首字符必须是字母或”-“或”_“"),
  /**
   * 用户所属部门数量超过限制；用户同时归属部门不超过20个.
   */
  CODE_60110(60110, "用户所属部门数量超过限制；用户同时归属部门不超过20个"),
  /**
   * UserID不存在；UserID参数为空，或者不存在通讯录中.
   */
  CODE_60111(60111, "UserID不存在；UserID参数为空，或者不存在通讯录中"),
  /**
   * 成员name参数不合法；不能为空，且不能超过64字符.
   */
  CODE_60112(60112, "成员name参数不合法；不能为空，且不能超过64字符"),
  /**
   * 无效的部门id；部门不存在通讯录中.
   */
  CODE_60123(60123, "无效的部门id；部门不存在通讯录中"),
  /**
   * 无效的父部门id；父部门不存在通讯录中.
   */
  CODE_60124(60124, "无效的父部门id；父部门不存在通讯录中"),
  /**
   * 非法部门名字；不能为空，且不能超过64字节，且不能含有\\:*?”< >|等字符.
   */
  CODE_60125(60125, "非法部门名字；不能为空，且不能超过64字节，且不能含有\\:*?”< >|等字符"),
  /**
   * 缺少department参数.
   */
  CODE_60127(60127, "缺少department参数"),
  /**
   * 成员手机和邮箱都为空；成员手机和邮箱至少有个非空.
   */
  CODE_60129(60129, "成员手机和邮箱都为空；成员手机和邮箱至少有个非空"),
  /**
   * 发票已被其他公众号锁定.
   */
  CODE_72023(72023, "发票已被其他公众号锁定"),
  /**
   * 发票状态错误；reimburse_status状态错误，参考：更新发票状态.
   */
  CODE_72024(72024, "发票状态错误；reimburse_status状态错误，参考：更新发票状态"),
  /**
   * 存在发票不属于该用户；只能批量更新该openid的发票，参考：批量更新发票状态.
   */
  CODE_72037(72037, "存在发票不属于该用户；只能批量更新该openid的发票，参考：批量更新发票状态"),
  /**
   * 可信域名不正确，或者无ICP备案.
   */
  CODE_80001(80001, "可信域名不正确，或者无ICP备案"),
  /**
   * 部门下的结点数超过限制（3W）.
   */
  CODE_81001(81001, "部门下的结点数超过限制（3W）"),
  /**
   * 部门最多15层.
   */
  CODE_81002(81002, "部门最多15层"),
  /**
   * 无权限操作标签.
   */
  CODE_81011(81011, "无权限操作标签"),
  /**
   * UserID、部门ID、标签ID全部非法或无权限.
   */
  CODE_81013(81013, "UserID、部门ID、标签ID全部非法或无权限"),
  /**
   * 标签添加成员，单次添加user或party过多.
   */
  CODE_81014(81014, "标签添加成员，单次添加user或party过多"),
  /**
   * 指定的成员/部门/标签全部无效.
   */
  CODE_82001(82001, "指定的成员/部门/标签全部无效"),
  /**
   * 不合法的PartyID列表长度；发消息，单次不能超过100个部门.
   */
  CODE_82002(82002, "不合法的PartyID列表长度；发消息，单次不能超过100个部门"),
  /**
   * 不合法的TagID列表长度；发消息，单次不能超过100个标签.
   */
  CODE_82003(82003, "不合法的TagID列表长度；发消息，单次不能超过100个标签"),
  /**
   * 成员票据过期.
   */
  CODE_84014(84014, "成员票据过期"),
  /**
   * 成员票据无效；确认user_ticket参数来源是否正确。参考接口：根据code获取成员信息.
   */
  CODE_84015(84015, "成员票据无效；确认user_ticket参数来源是否正确。参考接口：根据code获取成员信息"),
  /**
   * 缺少templateid参数.
   */
  CODE_84019(84019, "缺少templateid参数"),
  /**
   * templateid不存在；确认参数是否有带，并且已创建.
   */
  CODE_84020(84020, "templateid不存在；确认参数是否有带，并且已创建"),
  /**
   * 缺少register_code参数.
   */
  CODE_84021(84021, "缺少register_code参数"),
  /**
   * 无效的register_code参数.
   */
  CODE_84022(84022, "无效的register_code参数"),
  /**
   * 不允许调用设置通讯录同步完成接口.
   */
  CODE_84023(84023, "不允许调用设置通讯录同步完成接口"),
  /**
   * 无注册信息.
   */
  CODE_84024(84024, "无注册信息"),
  /**
   * 不符合的state参数；必须是[a-zA-Z0-9]的参数值，长度不可超过128个字节.
   */
  CODE_84025(84025, "不符合的state参数；必须是[a-zA-Z0-9]的参数值，长度不可超过128个字节"),
  /**
   * 缺少caller参数.
   */
  CODE_84052(84052, "缺少caller参数"),
  /**
   * 缺少callee参数.
   */
  CODE_84053(84053, "缺少callee参数"),
  /**
   * 缺少auth_corpid参数.
   */
  CODE_84054(84054, "缺少auth_corpid参数"),
  /**
   * 超过拨打公费电话频率。排查方法：同一个客服5秒内只能调用api拨打一次公费电话
   */
  CODE_84055(84055, "超过拨打公费电话频率。排查方法：同一个客服5秒内只能调用api拨打一次公费电话"),
  /**
   * 被拨打用户安装应用时未授权拨打公费电话权限.
   */
  CODE_84056(84056, "被拨打用户安装应用时未授权拨打公费电话权限"),
  /**
   * 公费电话余额不足.
   */
  CODE_84057(84057, "公费电话余额不足"),
  /**
   * caller
   */
  CODE_84058(84058, "caller 呼叫号码不支持"),
  /**
   * 号码非法.
   */
  CODE_84059(84059, "号码非法"),
  /**
   * callee
   */
  CODE_84060(84060, "callee 呼叫号码不支持"),
  /**
   * 不存在外部联系人的关系.
   */
  CODE_84061(84061, "不存在外部联系人的关系"),
  /**
   * 未开启公费电话应用.
   */
  CODE_84062(84062, "未开启公费电话应用"),
  /**
   * caller不存在.
   */
  CODE_84063(84063, "caller不存在"),
  /**
   * callee不存在.
   */
  CODE_84064(84064, "callee不存在"),
  /**
   * caller跟callee电话号码一致。排查方法：不允许自己拨打给自己
   */
  CODE_84065(84065, "caller跟callee电话号码一致。排查方法：不允许自己拨打给自己"),
  /**
   * 服务商拨打次数超过限制。排查方法：单个企业管理员，在一天（以上午10
   */
  CODE_84066(84066, "服务商拨打次数超过限制。排查方法：单个企业管理员，在一天（以上午10:00为起始时间）内，对应单个服务商，只能被呼叫【4】次。"),
  /**
   * 管理员收到的服务商公费电话个数超过限制。排查方法：单个企业管理员，在一天（以上午10
   */
  CODE_84067(84067, "管理员收到的服务商公费电话个数超过限制。排查方法：单个企业管理员，在一天（以上午10:00为起始时间）内，一共只能被【3】个服务商成功呼叫。"),
  /**
   * 拨打方被限制拨打公费电话.
   */
  CODE_84069(84069, "拨打方被限制拨打公费电话"),
  /**
   * 不支持的电话号码。排查方法：拨打方或者被拨打方电话号码不支持
   */
  CODE_84070(84070, "不支持的电话号码。排查方法：拨打方或者被拨打方电话号码不支持"),
  /**
   * 不合法的外部联系人授权码。排查方法：非法或者已经消费过
   */
  CODE_84071(84071, "不合法的外部联系人授权码。排查方法：非法或者已经消费过"),
  /**
   * 应用未配置客服.
   */
  CODE_84072(84072, "应用未配置客服"),
  /**
   * 客服userid不在应用配置的客服列表中.
   */
  CODE_84073(84073, "客服userid不在应用配置的客服列表中"),
  /**
   * 没有外部联系人权限.
   */
  CODE_84074(84074, "没有外部联系人权限"),
  /**
   * 不合法或过期的authcode.
   */
  CODE_84075(84075, "不合法或过期的authcode"),
  /**
   * 缺失authcode.
   */
  CODE_84076(84076, "缺失authcode"),
  /**
   * 订单价格过高，无法受理.
   */
  CODE_84077(84077, "订单价格过高，无法受理"),
  /**
   * 购买人数不正确.
   */
  CODE_84078(84078, "购买人数不正确"),
  /**
   * 价格策略不存在.
   */
  CODE_84079(84079, "价格策略不存在"),
  /**
   * 订单不存在.
   */
  CODE_84080(84080, "订单不存在"),
  /**
   * 存在未支付订单.
   */
  CODE_84081(84081, "存在未支付订单"),
  /**
   * 存在申请退款中的订单.
   */
  CODE_84082(84082, "存在申请退款中的订单"),
  /**
   * 非服务人员.
   */
  CODE_84083(84083, "非服务人员"),
  /**
   * 非跟进用户.
   */
  CODE_84084(84084, "非跟进用户"),
  /**
   * 应用已下架.
   */
  CODE_84085(84085, "应用已下架"),
  /**
   * 订单人数超过可购买最大人数.
   */
  CODE_84086(84086, "订单人数超过可购买最大人数"),
  /**
   * 打开订单支付前禁止关闭订单.
   */
  CODE_84087(84087, "打开订单支付前禁止关闭订单"),
  /**
   * 禁止关闭已支付的订单.
   */
  CODE_84088(84088, "禁止关闭已支付的订单"),
  /**
   * 订单已支付.
   */
  CODE_84089(84089, "订单已支付"),
  /**
   * 缺失user_ticket.
   */
  CODE_84090(84090, "缺失user_ticket"),
  /**
   * 订单价格不可低于下限.
   */
  CODE_84091(84091, "订单价格不可低于下限"),
  /**
   * 无法发起代下单操作.
   */
  CODE_84092(84092, "无法发起代下单操作"),
  /**
   * 代理关系已占用，无法代下单.
   */
  CODE_84093(84093, "代理关系已占用，无法代下单"),
  /**
   * 该应用未配置代理分润规则，请先联系应用服务商处理.
   */
  CODE_84094(84094, "该应用未配置代理分润规则，请先联系应用服务商处理"),
  /**
   * 免费试用版，无法扩容.
   */
  CODE_84095(84095, "免费试用版，无法扩容"),
  /**
   * 免费试用版，无法续期.
   */
  CODE_84096(84096, "免费试用版，无法续期"),
  /**
   * 当前企业有未处理订单.
   */
  CODE_84097(84097, "当前企业有未处理订单"),
  /**
   * 固定总量，无法扩容.
   */
  CODE_84098(84098, "固定总量，无法扩容"),
  /**
   * 非购买状态，无法扩容.
   */
  CODE_84099(84099, "非购买状态，无法扩容"),
  /**
   * 未购买过此应用，无法续期.
   */
  CODE_84100(84100, "未购买过此应用，无法续期"),
  /**
   * 企业已试用付费版本，无法全新购买.
   */
  CODE_84101(84101, "企业已试用付费版本，无法全新购买"),
  /**
   * 企业当前应用状态已过期，无法扩容.
   */
  CODE_84102(84102, "企业当前应用状态已过期，无法扩容"),
  /**
   * 仅可修改未支付订单.
   */
  CODE_84103(84103, "仅可修改未支付订单"),
  /**
   * 订单已支付，无法修改.
   */
  CODE_84104(84104, "订单已支付，无法修改"),
  /**
   * 订单已被取消，无法修改.
   */
  CODE_84105(84105, "订单已被取消，无法修改"),
  /**
   * 企业含有该应用的待支付订单，无法代下单.
   */
  CODE_84106(84106, "企业含有该应用的待支付订单，无法代下单"),
  /**
   * 企业含有该应用的退款中订单，无法代下单.
   */
  CODE_84107(84107, "企业含有该应用的退款中订单，无法代下单"),
  /**
   * 企业含有该应用的待生效订单，无法代下单.
   */
  CODE_84108(84108, "企业含有该应用的待生效订单，无法代下单"),
  /**
   * 订单定价不能未0.
   */
  CODE_84109(84109, "订单定价不能未0"),
  /**
   * 新安装应用不在试用状态，无法升级为付费版.
   */
  CODE_84110(84110, "新安装应用不在试用状态，无法升级为付费版"),
  /**
   * 无足够可用优惠券.
   */
  CODE_84111(84111, "无足够可用优惠券"),
  /**
   * 无法关闭未支付订单.
   */
  CODE_84112(84112, "无法关闭未支付订单"),
  /**
   * 无付费信息.
   */
  CODE_84113(84113, "无付费信息"),
  /**
   * 虚拟版本不支持下单.
   */
  CODE_84114(84114, "虚拟版本不支持下单"),
  /**
   * 虚拟版本不支持扩容.
   */
  CODE_84115(84115, "虚拟版本不支持扩容"),
  /**
   * 虚拟版本不支持续期.
   */
  CODE_84116(84116, "虚拟版本不支持续期"),
  /**
   * 在虚拟正式版期内不能扩容.
   */
  CODE_84117(84117, "在虚拟正式版期内不能扩容"),
  /**
   * 虚拟正式版期内不能变更版本.
   */
  CODE_84118(84118, "虚拟正式版期内不能变更版本"),
  /**
   * 当前企业未报备，无法进行代下单.
   */
  CODE_84119(84119, "当前企业未报备，无法进行代下单"),
  /**
   * 当前应用版本已删除.
   */
  CODE_84120(84120, "当前应用版本已删除"),
  /**
   * 应用版本已删除，无法扩容.
   */
  CODE_84121(84121, "应用版本已删除，无法扩容"),
  /**
   * 应用版本已删除，无法续期.
   */
  CODE_84122(84122, "应用版本已删除，无法续期"),
  /**
   * 非虚拟版本，无法升级.
   */
  CODE_84123(84123, "非虚拟版本，无法升级"),
  /**
   * 非行业方案订单，不能添加部分应用版本的订单.
   */
  CODE_84124(84124, "非行业方案订单，不能添加部分应用版本的订单"),
  /**
   * 购买人数不能少于最少购买人数.
   */
  CODE_84125(84125, "购买人数不能少于最少购买人数"),
  /**
   * 购买人数不能多于最大购买人数.
   */
  CODE_84126(84126, "购买人数不能多于最大购买人数"),
  /**
   * 无应用管理权限.
   */
  CODE_84127(84127, "无应用管理权限"),
  /**
   * 无该行业方案下全部应用的管理权限.
   */
  CODE_84128(84128, "无该行业方案下全部应用的管理权限"),
  /**
   * 付费策略已被删除，无法下单.
   */
  CODE_84129(84129, "付费策略已被删除，无法下单"),
  /**
   * 订单生效时间不合法.
   */
  CODE_84130(84130, "订单生效时间不合法"),
  /**
   * 文件转译解析错误。排查方法：只支持utf8文件转译，可能是不支持的文件类型或者格式
   */
  CODE_84200(84200, "文件转译解析错误。排查方法：只支持utf8文件转译，可能是不支持的文件类型或者格式"),
  /**
   * 包含不合法的词语.
   */
  CODE_85002(85002, "包含不合法的词语"),
  /**
   * 每企业每个月设置的可信域名不可超过20个.
   */
  CODE_85004(85004, "每企业每个月设置的可信域名不可超过20个"),
  /**
   * 可信域名未通过所有权校验.
   */
  CODE_85005(85005, "可信域名未通过所有权校验"),
  /**
   * 参数 chatid 不合法.
   */
  CODE_86001(86001, "参数 chatid 不合法"),
  /**
   * 参数 chatid 不存在.
   */
  CODE_86003(86003, "参数 chatid 不存在"),
  /**
   * 参数 群名不合法.
   */
  CODE_86004(86004, "参数 群名不合法"),
  /**
   * 参数 群主不合法.
   */
  CODE_86005(86005, "参数 群主不合法"),
  /**
   * 群成员数过多或过少.
   */
  CODE_86006(86006, "群成员数过多或过少"),
  /**
   * 不合法的群成员.
   */
  CODE_86007(86007, "不合法的群成员"),
  /**
   * 非法操作非自己创建的群.
   */
  CODE_86008(86008, "非法操作非自己创建的群"),
  /**
   * 存在非法会话成员ID.
   */
  CODE_86216(86216, "存在非法会话成员ID"),
  /**
   * 会话发送者不在会话成员列表中；会话的发送者，必须是会话的成员列表之一.
   */
  CODE_86217(86217, "会话发送者不在会话成员列表中；会话的发送者，必须是会话的成员列表之一"),
  /**
   * 指定的会话参数不合法.
   */
  CODE_86220(86220, "指定的会话参数不合法"),
  /**
   * 未认证摇一摇周边.
   */
  CODE_90001(90001, "未认证摇一摇周边"),
  /**
   * 缺少摇一摇周边ticket参数.
   */
  CODE_90002(90002, "缺少摇一摇周边ticket参数"),
  /**
   * 摇一摇周边ticket参数不合法.
   */
  CODE_90003(90003, "摇一摇周边ticket参数不合法"),
  /**
   * 非法的对外属性类型.
   */
  CODE_90100(90100, "非法的对外属性类型"),
  /**
   * 对外属性：文本类型长度不合法；文本长度不可超过12个UTF8字符.
   */
  CODE_90101(90101, "对外属性：文本类型长度不合法；文本长度不可超过12个UTF8字符"),
  /**
   * 对外属性：网页类型标题长度不合法；标题长度不可超过12个UTF8字符.
   */
  CODE_90102(90102, "对外属性：网页类型标题长度不合法；标题长度不可超过12个UTF8字符"),
  /**
   * 对外属性：网页url不合法.
   */
  CODE_90103(90103, "对外属性：网页url不合法"),
  /**
   * 对外属性：小程序类型标题长度不合法；标题长度不可超过12个UTF8字符.
   */
  CODE_90104(90104, "对外属性：小程序类型标题长度不合法；标题长度不可超过12个UTF8字符"),
  /**
   * 对外属性：小程序类型pagepath不合法.
   */
  CODE_90105(90105, "对外属性：小程序类型pagepath不合法"),
  /**
   * 对外属性：请求参数不合法.
   */
  CODE_90106(90106, "对外属性：请求参数不合法"),
  /**
   * 获取ticket的类型无效.
   */
  CODE_91040(91040, "获取ticket的类型无效"),
  /**
   * 无权限操作指定的应用.
   */
  CODE_301002(301002, "无权限操作指定的应用"),
  /**
   * 不允许删除创建者；创建者不允许从通讯录中删除。如果需要删除该成员，需要先在WEB管理端转移创建者身份.
   */
  CODE_301005(301005, "不允许删除创建者；创建者不允许从通讯录中删除。如果需要删除该成员，需要先在WEB管理端转移创建者身份。"),
  /**
   * 参数 position 不合法；长度不允许超过128个字符.
   */
  CODE_301012(301012, "参数 position 不合法；长度不允许超过128个字符"),
  /**
   * 参数 telephone 不合法；telephone必须由1-32位的纯数字或’-‘号组成.
   */
  CODE_301013(301013, "参数 telephone 不合法；telephone必须由1-32位的纯数字或’-‘号组成。"),
  /**
   * 参数 english_name 不合法；参数如果有传递，不允许为空字符串，同时不能超过64字节，只能是由字母、数字、点(.)、减号(-)、空格或下划线(_)组成.
   */
  CODE_301014(301014, "参数 english_name 不合法；参数如果有传递，不允许为空字符串，同时不能超过64字节，只能是由字母、数字、点(.)、减号(-)、空格或下划线(_)组成"),
  /**
   * 参数 mediaid 不合法；请检查 mediaid 来源，应该通过上传临时素材的图片类型获得mediaid.
   */
  CODE_301015(301015, "参数 mediaid 不合法；请检查 mediaid 来源，应该通过上传临时素材的图片类型获得mediaid"),
  /**
   * 上传语音文件不符合系统要求；语音文件的系统限制，参考上传的媒体文件限制.
   */
  CODE_301016(301016, "上传语音文件不符合系统要求；语音文件的系统限制，参考上传的媒体文件限制"),
  /**
   * 上传语音文件仅支持AMR格式；语音文件的系统限制，参考上传的媒体文件限制.
   */
  CODE_301017(301017, "上传语音文件仅支持AMR格式；语音文件的系统限制，参考上传的媒体文件限制"),
  /**
   * 参数 userid 无效；至少有一个userid不存在于通讯录中.
   */
  CODE_301021(301021, "参数 userid 无效；至少有一个userid不存在于通讯录中"),
  /**
   * 获取打卡数据失败；系统失败，可重试处理.
   */
  CODE_301022(301022, "获取打卡数据失败；系统失败，可重试处理"),
  /**
   * useridlist非法或超过限额；列表数量不能为0且不超过100.
   */
  CODE_301023(301023, "useridlist非法或超过限额；列表数量不能为0且不超过100"),
  /**
   * 获取打卡记录时间间隔超限；保证开始时间大于0 且结束时间大于 0 且结束时间大于开始时间，且间隔少于93天.
   */
  CODE_301024(301024, "获取打卡记录时间间隔超限；保证开始时间大于0 且结束时间大于 0 且结束时间大于开始时间，且间隔少于93天"),
  /**
   * 提交审批单请求参数错误
   */
  CODE_301025(301025, "提交审批单请求参数错误"),
  /**
   * 不允许更新该用户的userid.
   */
  CODE_301036(301036, "不允许更新该用户的userid"),
  /**
   * 无审批应用权限,或者提单者不在审批应用/自建应用的可见范围
   */
  CODE_301055(301055, "无审批应用权限,或者提单者不在审批应用/自建应用的可见范围"),
  /**
   * 审批应用已停用
   */
  CODE_301056(301056, "审批应用已停用"),
  /**
   * 通用错误码，提交审批单内部接口失败
   */
  CODE_301057(301057, "通用错误码，提交审批单内部接口失败"),
  /**
   * 批量导入任务的文件中userid有重复.
   */
  CODE_302003(302003, "批量导入任务的文件中userid有重复"),
  /**
   * 组织架构不合法（1不是一棵树，2 多个一样的partyid，3 partyid空，4 partyid name 空，5 同一个父节点下有两个子节点 部门名字一样 可能是以上情况，请一一排查）.
   */
  CODE_302004(302004, "组织架构不合法（1不是一棵树，2 多个一样的partyid，3 partyid空，4 partyid name 空，5 同一个父节点下有两个子节点 部门名字一样 可能是以上情况，请一一排查）"),
  /**
   * 批量导入系统失败，请重新尝试导入.
   */
  CODE_302005(302005, "批量导入系统失败，请重新尝试导入"),
  /**
   * 批量导入任务的文件中partyid有重复.
   */
  CODE_302006(302006, "批量导入任务的文件中partyid有重复"),
  /**
   * 批量导入任务的文件中，同一个部门下有两个子部门名字一样.
   */
  CODE_302007(302007, "批量导入任务的文件中，同一个部门下有两个子部门名字一样"),
  /**
   * CorpId参数无效；指定的CorpId不存在.
   */
  CODE_2000002(2000002, "CorpId参数无效；指定的CorpId不存在");

  private final int code;
  private final String msg;

  WxCpErrorMsgEnum(int code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  static final Map<Integer, String> valueMap = Maps.newHashMap();

  static {
    for (WxCpErrorMsgEnum value : WxCpErrorMsgEnum.values()) {
      valueMap.put(value.code, value.msg);
    }
  }

  /**
   * 通过错误代码查找其中文含义..
   */
  public static String findMsgByCode(int code) {
    return valueMap.getOrDefault(code, null);
  }
}
