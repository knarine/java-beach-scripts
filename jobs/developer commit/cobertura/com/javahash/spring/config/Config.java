<tr class="noCover">
<td class="line"><a name='1'/>1</td>
<td class="hits"/>
<td class="code">package&nbsp;com.javahash.spring.config;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='2'/>2</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='3'/>3</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.context.annotation.Bean;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='4'/>4</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.context.annotation.ComponentScan;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='5'/>5</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.context.annotation.Configuration;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='6'/>6</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.web.servlet.config.annotation.EnableWebMvc;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='7'/>7</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.web.servlet.view.JstlView;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='8'/>8</td>
<td class="hits"/>
<td class="code">import&nbsp;org.springframework.web.servlet.view.UrlBasedViewResolver;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='9'/>9</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='10'/>10</td>
<td class="hits"/>
<td class="code">@Configuration&nbsp;//Marks&nbsp;this&nbsp;class&nbsp;as&nbsp;configuration</td>
</tr>
<tr class="noCover">
<td class="line"><a name='11'/>11</td>
<td class="hits"/>
<td class="code">//Specifies&nbsp;which&nbsp;package&nbsp;to&nbsp;scan</td>
</tr>
<tr class="noCover">
<td class="line"><a name='12'/>12</td>
<td class="hits"/>
<td class="code">@ComponentScan("com.javahash.spring")</td>
</tr>
<tr class="noCover">
<td class="line"><a name='13'/>13</td>
<td class="hits"/>
<td class="code">//Enables&nbsp;Spring's&nbsp;annotations&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='14'/>14</td>
<td class="hits"/>
<td class="code">@EnableWebMvc&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='15'/>15</td>
<td class="hits">0</td>
<td class="code">public&nbsp;class&nbsp;Config&nbsp;{&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='16'/>16</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='17'/>17</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;@Bean&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='18'/>18</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;public&nbsp;UrlBasedViewResolver&nbsp;setupViewResolver()&nbsp;{&nbsp;&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='19'/>19</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;UrlBasedViewResolver&nbsp;resolver&nbsp;=&nbsp;new&nbsp;UrlBasedViewResolver();&nbsp;&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='20'/>20</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;resolver.setPrefix("/WEB-INF/views/");&nbsp;&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='21'/>21</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;resolver.setSuffix(".jsp");&nbsp;&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='22'/>22</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;resolver.setViewClass(JstlView.class);&nbsp;&nbsp;</td>
</tr>
<tr class="coverNone">
<td class="line"><a name='23'/>23</td>
<td class="hits">0</td>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;return&nbsp;resolver;&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='24'/>24</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;&nbsp;&nbsp;}&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='25'/>25</td>
<td class="hits"/>
<td class="code">&nbsp;&nbsp;</td>
</tr>
<tr class="noCover">
<td class="line"><a name='26'/>26</td>
<td class="hits"/>
<td class="code">}&nbsp;&nbsp;</td>
</tr>
