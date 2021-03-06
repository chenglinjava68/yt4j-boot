package cn.yt4j.sys.test;

import cn.hutool.crypto.asymmetric.RSA;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class SysTest {

	@Autowired
	private PasswordEncoder encoder;


	@Test
	public void password() {
		System.out.println(encoder.encode("123456"));
	}


	@Test
	public void rsa() {


		RSA rsa = new RSA();

		// 获得私钥
		rsa.getPrivateKeyBase64();
		System.out.println(rsa.getPrivateKeyBase64());
		// 获得公钥
		System.out.println(rsa.getPublicKeyBase64());
		rsa.getPublicKeyBase64();

		//// 公钥加密，私钥解密
		// byte[] encrypt = rsa.encrypt(StrUtil.bytes("我是一段测试aaaa",
		//// CharsetUtil.CHARSET_UTF_8), KeyType.PublicKey);
		// byte[] decrypt = rsa.decrypt(encrypt, KeyType.PrivateKey);
		//
		//// Junit单元测试
		//// Assert.assertEquals("我是一段测试aaaa", StrUtil.str(decrypt,
		//// CharsetUtil.CHARSET_UTF_8));
		//
		//// 私钥加密，公钥解密
		// byte[] encrypt2 = rsa.encrypt(StrUtil.bytes("我是一段测试aaaa",
		//// CharsetUtil.CHARSET_UTF_8), KeyType.PrivateKey);
		// byte[] decrypt2 = rsa.decrypt(encrypt2, KeyType.PublicKey);

		// Assertions.assertEquals("我是一段测试aaaa", StrUtil.str(decrypt2,
		// CharsetUtil.CHARSET_UTF_8));
		// Junit单元测试
		// Assert.assertEquals("我是一段测试aaaa", StrUtil.str(decrypt2,
		// CharsetUtil.CHARSET_UTF_8));

	}

}
