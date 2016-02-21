** 気づいた・検討した **
1. TopページのUIが悪い
1. 登録・ログインフォームにSSLを使用していない
1. ログイン失敗時にエラー文を表示する
1. ログイン後、ホームへ戻った後もマイページへ戻れるようにする
1. 登録ページの謎言語を正しい文にする
1. カテゴリ選択の種類が多すぎる
1. registerページ以外の表示が重い（おそらくAPIのせい）
1. TOPページからどのようなサイトなのか判別しづらい
1. Musicについてアルバムが無い
1. スマホからのUIが悪い
1. 登録時の正規化（メールアドレスなど）
1. ログインしたままもう一度ログインできてしまう
1. DBのパスワードが平文になっている
** 実装内容 **
1. カテゴリTop10取得とは別にTop3取得するメソッドを追加した
1. 新規登録時にパスワードの再確認フォームと機能を追加した
1. 新規登録時のパスワードの制約を数字と英大文字、英小文字を組み合わせさせるようにした
1. ログイン後、ホームへ戻った後もマイページへ戻れるようにした
1. TopページのUI調整（無駄なリンクの削除など）