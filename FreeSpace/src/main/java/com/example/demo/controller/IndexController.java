package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.controller.form.IndexForm;

@Controller
public class IndexController {

	@Autowired
    MessageSource messageSource;
	
	/*
	 * トップページへ遷移
	 */
	@RequestMapping(value = {"/", "/index"})
	public String Index(@ModelAttribute("login") IndexForm index, Model model) {
		return "index";
	}
	
	/*
	 * タイムラインへ遷移
	 */
	@RequestMapping("/timeline")
	public String TimeLine(@ModelAttribute("login") IndexForm index, Model model) {
		
		return "timeline";
	}
	
	/*
	 * 投稿入力画面へ遷移
	 */
	@RequestMapping("/output")
	public String Output(@ModelAttribute("login") IndexForm index, Model model) {
		
		return "output";
	}
	
	/*
	 * マイページへ遷移
	 */
	@RequestMapping(value = "/serch")
	public String Serch(@ModelAttribute("login") IndexForm index, Model model) {
		return "serch";
	}
	
	/*
	 * マイページへ遷移
	 */
	@RequestMapping(value = "/mypage")
	public String MyPage(@ModelAttribute("login") IndexForm index, Model model) {
		return "mypage";
	}
	
	/*
	 * ログイン
	 */
	@RequestMapping(value = "/top", params = "login", method = RequestMethod.POST)
	public String Login(@Validated @ModelAttribute("login") IndexForm index, Model model) {
		return "timeline";
	}
	
	/*
	 * 新規登録
	 */
	@RequestMapping(value = "/top", params = "create", method = RequestMethod.POST)
	public String CreateAccount(@Validated @ModelAttribute("login") IndexForm index, Model model) {
		return "createaccount";
	}
	
	/*
	 * ログアウト
	 */
	@RequestMapping("/logout")
	public String Logout(@ModelAttribute("login") IndexForm index, Model model) {
		return "logout";
	}
}
